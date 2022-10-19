package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estado;

public class ClienteDAO {

	private Connection connection;
	
	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void inserir (Cliente cliente) throws SQLException {
		
		String sql = "insert into comex.cliente (nome, cpf, telefone, rua, numero, complemento, bairro, cidade, uf) "
				+ "values (?,?,?,?,?,?,?,?,?)";
		
		String[] colunaParaRetornar = { "id" };
		
		PreparedStatement pstm =  connection.prepareStatement(sql, colunaParaRetornar);
		pstm.setString(1, cliente.getNome());
		pstm.setString(2, cliente.getCpf());
		pstm.setString(3, cliente.getTelefone());
		pstm.setString(4, cliente.getRua());
		pstm.setString(5, cliente.getNumeroEndereco());
		pstm.setString(6, cliente.getComplemento());
		pstm.setString(7, cliente.getBairro());
		pstm.setString(8, cliente.getCidade());
		pstm.setString(9, cliente.getEstadoString());
		
		pstm.execute();
		
		ResultSet rst = pstm.getGeneratedKeys();
		rst.next();
		cliente.setId(rst.getInt(1));
			
		}		
	public boolean deletar (Integer id) throws SQLException{
		String sql = "DELETE FROM comex.cliente WHERE id = ?";
		boolean linhadeletada = false;
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		pstm.setInt(1, id);
		pstm.execute();
		linhadeletada = pstm.executeUpdate() > 0;
		
		System.out.println(linhadeletada);
		return linhadeletada;
	}
	public List<Cliente> listaTodas() throws SQLException{
		String sql = "select * from comex.cliente";
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		List<Cliente> clientes = new ArrayList<>();	
		ResultSet reg = pstm.executeQuery();
		
		while(reg.next()) {
			Cliente cliente = new Cliente(reg.getString("nome"),
					reg.getString("cpf"),
					reg.getString("telefone"),
					reg.getString("rua"),
					reg.getString("numero"),
					reg.getString("complemento"),
					reg.getString("bairro"),
					reg.getString("cidade"),
					Estado.valueOf(reg.getString("uf")));
			clientes.add(cliente);
		}
		return clientes;
	}
	
		public void alterar (String nome, Integer id) throws SQLException {
			
			String sql = "update comex.cliente "
					   + "   set nome = ? "
					   + " where id = ? ";
			
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, nome );
			pstm.setFloat(2, id);
			
			pstm.execute();
		
	}
		
		public Cliente buscaPorId(Integer id) throws SQLException{
			String sql = "select * from comex.cliente where id = ?";
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setInt(1, id);
			
			ResultSet reg = pstm.executeQuery();
			
			if(reg.next()) {
				Cliente cliente = new Cliente(reg.getString("nome"),
						reg.getString("cpf"),
						reg.getString("telefone"),
						reg.getString("rua"),
						reg.getString("numero"),
						reg.getString("complemento"),
						reg.getString("bairro"),
						reg.getString("cidade"),
						Estado.valueOf(reg.getString("uf")));
				cliente.setId(reg.getInt("id"));
				return cliente;
			}
			return null;
		}

}
