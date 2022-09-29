package comex;

public class MainPedido {
	
	public static void main(String[] args) {
		
		Cliente clientePedido1 = new Cliente(1, "Ana", "077161949411", "997470909", "arnoldo golf", "42", "apartamento 2", "santa candida", "curitiba", "PR");
		Cliente clientePedido2 = new Cliente(2, "gabi", "00000000", "123123123", "arnoldo pollo", "44", "casa 2", "santa quiteria", "colombo", "PR");
		Cliente clientePedido3 = new Cliente(3, "geraldo", "3333333333", "5555555555", "arnoldo basquete", "49", "bloco 1 ap 2", "santa maria", "colombo", "PR");
		
		Pedido pedido1 = new Pedido( "16/12/1998", clientePedido1); 
		Pedido pedido2 = new Pedido( "29/12/2000", clientePedido2); 
		Pedido pedido3 = new Pedido( "16/05/2020", clientePedido3); 
		
		pedido1.imprimePedido();
		pedido2.imprimePedido();
		pedido3.imprimePedido();
		
		
	}
	
	

}
