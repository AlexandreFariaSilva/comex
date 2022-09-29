package br.com.comex.modelo;

public class Categoria {
	private static long count = 0;
	private long id;
	private String nome;
	private StatusDaCategoria status;
	
	
	
	

	public Categoria(long id, String nome, StatusDaCategoria status ) {
		//id = ++count;
		this.status = status;
		this.id = id;
		this.nome = nome;
		if(id <= 0) {
			throw new IllegalArgumentException("numero invalido");
		}
		if(nome.length() <= 3) {
			
			throw new IllegalArgumentException("É obrigatorio o nome ter mais que 3 caracteres");
			
		}
		if((status != StatusDaCategoria.ATIVADO)&&(status != StatusDaCategoria.DESATIVADO)) {
			
			throw new IllegalArgumentException("O status não pode ser outro alem de ATIVADO ou DESATIVADO");
		}
		
		
	
		//id = ++count;
	
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusDaCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusDaCategoria status) {
		this.status = status;
	}
	//public boolean isStatus() {
	//	return status;
	//}
	//public void setStatus(boolean status) {
	//	this.status = status;
	//}

	
	
	
}
