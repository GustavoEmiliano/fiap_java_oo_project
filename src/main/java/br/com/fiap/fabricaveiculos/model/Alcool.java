package br.com.fiap.fabricaveiculos.model;

public class Alcool implements Combustivel {
    private static final double RENDIMENTO = 7.5;

    @Override
    public String getTipo() {
        return "Alcool";
    }

    @Override
    public double abastecer(double litros) {
        return litros * RENDIMENTO;
    }
}
