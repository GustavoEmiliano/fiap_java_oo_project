package br.com.fiap.fabricaveiculos.model;

public class Condutor extends Pessoa {
	private String cnh;

	public Condutor(String nome, String cpf, String endereco, int idade, String cnh) {
		super(nome, cpf, endereco, idade);
		this.cnh = cnh;
	}

}
