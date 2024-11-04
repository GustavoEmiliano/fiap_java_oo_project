package br.com.fiap.fabricaveiculos.model;

abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String endereco;
	protected int idade;
	
	public Pessoa(String nome, String cpf, String endereco, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibePessoa() {
		System.out.println("nome: " + this.nome);
		System.out.println("idade: " + this.idade);
		System.out.println("cpf: " + this.cpf);
		System.out.println("Endereco: " + this.endereco);
	}
	
	
}
