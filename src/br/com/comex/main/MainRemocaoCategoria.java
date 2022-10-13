package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		//String nome = "LIVROS TÉCNICOS";
		String status = "INATIVA";
		
		ConnectionFactory connectionFactory  = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM comex.categoria WHERE status = ?");
		//stm.setString(1, nome);
		stm.setString(1, status);
		stm.execute();
		
		
		stm.close();
		connection.close();
		

	}

}
