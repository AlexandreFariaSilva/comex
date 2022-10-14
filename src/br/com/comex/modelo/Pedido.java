package br.com.comex.modelo;

public class Pedido {
	
	
	private Integer id;
	private String data;
	private Cliente cliente;
	private Integer idCliente;
	
	
	


	public Pedido (String data, Integer idCliente) {
		id = ++count;
		
		this.data = data;
	    this.idCliente = idCliente;
	    
	    if(getIdCliente() == null) {
	    	throw new ComexException("O nome do cliente não pode ser nulo ");
	    }
	    
		
	}
	
	
	public long getId() {
		return id;
	}
	private static int count = 0;
	public void setId(Integer id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	public void imprimePedido() {
		
		System.out.println("Numero do pedido: " + id + "\nData do pedido: " + data + "\nNome do Cliete: " + cliente.getNome() + "\n--------------------------------------------------------" );
		
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", cliente=" + cliente + ", idCliente=" + idCliente + "]";
	}
	

	

}
