package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;

public class ListaClientes {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ClienteDAO clienteDao = new ClienteDAO(connection);
		List<Cliente> listaDeCliente = clienteDao.listaTodas();
		
		for (Cliente cliente : listaDeCliente) {
			System.out.println(cliente);
		}
		
		connection.close();

	}
	

}
