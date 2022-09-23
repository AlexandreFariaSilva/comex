package comex;

public class ProdutoIsento extends Produto{
	

		// TODO Auto-generated constructor stub
	

public double calculaValorTotalEmEstoque() {
		
	    double calculaEstoque =  quantidadeEmEstoque * precoUnitario;
		
		return calculaEstoque;
	
	}
	
	public double calculaImposto() {
		
		double valorImposto  = 0;
		
		return valorImposto;
		
		
	}
	
}
