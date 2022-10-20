package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Produto;

public class ProdutoDAO {
private Connection connection;
	
	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}
	
	
	public void inserir (Produto produto) throws SQLException{
		
		String sql = "insert into comex.produto (nome, descricao, "
				+ "preco_unitario, "
				+ "quantidade_estoque, "
				+ "categoria_id, tipo) values (?,?,?,?,?,?)";
	
		String[] colunaParaRetornar = { "id" };
		
		PreparedStatement pstm =  connection.prepareStatement(sql, colunaParaRetornar);
		pstm.setString(1, produto.getNome());
		pstm.setString(2, produto.getDescricao());
		pstm.setDouble(3, produto.getPrecoUnitario());
		pstm.setInt(4, produto.getQuantidadeEmEstoque());
		pstm.setLong(5, produto.getIdCategoria());
		pstm.setString(6, produto.getTipo());
	
		pstm.execute();
		
		ResultSet rst = pstm.getGeneratedKeys();
		rst.next();
		produto.setIdProduto(rst.getInt(1));
			
	}
	
	public boolean deletar (Integer id) throws SQLException{
		String sql = "DELETE FROM comex.produto WHERE id = ?";
		
		boolean linhadeletada = false;
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		pstm.setInt(1, id);
		pstm.execute();
		linhadeletada = pstm.executeUpdate() > 0;
		
		System.out.println(linhadeletada);
		return linhadeletada;
	}
	public List<Produto> listaTodas() throws SQLException{
		String sql = "select * from comex.produto";
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		List<Produto> produtos = new ArrayList<>();	
		ResultSet reg = pstm.executeQuery();
		
		while(reg.next()) {
			Produto produto = new Produto(reg.getString("nome"), reg.getString("descricao"),reg.getDouble("preco_unitario")
					,reg.getInt("quantidade_estoque"), reg.getString("tipo")
					,reg.getInt("categoria_id"));
			produto.setIdProduto(reg.getInt("id"));
			produtos.add(produto);
		}
		return produtos;
	}
	public void alterar (String nome, Integer id) throws SQLException {
		
		String sql = "update comex.produto "
				   + "   set nome = ? "
				   + " where id = ? ";
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setString(1, nome );
		pstm.setFloat(2, id);
		
		pstm.execute();
		
	}		
}
