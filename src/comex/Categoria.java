package comex;

public class Categoria {
	private static long count = 0;
	private long id;
	private String nome;
	private boolean status = true;
	
	
	
	
	public Categoria() {
		id = ++count;
		
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public String recuperaStatus() {
		if (status == true) {
			
			return "ativa";
			
			
		}else {
			return "inativa";
		}
	}
	
	
}
