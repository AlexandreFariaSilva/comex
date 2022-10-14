package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Estado;

public class InsercaoCliente {

	public static void main(String[] args) throws SQLException {
		Cliente cliente = new Cliente("Pedro", "677.777.888-44", "41997470913", "tibagi", "321", "apartamento 2", "Santa Felicidade", "Curitiba", Estado.PR);
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		ClienteDAO clienteDao = new ClienteDAO(connection);
		
		clienteDao.inserir(cliente);
		
		System.out.println(cliente);
		connection.close();
	}
	

}
