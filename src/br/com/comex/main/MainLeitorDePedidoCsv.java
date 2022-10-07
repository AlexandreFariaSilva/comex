package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.MontanteTotalVendas;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.TotalCategorias;
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
	
	//Calulando total de categorias distintas do pedidos.csv
	TotalCategorias totalCategoria = new TotalCategorias();
	totalCategoria.totalDeCategorias(pedidoCsv);
	
	//Montante total de Vendas do pedidos.csv
	MontanteTotalVendas totalVendas = new MontanteTotalVendas();
	totalVendas.montanteTotalDeVendas(pedidoCsv);
	

	}
	}
