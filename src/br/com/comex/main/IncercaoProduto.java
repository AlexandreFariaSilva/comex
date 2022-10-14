package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class IncercaoProduto {
	public static void main(String[] args) throws SQLException {
		
		Produto produto = new Produto("Sofa-cama","ESTOFADO",2500, 1,"NAO_ISENTO");
		
		Connection connection = new ConnectionFactory().recuperarConexao();
		ProdutoDAO produtoDao = new ProdutoDAO(connection);
		
		produtoDao.inserir(produto);
		System.out.println(produto);
		connection.close();

	}

}
