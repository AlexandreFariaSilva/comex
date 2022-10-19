package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
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
	
	public List<Cliente> getCliente() throws SQLException{
		
		ClienteDAO clienteDao = new ClienteDAO(connection);
		List<Cliente> listaDeCliente = clienteDao.listaTodas();

		return listaDeCliente;
		
	}


}
