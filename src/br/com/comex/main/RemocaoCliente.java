package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.ConnectionFactory;

public class RemocaoCliente {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		ClienteDAO clienteDao = new ClienteDAO(connection);
		
		clienteDao.deletar(8);
		
		connection.close();
	}


}
