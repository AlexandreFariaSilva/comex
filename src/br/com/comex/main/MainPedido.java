package br.com.comex.main;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estado;
import br.com.comex.modelo.Pedido;

public class MainPedido {
	
	public static void main(String[] args) {
		
		new Cliente("gabriela", "077161949411", "997470909", "arnoldo golf", "42", "apartamento 2", "santa candida", "curitiba",Estado.MG);
		new Cliente( "garbriel", "00000222000", "123123123", "arnoldo pollo", "44", "casa 2", "santa quiteria", "colombo",Estado.MG);
		new Cliente( "geraldo", "3333222333333", "5555555555", "arnoldo basquete", "49", "bloco 1 ap 2", "santa maria", "colombo",Estado.MG);
		
		Pedido pedido1 = new Pedido( "16/12/1998", 1); 
		Pedido pedido2 = new Pedido( "29/12/2000", 4); 
		Pedido pedido3 = new Pedido( "16/05/2020", 6); 
		
		pedido1.imprimePedido();
		pedido2.imprimePedido();
		pedido3.imprimePedido();
		
		
	}
	
	

}
