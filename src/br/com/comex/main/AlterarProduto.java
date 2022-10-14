package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class AlterarProduto {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		ProdutoDAO protudoDao = new ProdutoDAO(connection);
		
		protudoDao.alterar("Percy Jackson e o Ladrão de raios", 15);
		
		
		connection.close();

	}

}
