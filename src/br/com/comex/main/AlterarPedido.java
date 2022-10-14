package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class AlterarPedido {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		PedidoDAO pedidoDao = new PedidoDAO(connection);
		
		pedidoDao.alterar("12/12/1998", 8);
		
		
		connection.close();


	}

}
