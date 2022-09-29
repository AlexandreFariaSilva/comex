package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;
import br.com.comex.modelo.StatusDaCategoria;

public class MainProduto {
	
	public static void main(String[] args) {
	
	 
	 
	 Produto produto1 = new Produto(24,"Notebook Samsung",3250.00,1, new Categoria(1, "informatica", StatusDaCategoria.ATIVADO));
	 
	 //produto1.setNome("Notebook Samsung");
	// produto1.setPrecoUnitario(3523.00);
	// produto1.setQuantidadeEmEstoque(1);
	 //produto1.setCategoriaProduto(new Categoria(1, "informatica", StatusDaCategoria.ATIVADO));
	 produto1.calculaValorTotalEmEstoque();
	 produto1.calculaImposto();
	 
	 System.out.println("Numero do produto: " + produto1.getIdProduto()); 
	 System.out.println("Preço unitário: " + produto1.getPrecoUnitario());
	 System.out.println("Quantidade em estoque: " + produto1.getQuantidadeEmEstoque());
     System.out.println("Nome do produto: " + produto1.getNome());
	 System.out.println("Categoria: " + produto1.getCategoriaProduto().getNome());
	 System.out.println("O Valor do em estoque: " + produto1.calculaValorTotalEmEstoque());
	 System.out.println("Valor do imposto sobre o produto: " + produto1.calculaImposto());
	 System.out.println("--------------------------------------------------------");
	
		
	
		 
	
	 ProdutoIsento produto2 = new ProdutoIsento(24,"Per",35.00,1, new Categoria(1, "informatica", StatusDaCategoria.DESATIVADO));
	 
	 produto2.setCategoriaProduto(new Categoria(2, "Livros", StatusDaCategoria.ATIVADO));
	
	 produto2.calculaValorTotalEmEstoque();
	 produto2.calculaImposto();
	 
	 System.out.println("Numero do produto: " + produto2.getIdProduto()); 
	 System.out.println("Preço unitário: " + produto2.getPrecoUnitario());
	 System.out.println("Quantidade em estoque: " + produto2.getQuantidadeEmEstoque());
	 System.out.println("Nome do produto: " + produto2.getNome());
	 System.out.println("Categoria: " + produto2.getCategoriaProduto().getNome());
	 System.out.println("O Valor do em estoque: " + produto2.calculaValorTotalEmEstoque());
	 System.out.println("Valor do imposto sobre o produto: " + produto2.calculaImposto());
	 System.out.println("--------------------------------------------------------");
	 
	 
	
		 
	 
	 
	
	 
	 Produto produto3 = new Produto(24,"MONITOR DELL",1000, 2, new Categoria(2, "informatica", StatusDaCategoria.ATIVADO));
	 produto3.calculaImposto();
	
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
