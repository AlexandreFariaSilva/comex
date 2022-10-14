package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Pedido;

public class PedidoDAO {
	
	private Connection connection;
	
	public PedidoDAO(Connection connection) {
		this.connection = connection;
	}
	
 
	public void inserir (Pedido pedido) throws SQLException {
		
		String sql = "insert into comex.pedido (data, cliente_id) "
				+ "values (?,?)";
		
		PreparedStatement pstm =  connection.prepareStatement(sql);
		pstm.setString(1, pedido.getData());
		pstm.setInt(2, pedido.getIdCliente());

		pstm.execute();
			
		}			
	public boolean deletar (Integer id) throws SQLException{
		String sql = "DELETE FROM comex.pedido WHERE id = ?";
		boolean linhadeletada = false;
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		pstm.setInt(1, id);
		pstm.execute();
		linhadeletada = pstm.executeUpdate() > 0;
		
		System.out.println(linhadeletada);
		return linhadeletada;
	}
	public List<Pedido> listaTodas() throws SQLException{
		String sql = "select * from comex.pedido";
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		List<Pedido> pedidos = new ArrayList<>();	
		ResultSet reg = pstm.executeQuery();
		
		while(reg.next()) {
			Pedido pedido = new Pedido(reg.getString("data"),
					reg.getInt("cliente_id")
					);
			pedido.setId(reg.getInt("id"));
			pedidos.add(pedido);
		}
		return pedidos;
	}
	public void alterar (String data, Integer id) throws SQLException {
		
		String sql = "update comex.pedido "
				   + "   set data = ? "
				   + " where id = ? ";
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setString(1, data );
		pstm.setInt(2, id);
		
		pstm.execute();
	
}
	
	
	

}
