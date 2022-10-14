package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class ListagemPedido {

	
	public static void main(String[] args) throws SQLException {

		Connection connection = new ConnectionFactory().recuperarConexao();
		
		PedidoDAO pedidoDao = new PedidoDAO(connection);
		List<Pedido> listaDePedido = pedidoDao.listaTodas();
		
		for (Pedido pedido : listaDePedido) {
			System.out.println(pedido);
		}
		
		connection.close();

}
}
