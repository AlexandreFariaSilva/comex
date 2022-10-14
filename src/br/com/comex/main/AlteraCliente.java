package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.ConnectionFactory;

public class AlteraCliente {

	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		ClienteDAO clienteDao = new ClienteDAO(connection);
		
		clienteDao.alterar("Alura", 12);
		
		
		connection.close();

	}
	
}
