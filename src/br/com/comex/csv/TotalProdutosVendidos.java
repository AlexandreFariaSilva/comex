package br.com.comex.csv;

import java.util.List;

public class TotalProdutosVendidos {
	
	public int totalDeProdutosVendidos (List<PedidoCsv> pedidos) {
		int somaProdutos = 0;
		for (PedidoCsv pedido : pedidos) {
			somaProdutos = somaProdutos + Integer.parseInt(pedido.getQuantidade());
			
			
		}
		System.out.println("Total de produtos vendidos: " + somaProdutos);
		return somaProdutos;
	}
	
}

	

