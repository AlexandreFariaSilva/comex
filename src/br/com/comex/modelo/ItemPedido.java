package br.com.comex.modelo;

public class ItemPedido extends Produto{
	
	private static long count = 0;
	private long id;
	private int quantidadeDoPedido;
	private long idDoPedido;
	private double desconto;
	private String tipoDoDesconto;
	private double precoUnitario;
	private long idDoProduto;
	
	
	

	
	public ItemPedido(double precoUnitario,long idDoProduto,int quantidadeDoPedido, String tipoDoDesconto, long idDoPedido ) {
		
		id = ++count;
		this.quantidadeDoPedido = quantidadeDoPedido;
		this.tipoDoDesconto = tipoDoDesconto;
		this.idDoPedido = idDoPedido;
		this.idDoProduto = idDoProduto;
	
		
	}
	
	public double precoTotalSemDescontos() {
		
		double precoDesconto =  precoUnitario *  quantidadeDoPedido;
		
		return precoDesconto;
		
	}
	
	public double calculaDesconto() {
        if(this.tipoDoDesconto == "PROMOCAO") {
        	double calc = 0.2;
        	double result = this.precoUnitario * calc;
            return(precoUnitario - result);
            
        }else if (this.quantidadeDoPedido > 10 ) {
        	double calc = 0.1;
        	double result = this.precoUnitario * calc;
        	double descresult = precoUnitario - result;
            return(descresult * quantidadeDoPedido);
        } else {
        	
        	return(0);
        }
        
        
    }
	

	public long getId() {
		return id;
	}

	public int getQuantidadeDoPedido() {
		return quantidadeDoPedido;
	}

	public long getIdDoPedido() {
		return idDoPedido;
	}

	public double getDesconto() {
		return desconto;
	}

	public String getTipoDoDesconto() {
		return tipoDoDesconto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public long getIdDoProduto() {
		return idDoProduto;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setQuantidadeDoPedido(int quantidadeDoPedido) {
		this.quantidadeDoPedido = quantidadeDoPedido;
	}

	public void setIdDoPedido(long idDoPedido) {
		this.idDoPedido = idDoPedido;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void setTipoDoDesconto(String tipoDoDesconto) {
		this.tipoDoDesconto = tipoDoDesconto;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public void setIdDoProduto(long idDoProduto) {
		this.idDoProduto = idDoProduto;
	}

	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", quantidadeDoPedido=" + quantidadeDoPedido + ", idDoPedido=" + idDoPedido
				+ ", desconto=" + desconto + ", tipoDoDesconto=" + tipoDoDesconto + "]";
	}
	
	
	

}
