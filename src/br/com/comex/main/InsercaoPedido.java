package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class InsercaoPedido {

	public static void main(String[] args) throws SQLException {
		
		Pedido pedido = new Pedido("14/12/2022", 12);
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		PedidoDAO pedidoDao = new PedidoDAO(connection);
		
		
		
		pedidoDao.inserir(pedido);
		
		System.out.println(pedido);
		connection.close();

	}

}
