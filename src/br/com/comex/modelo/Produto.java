package br.com.comex.modelo;

public class Produto {
	
	private static long count = 0;
	protected long idProduto;
	protected  String nome;
	protected  String descricao;
	protected double precoUnitario;
	protected int quantidadeEmEstoque;
	protected Categoria categoriaProduto;
	
	public Produto() {
		
		idProduto = ++count;
		
	}
	public Produto (long idProduto, String nome, double precoUnitario, int quantidadeEmestoque, Categoria categoriaProduto)  {
	
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
	
	
	
	private Exception IllegalArgumentException(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoUnitario() {
		
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQuantidadeEmEstoque() {
		
		//System.out.println("Valor total em estoque: " + quantidadeEmEstoque * precoUnitario);
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	public Categoria getCategoriaProduto() {
		return categoriaProduto;
	}
	public void setCategoriaProduto(Categoria categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
	
	public double calculaValorTotalEmEstoque() {
		
	    double calculaEstoque =  quantidadeEmEstoque * precoUnitario;
		
		return calculaEstoque;
	
	}
	
	public double calculaImposto() {
		
		double valorImposto  = 0.4 * precoUnitario;
		
		return valorImposto;
		
	}
	
	
}
	