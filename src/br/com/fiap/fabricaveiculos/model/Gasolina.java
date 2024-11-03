package br.com.fiap.fabricaveiculos.model;

public class Gasolina implements Combustivel {
    private static final double RENDIMENTO = 10.0;

    @Override
    public String getTipo() {
        return "Gasolina";
    }

    @Override
    public double abastecer(double litros) {
        return litros * RENDIMENTO;
    }
}
