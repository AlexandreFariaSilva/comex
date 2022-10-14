package br.com.comex.main;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estado;

public class MainCliente {

	public static void main(String[] args) {
		try {
		Cliente cliente1 = new Cliente( "Anasdasd", "111111111111", "997470909", "arnoldo golf", "42", "apartamento 2", "santa candida", "curitiba", Estado.ES);
		cliente1.imprimeCliente();
		Cliente cliente2 = new Cliente("Eliezer", "088080808080", "999999999", "aroldinho", "01", "sobrado", "santa felicidade", "pato branco",null);
		cliente2.imprimeCliente();
		Cliente cliente3 = new Cliente( "Gabriela", "0909001111122", "1111111111", "arnoldo futebol", "164", "casinha", "santa monica", "pato invisivel", Estado.AM);
		cliente3.imprimeCliente();
		}catch(IllegalArgumentException ex) {
			System.out.println("segue o erro: " + ex.getMessage());
		}
		
	}

}
