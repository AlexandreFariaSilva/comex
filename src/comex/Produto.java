package comex;

public class Produto {
	
	private static long count = 0;
	private long idProduto;
	protected  String nome;
	protected  String descricao;
	protected double precoUnitario;
	protected int quantidadeEmEstoque;
	private Categoria categoriaProduto;
	
	public Produto() {
		
		idProduto = ++count;
		
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
	