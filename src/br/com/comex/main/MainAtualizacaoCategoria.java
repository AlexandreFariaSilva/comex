package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String nome = "LIVROS TÉCNICOS";
		//String status = "ATIVA";
		
		ConnectionFactory connectionFactory  = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("UPDATE comex.categoria SET nome = ? WHERE id = 12");
		stm.setString(1, nome);
		//stm.setString(2, status);
		stm.execute();
		
		
		stm.close();
		connection.close();
		

	}

}
