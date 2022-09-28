package comex;

public class MainItemPedido {
	
	public static void main(String[] args) {
		//Produto itemcomprado = new Produto();
		Cliente clientePedido1 = new Cliente(1, "Ana", "077161949411", "997470909", "arnoldo golf", "42", "apartamento 2", "santa candida", "curitiba", "PR");
		ItemPedido pedidoDeProduto1 = new ItemPedido(11, "QUANTIDADE", 1 );
		
		pedidoDeProduto1.setNome("Notebook Dell 28'");
		pedidoDeProduto1.setPrecoUnitario(1550.0);
		pedidoDeProduto1.precoTotalSemDescontos();
		
		System.out.println("Olá " + clientePedido1.getNome() + "\nSeu pedido é o numero: " + pedidoDeProduto1.getIdDoPedido() + "\nProduto: " + pedidoDeProduto1.getNome());
		System.out.println("Está pronto! A baixo segue as informações de preço e desconto");
		System.out.println("Produto sem desconto: " + pedidoDeProduto1.precoTotalSemDescontos());
		System.out.println("Seu desconto total é: " + pedidoDeProduto1.calculaDesconto());
		System.out.println("---------------------------------------------------------------------------------------");
	
	
		Cliente clientePedido2 = new Cliente(1, "Rogerio", "077161949411", "997470909", "arnoldo golf", "42", "CASA", "santa candida", "Natal", "SC");
		ItemPedido pedidoDeProduto2 = new ItemPedido(4, "PROMOCAO", 1 );
		
		pedidoDeProduto2.setNome("LIVRO ANTROPOLOGICO");
		pedidoDeProduto2.setPrecoUnitario(15.0);
		pedidoDeProduto2.precoTotalSemDescontos();
		
		System.out.println("Olá " + clientePedido2.getNome() + "\nSeu pedido é o numero: " + pedidoDeProduto2.getIdDoPedido() + "\nProduto: " + pedidoDeProduto2.getNome());
		System.out.println("Está pronto! A baixo segue as informações de preço e desconto");
		System.out.println("Produto sem desconto: " + pedidoDeProduto2.precoTotalSemDescontos());
		System.out.println("Seu desconto total é: " + pedidoDeProduto2.calculaDesconto());
		System.out.println("---------------------------------------------------------------------------------------");
	
		Cliente clientePedido3 = new Cliente(1, "Claudio", "077161949411", "997470909", "arnoldo golf", "42", "apartamento 2", "santa candida", "curitiba", "PR");
		ItemPedido pedidoDeProduto3 = new ItemPedido(4, "NENHUM", 3 );
		
		pedidoDeProduto3.setNome("MESA GAMER");
		pedidoDeProduto3.setPrecoUnitario(1000.0);
		pedidoDeProduto3.precoTotalSemDescontos();
		
		System.out.println("Olá " + clientePedido3.getNome() + "\nSeu pedido é o numero: " + pedidoDeProduto3.getIdDoPedido() + "\nProduto: " + pedidoDeProduto3.getNome());
		System.out.println("Está pronto! A baixo segue as informações de preço e desconto");
		System.out.println("Produto sem desconto: " + pedidoDeProduto3.precoTotalSemDescontos());
		System.out.println("Seu desconto total é: " + pedidoDeProduto3.calculaDesconto());
		System.out.println("---------------------------------------------------------------------------------------");
	
		
	}

}
