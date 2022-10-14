package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;

public class InsercaoItemPedido {

	public static void main(String[] args) throws SQLException {
		;
		ItemPedido itemPedido = new ItemPedido(35.40,15,3, "NENHUM", 8 );
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		ItemPedidoDAO itemPedidoDao = new ItemPedidoDAO(connection);
		
		
		
		itemPedidoDao.inserir(itemPedido);
		
		System.out.println(itemPedido);
		connection.close();


	}

}
