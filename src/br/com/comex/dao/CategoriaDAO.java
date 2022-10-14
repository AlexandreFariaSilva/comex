package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusDaCategoria;

public class CategoriaDAO {
	
	private Connection connection;
	
	public CategoriaDAO(Connection connection) {
		this.connection = connection;
	}
		
	public void inserir (Categoria categoria) throws SQLException {
	
		String sql = "insert into comex.categoria (nome, status) values (?, ?)";
		
		String[] colunaParaRetornar = { "id" };
		
		PreparedStatement pstm =  connection.prepareStatement(sql, colunaParaRetornar);
		pstm.setString(1, categoria.getNome());
		pstm.setString(2, categoria.getStatusString());
		
		pstm.execute();
		
		ResultSet rst = pstm.getGeneratedKeys();
		rst.next();
		categoria.setId(rst.getInt(1));
			
		}		
	
	
	public boolean deletar (Integer id) throws SQLException{
		String sql = "DELETE FROM comex.categoria WHERE id = ?";
		boolean linhadeletada = false;
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		pstm.setInt(1, id);
		pstm.execute();
		linhadeletada = pstm.executeUpdate() > 0;
		
		System.out.println(linhadeletada);
		return linhadeletada;
	}
	
	public List<Categoria> listaTodas() throws SQLException{
		String sql = "select * from comex.categoria";
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		List<Categoria> categorias = new ArrayList<>();	
		ResultSet reg = pstm.executeQuery();
		
		while(reg.next()) {
			Categoria categoria = new Categoria(reg.getString("nome"), StatusDaCategoria.valueOf(reg.getString("status")));
			categoria.setId(reg.getLong("id"));
			categorias.add(categoria);
		}
		return categorias;
	}
	public void alterar (String nome, Integer id) throws SQLException {
		
		String sql = "update comex.categoria "
				   + "   set nome = ? "
				   + " where id = ? ";
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setString(1, nome );
		pstm.setFloat(2, id);
		
		pstm.execute();
		
	}		

	
}
