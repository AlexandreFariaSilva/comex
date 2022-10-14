package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.ConnectionFactory;

public class TestaAlterarCategoria {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		
		categoriaDao.alterar("LIVROS DE MECANICA", 15);
		
		
		connection.close();
	}

}
