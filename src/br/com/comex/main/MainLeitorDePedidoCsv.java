package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.TotalProdutosVendidos;

public class MainLeitorDePedidoCsv {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
	List<PedidoCsv> pedidoCsv = leitorPedidosCsv.leituraPedidosCsv();
	leitorPedidosCsv.leituraPedidosCsv();
	System.out.println("O total de pedidos é: " + pedidoCsv.size());
	
	TotalProdutosVendidos totalDeProdutos = new TotalProdutosVendidos();
	totalDeProdutos.totalDeProdutosVendidos(pedidoCsv);
	

	}
	}
