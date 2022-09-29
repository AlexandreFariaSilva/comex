package br.com.comex.modelo;

public class Pedido {
	
	private static long count = 0;
	private long id;
	private String data;
	private Cliente cliente;
	
	
	public Pedido (String data, Cliente cliente) {
		id = ++count;
		
		this.data = data;
	    this.cliente = cliente;
	  
		
	}
	
	
	public long getId() {
		return id;
	}
	public String getData() {
		return data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public void imprimePedido() {
		
		System.out.println("Numero do pedido: " + id + "\nData do pedido: " + data + "\nNome do Cliete: " + cliente.getNome() + "\n--------------------------------------------------------" );
		
		
		
	}
	
	
	
	
	

}
