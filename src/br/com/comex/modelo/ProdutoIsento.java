package br.com.comex.modelo;

public class ProdutoIsento extends Produto{
	

		// TODO Auto-generated constructor stub
 public ProdutoIsento(long idProduto, String nome, double precoUnitario, int quantidadeEmestoque, Categoria categoriaProduto) {
	 
	 if (idProduto <= 0) {		
			throw new IllegalArgumentException("O numero do ID deve ser maior que 0");
			
		}if (nome.length() <= 5) {
			
			throw new IllegalArgumentException("O nome do produto deve conter mais que 5 caracteres");
			
		}if (precoUnitario  <= 0 ) {
			throw new IllegalArgumentException("O valor unitario deve ser maior que 0");
			
		}if (quantidadeEmestoque <= 0) {
			throw new IllegalArgumentException("A quantidade em estoque deve ser maior que 0");
			
		}if (categoriaProduto == null) {
			
			throw new IllegalArgumentException("A categoria não pode ser nula");
			
		}
		this.idProduto = idProduto;
		this.categoriaProduto = categoriaProduto;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidadeEmEstoque = quantidadeEmestoque;
		
	 
	 
 }

public double calculaValorTotalEmEstoque() {
		
	    double calculaEstoque =  quantidadeEmEstoque * precoUnitario;
		
		return calculaEstoque;
	
	}
	
	public double calculaImposto() {
		
		double valorImposto  = 0;
		
		return valorImposto;
		
		
	}
	
	
}
