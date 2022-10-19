package br.com.comex.csv;

import java.util.ArrayList;
import java.util.List;

public class TotalCategorias {

	public int totalDeCategorias (List<PedidoCsv> categoria){
	 List<String> totalCategorias = new ArrayList<>();
		
		for(PedidoCsv categorias : categoria) {
			
			String cat = categorias.getCategoria(); 
		
			if (!totalCategorias.contains(cat)) { 
				totalCategorias.add(cat);
			}
			
	}    
		System.out.println("As Categorias distintas são: " + totalCategorias.size());
		return totalCategorias.size();
		
	}
		
}
	
	

