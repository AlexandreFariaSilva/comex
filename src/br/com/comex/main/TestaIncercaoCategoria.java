package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.StatusDaCategoria;

public class TestaIncercaoCategoria {

	public static void main(String[] args) throws SQLException {
		
		Categoria cat = new Categoria("PEDRAS", StatusDaCategoria.ATIVA);
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		
		categoriaDao.inserir(cat);
		
		System.out.println(cat);
		connection.close();
	}

}
