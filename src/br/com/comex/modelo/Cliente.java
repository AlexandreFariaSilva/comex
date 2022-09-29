package br.com.comex.modelo;

public class Cliente {
	
	private long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numeroEndereco;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Cliente(long id, String nome, String cpf, String telefone, String rua, String numeroEndereco, String complemento, String bairro, String cidade,String estado) {
		
		if(id < 0) {
			throw new IllegalArgumentException("O ID não pode ser menor que 0");
			
		}if(nome.length() < 5 ) {
			throw new IllegalArgumentException("O nome deve conter mais que 5 caracteres ");
		}if((cpf.length()< 11)|(cpf.length()> 14)) {
			throw new IllegalAccessError("O CPF não pode conter menos que 11 digitos e não mais que 14");
		}if(rua.length() < 5) {
			throw new IllegalArgumentException("O nome da rua deve conter mais que 5 caracteres");
		}if(numeroEndereco.length() <= 1) {
			throw new IllegalArgumentException("O numero da rua deve ser maior que 1 caractere");
		}if(bairro.length() <= 1) {
			throw new IllegalArgumentException("O bairro deve ter mais que 1 caractere");
		}if(cidade.length() <= 1) {
			throw new IllegalArgumentException("A cidade deve ter mais que 1 caractere");
		}if(estado.length() <= 1) {
			throw new IllegalArgumentException("O estado deve ter mais que 1 caractere");
		}
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numeroEndereco = numeroEndereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		
		
		//System.out.println("\nDados do cliente: " +"\nNumero do cadastro: " + id + "\nNome cliente: "  + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nRua: " + rua + "\nNumero do Endereco: "+ numeroEndereco + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nEstado: " + estado);
	//	System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void imprimeCliente() {
		
		System.out.println("\nDados do cliente: " +"\nNumero do cadastro: " + id + "\nNome cliente: "  + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nRua: " + rua + "\nNumero do Endereco: "+ numeroEndereco + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nEstado: " + estado);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		
	}
	
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getRua() {
		return rua;
	}
	public String getNumeroEndereco() {
		return numeroEndereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}

	

}
