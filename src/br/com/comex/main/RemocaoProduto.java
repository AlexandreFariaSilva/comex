package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class RemocaoProduto {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperarConexao();
		ProdutoDAO produtoDao = new ProdutoDAO(connection);
		
		produtoDao.deletar(14);
		connection.close();

	}

}
