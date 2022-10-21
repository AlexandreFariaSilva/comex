package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

@WebService

public class ComexWS {
	
	Connection connection = new ConnectionFactory().recuperarConexao();
	@WebMethod(operationName = "getCategorias")
	@WebResult(name = "listarCategorias")
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
	//listando cliente
	public List<Cliente> getCliente() throws SQLException{
		
		ClienteDAO clienteDao = new ClienteDAO(connection);
		List<Cliente> listaDeCliente = clienteDao.listaTodas();

		return listaDeCliente;
		
	}
	
	public Cliente adicionarCliente(Cliente cliente) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		//CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		
		new ClienteDAO(connection).inserir(cliente);
		
		return cliente;
		
	}
	
	public List<Produto> getProduto() throws SQLException{
		
		ProdutoDAO produtoDao = new ProdutoDAO(connection);
		List<Produto> listaDeProduto = produtoDao.listaTodas();

		return listaDeProduto;
		
	}

}
