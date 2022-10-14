package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.ItemPedido;

	public class ItemPedidoDAO {
	
		private Connection connection;
	
	public ItemPedidoDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void inserir (ItemPedido itemPedido) throws SQLException {
		
		String sql = "insert into comex.item_pedido (preco_unitario, quantidade, produto_id, pedido_id,desconto,tipo_desconto ) "
				+ "values (?,?,?,?,?,?)";
		
		PreparedStatement pstm =  connection.prepareStatement(sql);
		pstm.setDouble(1, itemPedido.getPrecoUnitario());
		pstm.setInt(2, itemPedido.getQuantidadeDoPedido());
		pstm.setFloat(3, itemPedido.getIdDoProduto());
		pstm.setFloat(4, itemPedido.getIdDoPedido());
		pstm.setDouble(5, itemPedido.getDesconto());
		pstm.setString(6, itemPedido.getTipoDoDesconto());

		pstm.execute();
			
		}			
	public boolean deletar (Integer id) throws SQLException{
		String sql = "DELETE FROM comex.item_pedido WHERE id = ?";
		boolean linhadeletada = false;
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		pstm.setInt(1, id);
		pstm.execute();
		linhadeletada = pstm.executeUpdate() > 0;
		
		System.out.println(linhadeletada);
		return linhadeletada;
	}
	public List<ItemPedido> listaTodas() throws SQLException{
		String sql = "select * from comex.item_pedido";
		PreparedStatement pstm = connection.prepareStatement(sql);
		
		List<ItemPedido> itemPedidos = new ArrayList<>();	
		ResultSet reg = pstm.executeQuery();
		
		while(reg.next()) {
			ItemPedido itemPedido = new ItemPedido(reg.getDouble("preco_unitario"),
					reg.getInt("produto_id"),
					reg.getInt("quantidade"),
					reg.getString("tipo_desconto"),
					reg.getInt("pedido_id")
					);
			itemPedido.setId(reg.getInt("id"));
			itemPedidos.add(itemPedido);
		}
		return itemPedidos;
	}

	public void alterar (Double preco, Integer id) throws SQLException {
		
		String sql = "update comex.item_pedido "
				   + "   set preco_unitario = ? "
				   + " where id = ? ";
		
		PreparedStatement pstm = connection.prepareStatement(sql);
		pstm.setDouble(1, preco);
		pstm.setInt(2, id);
		
		pstm.execute();
	
}

}
