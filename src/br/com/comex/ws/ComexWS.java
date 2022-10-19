package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

@WebService

public class ComexWS {
	
	Connection connection = new ConnectionFactory().recuperarConexao();
	
	public List<Categoria> getCategorias() throws SQLException{
		
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		List<Categoria> listaDeCategoria = categoriaDao.listaTodas();

		return listaDeCategoria;
		
	}
	
	public Categoria adicionarCategoria(Categoria categoria) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		//CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		
		new CategoriaDAO(connection).inserir(categoria);
		
		return categoria;
		
	}
	

	


}
