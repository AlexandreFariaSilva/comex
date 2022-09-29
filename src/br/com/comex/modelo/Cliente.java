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
