package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionFactory connectionFactory  = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT * FROM CATEGORIA");
		ResultSet rst = stm.getResultSet();
		
		
		while(rst.next()) {
			Integer id = rst.getInt("id");
			System.out.println(id);
			String nome = rst.getString("nome");
			System.out.println(nome);
			String status = rst.getString("status");
			System.out.println(status);
			
			
		}
connection.close();
	}
	}


