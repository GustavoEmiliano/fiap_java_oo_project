package br.com.fiap.fabricaveiculos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carga {

    // Atributos
    private String tipo;
    private double quantidadeCargaAbastecida;

    // Construtor
    public Carga(String tipo, double quantidadeCargaAbastecida) {
        this.tipo = tipo;
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