package br.com.fiap.fabricaveiculos.model;

public class Carga {

    // Atributos
    private String tipo;
    private double quantidadeCargaAbastecida;

    // Construtor
    public Carga(String tipo, double quantidadeCargaAbastecida) {
        this.tipo = tipo;
        this.quantidadeCargaAbastecida = quantidadeCargaAbastecida;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getQuantidadeCargaAbastecida() {
        return quantidadeCargaAbastecida;
    }

    public void setQuantidadeCargaAbastecida(double quantidadeCargaAbastecida) {
        this.quantidadeCargaAbastecida = quantidadeCargaAbastecida;
    }

    // Métodos
    public void adicionarCarga(double quantidade) {
        this.quantidadeCargaAbastecida += quantidade;
    }

    public void removerCarga(double quantidade) {
        if (quantidade <= quantidadeCargaAbastecida) {
            this.quantidadeCargaAbastecida -= quantidade;
        } else {
            System.out.println("Quantidade de carga a ser removida excede a quantidade atual.");
        }
    }

    public boolean estaVazia() {
        return quantidadeCargaAbastecida == 0;
    }

    public double porcentagemOcupada(double capacidadeTotal) {
        return (quantidadeCargaAbastecida / capacidadeTotal) * 100;
    }
}