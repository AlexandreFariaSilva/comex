package comex;

public class ItemPedido extends Produto{
	
	private static long count = 0;
	private long id;
	private int quantidadeDoPedido;
	private long idDoPedido;
	private double desconto;
	private String tipoDoDesconto;
	

	
	public ItemPedido(int quantidadeDoPedido, String tipoDoDesconto, long idDoPedido ) {
		
		id = ++count;
		this.quantidadeDoPedido = quantidadeDoPedido;
		this.tipoDoDesconto = tipoDoDesconto;
		this.idDoPedido = idDoPedido;
		
	
		
		
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
	
	
	

}
