package br.com.comex.main;

import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(1, "Ana", "077161949411", "997470909", "arnoldo golf", "42", "apartamento 2", "santa candida", "curitiba", "PR");
		Cliente cliente2 = new Cliente(2, "Eli", "088080808080", "999999999", "arnoldo basquete", "82", "sobrado", "santa felicidade", "pato branco", "PR");
		Cliente cliente3 = new Cliente(3, "Gabi", "09099090909", "1111111111", "arnoldo futebol", "164", "casinha", "santa monica", "pato invisivel", "PR");
		
		cliente1.imprimeCliente();
		cliente2.imprimeCliente();
		cliente3.imprimeCliente();
		
		
	}

}
