package br.com.comex.main;

import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		try {
		Cliente cliente1 = new Cliente(1, "Anagabriela", "111111111111", "997470909", "arnoldo golf", "42", "apartamento 2", "santa candida", "curitiba", "PR");
		cliente1.imprimeCliente();
		Cliente cliente2 = new Cliente(2, "Eliezer", "088080808080", "999999999", "ar", "01", "sobrado", "santa felicidade", "pato branco", "PR");
		cliente2.imprimeCliente();
		Cliente cliente3 = new Cliente(3, "Gabriela", "0909001111122", "1111111111", "arnoldo futebol", "164", "casinha", "santa monica", "pato invisivel", "PR");
		cliente3.imprimeCliente();
		}catch(IllegalArgumentException ex) {
			System.out.println("segue o erro: " + ex.getMessage());
		}
		
	}

}
