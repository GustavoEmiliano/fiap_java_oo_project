package br.com.fiap.fabricaveiculos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

	public void exibePessoa() {
		System.out.println("nome: " + this.nome);
		System.out.println("idade: " + this.idade);
		System.out.println("cpf: " + this.cpf);
		System.out.println("Endereco: " + this.endereco);
	}

}
