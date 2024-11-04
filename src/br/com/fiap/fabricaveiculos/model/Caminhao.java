package br.com.fiap.fabricaveiculos.model;

import java.util.Date;

public class Caminhao extends Veiculo {

    // Atributos
    private int eixos;
    private double capacidadeMaximaCarga;
    private Carga carga;

    // Construtor
    public Caminhao(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam, String motor, String cambio, int aroRodas, double velocidade, int limiteVelocidade, Condutor condutor, boolean estaLigado, double tanque, double capacidadeRodagem, int eixos, double capacidadeMaximaCarga, double quantidadeAtual, Carga carga) {
        super(marca, modelo, cor, anoFabricacao, anoModelo, renavam, motor, cambio, aroRodas, velocidade, limiteVelocidade, condutor, estaLigado, tanque, capacidadeRodagem);
        this.eixos = eixos;
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
        this.carga = carga;
    }

    // Getters e Setters
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    // Métodos
    public void carregar(double valor) {
        double quantidadeAtual = carga.getQuantidadeCargaAbastecida();

        if (quantidadeAtual + valor > capacidadeMaximaCarga) {
            System.out.println("O caminhão já atingiu o máximo de carga suportada!");
        } else {
            carga.adicionarCarga(valor);
            System.out.println("Carga de " + valor + " adicionada. Total atual de carga: " + carga.getQuantidadeCargaAbastecida() + " kg.");
            System.out.println("Capacidade ocupada: " + carga.porcentagemOcupada(capacidadeMaximaCarga) + "%.");
        }
    }

    public void descarregar(double valor) {
        if (carga.getQuantidadeCargaAbastecida() >= valor) {
            carga.removerCarga(valor);
            System.out.println("Carga de " + valor + " removida. Total atual de carga: " + carga.getQuantidadeCargaAbastecida() + " kg.");
        } else {
            System.out.println("Não há carga suficiente para remover " + valor + " kg.");
        }
    }
    public boolean estaVazio() {
        return carga.estaVazia();
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Eixos: " + this.eixos);
        System.out.println("Quantidade de carga suportada: " + this.capacidadeMaximaCarga + " kg");
        System.out.println("Quantidade de carga atual: " + carga.getQuantidadeCargaAbastecida() + " kg");
        System.out.println("Tipo de carga: " + carga.getTipo());
        System.out.println("Porcentagem de ocupação: " + carga.porcentagemOcupada(capacidadeMaximaCarga) + "%");
        System.out.println("===============================");
    }
}
