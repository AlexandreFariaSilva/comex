package br.com.comex.csv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidosCsv {
		
		
		public List<PedidoCsv> leituraPedidosCsv() throws FileNotFoundException{
			List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();
			
			InputStream fis =  new FileInputStream("pedidos.csv");
			Scanner scanner = new Scanner(fis);
			scanner.nextLine();
			//int count = 0;
			
			while(scanner.hasNextLine()) {
				
				String linha = scanner.nextLine();
				String[] valores = linha.split(",");
				String categoria = valores[0];
				String produto = valores[1];
				String preco = valores[2];
				String cliente = valores[5];
				String quantidade = valores [3];
				String data = valores[4];
				PedidoCsv pedido = new PedidoCsv(categoria,produto,cliente,preco,quantidade,data);
				pedidos.add(pedido);
			//	count++;
				
			}
			//System.out.println("O numero total de Pedidos: " + count);
		
			
			scanner.close();
			
			return pedidos;
		}
		
	
		
	}


