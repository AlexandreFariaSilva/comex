package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusDaCategoria;

public class MainCategoria {

	public static void main(String[] args) {
	
		Categoria categoria1 = new Categoria("INFORMATICA",StatusDaCategoria.INATIVA );
	
	
		
		Categoria categoria2 = new Categoria( "Moveis",StatusDaCategoria.ATIVA);
	
		
		
		Categoria categoria3 = new Categoria( "livros",StatusDaCategoria.ATIVA );
	
		
		
		
		
		
		
		
	
		
		System.out.println("CATEGORIA " + categoria1.getNome() + "(" + categoria1.getId()+" - " + categoria1.getStatus() + ")");
		System.out.println("CATEGORIA " + categoria2.getNome() + "(" + categoria2.getId()+" - " + categoria2.getStatus() + ")");
		System.out.println("CATEGORIA " + categoria3.getNome() + "(" + categoria3.getId()+" - " + categoria3.getStatus() + ")");
		
		
		
	}
}
