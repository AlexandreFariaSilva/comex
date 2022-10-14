package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

public class TestaListagemCategoria {

	public static void main(String[] args) throws SQLException {
	
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		List<Categoria> listaDeCategoria = categoriaDao.listaTodas();
		
		for (Categoria categoria : listaDeCategoria) {
			System.out.println(categoria);
		}
		
		connection.close();
		
	}
}
