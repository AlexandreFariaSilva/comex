package br.com.comex.csv;

import java.util.ArrayList;
import java.util.List;

public class MontanteTotalVendas {

	public double montanteTotalDeVendas (List<PedidoCsv> vendas) {
	List<Double> totalVendido = new ArrayList<>();
	 double calculo = 0;
	 
		for(PedidoCsv venda : vendas) {
			
			double ttv1 = Double.parseDouble(venda.getPreco())* Double.parseDouble(venda.getQuantidade());
			calculo = calculo+ttv1;
			
		}
		
		System.out.println("Montante de vendas:  " + calculo) ;
			 	
		return totalVendido.size();	

	}
	

}
