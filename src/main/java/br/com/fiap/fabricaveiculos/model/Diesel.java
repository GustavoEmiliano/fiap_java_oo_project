package br.com.fiap.fabricaveiculos.model;

public class Diesel implements Combustivel {
    private static final double RENDIMENTO = 20.0;

    @Override
    public String getTipo() {
        return "Diesel";
    }

    @Override
    public double abastecer(double litros) {
        return litros * RENDIMENTO;
    }
}
