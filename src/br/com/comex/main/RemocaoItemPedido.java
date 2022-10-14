package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class RemocaoItemPedido {
	
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		ItemPedidoDAO itemPedidoDao = new ItemPedidoDAO(connection);
		
		
		itemPedidoDao.deletar(11);
		
		connection.close();
	}
	

}
