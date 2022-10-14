package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class AlterarItemPedido {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		ItemPedidoDAO itemPedidoDao = new ItemPedidoDAO(connection);
		
		itemPedidoDao.alterar(500.00, 12);
		
		
		connection.close();

		
		
	}

}
