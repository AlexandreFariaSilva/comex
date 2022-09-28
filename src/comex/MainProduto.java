package comex;

public class MainProduto {
	
	public static void main(String[] args) {
		
	 
	 Produto produto1 = new Produto();
	 
	 produto1.setNome("Notebook Samsung");
	 produto1.setPrecoUnitario(3523.00);
	 produto1.setQuantidadeEmEstoque(1);
	 produto1.setCategoriaProduto(new Categoria());
	 produto1.getCategoriaProduto().setNome("Informatica");
	 produto1.calculaValorTotalEmEstoque();
	 produto1.calculaImposto();
	 
	 ProdutoIsento produto2 = new ProdutoIsento();
	 
	 produto2.setNome("Clean Architecture");
	 produto2.setPrecoUnitario(102.90);
	 produto2.setQuantidadeEmEstoque(2);
	 produto2.setCategoriaProduto(new Categoria());
	 produto2.getCategoriaProduto().setNome("Livros");
	 produto2.calculaValorTotalEmEstoque();
	 produto2.calculaImposto();
	
	 
	 
	 
	 Produto produto3 = new Produto();
	 produto3.setIdProduto(3);
	 produto3.setNome("Monitor Dell 27");
	 produto3.setPrecoUnitario(1889.00);
	 produto3.setQuantidadeEmEstoque(3);
	 produto3.setCategoriaProduto(new Categoria());
	 produto3.getCategoriaProduto().setNome("Informatica");
	 produto3.calculaImposto();
	 

	 
	 System.out.println("Numero do produto: " + produto1.getIdProduto()); 
	 System.out.println("Preço unitário: " + produto1.getPrecoUnitario());
	 System.out.println("Quantidade em estoque: " + produto1.getQuantidadeEmEstoque());
	 System.out.println("Nome do produto: " + produto1.getNome());
	 System.out.println("Categoria: " + produto1.getCategoriaProduto().getNome());
	 System.out.println("O Valor do em estoque: " + produto1.calculaValorTotalEmEstoque());
	 System.out.println("Valor do imposto sobre o produto: " + produto1.calculaImposto());
	 System.out.println("--------------------------------------------------------");
	 
	 System.out.println("Numero do produto: " + produto2.getIdProduto()); 
	 System.out.println("Preço unitário: " + produto2.getPrecoUnitario());
	 System.out.println("Quantidade em estoque: " + produto2.getQuantidadeEmEstoque());
	 System.out.println("Nome do produto: " + produto2.getNome());
	 System.out.println("Categoria: " + produto2.getCategoriaProduto().getNome());
	 System.out.println("O Valor do em estoque: " + produto2.calculaValorTotalEmEstoque());
	 System.out.println("Valor do imposto sobre o produto: " + produto2.calculaImposto());
	 System.out.println("--------------------------------------------------------");
	 
	 System.out.println("Numero do produto: " + produto3.getIdProduto()); 
	 System.out.println("Preço unitário: " + produto3.getPrecoUnitario());
	 System.out.println("Quantidade em estoque: " + produto3.getQuantidadeEmEstoque());
	 System.out.println("Nome do produto: " + produto3.getNome());
	 System.out.println("Categoria: " + produto3.getCategoriaProduto().getNome());
	 System.out.println("O Valor do em estoque: " + produto3.calculaValorTotalEmEstoque());
	 System.out.println("Valor do imposto sobre o produto: " + produto3.calculaImposto());
	 System.out.println("--------------------------------------------------------");
	}

}
