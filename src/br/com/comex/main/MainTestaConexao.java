package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method st
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		
		System.out.println("Conexão efetuada");
		connection.close();
	}

}
