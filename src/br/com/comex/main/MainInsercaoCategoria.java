package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		
		String nome = "LIVROS";
		String status = "ATIVA";
		
		ConnectionFactory connectionFactory  = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("insert into comex.categoria (nome, status) values (?, ?)");
		stm.setString(1, nome);
		stm.setString(2, status);
		stm.execute();
		
		
		stm.close();
		connection.close();
		
}
}
