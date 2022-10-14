package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class ListagemProduto {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		ProdutoDAO produtoDao = new ProdutoDAO(connection);
		List<Produto> listaDeProduto = produtoDao.listaTodas();
		
		for (Produto produto : listaDeProduto) {
			System.out.println(produto);
		}
		
		connection.close();

	}

}
