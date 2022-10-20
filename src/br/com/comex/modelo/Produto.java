package br.com.comex.modelo;

public class Produto {
	
	private static Integer count = 0;
	protected Integer idProduto;
	protected  String nome;
	protected  String descricao;
	protected double precoUnitario;
	protected int quantidadeEmEstoque;
	protected Categoria categoriaProduto;
	protected String tipo;
	protected Integer idCategoria;
	
	
	public Produto() {
		
		idProduto = ++count;
		
	}
	public Produto ( String nome, String descricao ,double precoUnitario, int quantidadeEmestoque , String tipo, Integer idCategoria)  {
	//	if (idProduto <= 0) {		
		//	throw new IllegalArgumentException("O numero do ID deve ser maior que 0");
		//	
		//}
		
		//if (nome.length() <= 5) {
			
		//	throw new IllegalArgumentException("O nome do produto deve conter mais que 5 caracteres");
		//	
	//	}if (precoUnitario  <= 0 ) {
	///		throw new IllegalArgumentException("O valor unitario deve ser maior que 0");
			
	//	}if (quantidadeEmestoque <= 0) {
	//		throw new IllegalArgumentException("A quantidade em estoque deve ser maior que 0");
			
		//}
		//if (categoriaProduto == null) {
		//	
		//	throw new IllegalArgumentException("A categoria não pode ser nula");
		//	
		//}
		
		//this.categoriaProduto = categoriaProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEmEstoque = quantidadeEmestoque;
		this.tipo = tipo;
		this.idCategoria = idCategoria;
		
	}
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
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
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("O produto criado foi: %d, %s, %s", this.idProduto,this.nome,this.descricao);
	}
	
	
	
}