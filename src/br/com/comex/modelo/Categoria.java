package br.com.comex.modelo;

public class Categoria {
	private static long count = 0;
	private Integer id;
	private String nome;
	private StatusDaCategoria status;

	public Categoria(String nome, StatusDaCategoria status ) {
		id = (int) ++count;
		this.status = status;
		this.id = (int) id;
		this.nome = nome;
		if(id <= 0) {
			throw new IllegalArgumentException("numero invalido");
		}
		if(nome.length() <= 3) {
			
			throw new IllegalArgumentException("É obrigatorio o nome ter mais que 3 caracteres");
			
		}
		if((status != StatusDaCategoria.ATIVA)&&(status != StatusDaCategoria.INATIVA)) {
			
			throw new IllegalArgumentException("O status não pode ser outro alem de ATIVA ou DESATIVADO");
		}
	
	
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		
		this.id = (int) id;
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
	public String getStatusString() {
		return String.format("%s", getStatus());
	}

	public void setStatus(StatusDaCategoria status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("A categria criada foi: %d, %s, %s", this.id,this.nome,this.status);
	}
	//public boolean isStatus() {
	//	return status;
	//}
	//public void setStatus(boolean status) {
	//	this.status = status;
	//}

	
	
	
}
