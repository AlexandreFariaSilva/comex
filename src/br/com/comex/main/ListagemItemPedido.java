package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;


public class ListagemItemPedido {

	public static void main(String[] args) throws SQLException {

		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ItemPedidoDAO itemPedidoDao = new ItemPedidoDAO(connection);
		List<ItemPedido> listaDeItemPedido = itemPedidoDao.listaTodas();
		
		for (ItemPedido itemPedido : listaDeItemPedido) {
			System.out.println(itemPedido);
		}
		
		connection.close();

	}

}
