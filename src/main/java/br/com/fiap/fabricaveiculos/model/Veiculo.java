package br.com.fiap.fabricaveiculos.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class Veiculo {

	// Atributos
	protected String marca;
	protected String modelo;
	protected String cor;
	protected Date anoFabricacao;
	protected Date anoModelo;
	protected String renavam;
	protected String motor;
	protected String cambio;
	protected int aroRodas;
	protected double velocidade;
	protected int limiteVelocidade;
	protected Condutor condutor;
	protected boolean estaLigado;
	protected double tanque;
	protected double capacidadeRodagem;

	// Construtor
	public Veiculo(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam,
			String motor, String cambio, int aroRodas, double velocidade, int limiteVelocidade, Condutor condutor,
			boolean estaLigado, double tanque, double capacidadeRodagem) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.motor = motor;
		this.cambio = cambio;
		this.aroRodas = aroRodas;
		this.velocidade = velocidade;
		this.limiteVelocidade = limiteVelocidade;
		this.condutor = condutor;
		this.estaLigado = estaLigado;
		this.tanque = tanque;
		this.capacidadeRodagem = capacidadeRodagem;
	}

	// Métodos

	public void liga() {
		this.estaLigado = true;
	}

	public void desliga() {
		if (this.estaLigado) {
			this.estaLigado = false;
		}
	}

	public void acelera(double velocidade) {
		if (this.estaLigado) {
			if (this.velocidade + velocidade > this.limiteVelocidade) {
				this.velocidade = this.limiteVelocidade;
			} else {
				this.velocidade += velocidade;
			}
		}
	}

	public void desacelera(double velocidade) {
		if (this.velocidade - velocidade < 0) {
			this.velocidade = 0;
		} else {
			this.velocidade -= velocidade;
		}
	}

	public void exibirInformacoes() {
		System.out.println("===============================");
		System.out.println("|         INFORMAÇÕES         |");
		System.out.println("===============================");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano de fabricação: " + this.anoFabricacao);
		System.out.println("Ano do modelo: " + this.anoModelo);
		System.out.println("RENAVAM: " + this.renavam);
		System.out.println("Motor: " + this.motor);
		System.out.println("Câmbio: " + this.cambio);
		System.out.println("Aro das rodas: " + this.aroRodas);
		System.out.println("Velocidade atual: " + this.velocidade + " km/h");
		System.out.println("Limite de velocidade: " + this.limiteVelocidade + " km/h");
		System.out.println("Condutor: " + (this.condutor != null ? this.condutor.getNome() : "Nenhum"));
		System.out.println("Veículo está ligado: " + (this.estaLigado ? "Sim" : "Não"));
		System.out.println("Nível do tanque: " + this.tanque + " litros");
		System.out.println("Capacidade de rodagem: " + this.capacidadeRodagem + " km");
	}

}
