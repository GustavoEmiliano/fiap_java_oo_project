package br.com.fiap.fabricaveiculos.model;

import java.util.Date;

public class Carro extends Veiculo {

    // Construtor
    public Carro(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam, String motor, String cambio, int aroRodas, double velocidade, int limiteVelocidade, Condutor condutor, boolean estaLigado, double tanque, double capacidadeRodagem) {
        super(marca, modelo, cor, anoFabricacao, anoModelo, renavam, motor, cambio, aroRodas, velocidade, limiteVelocidade, condutor, estaLigado, tanque, capacidadeRodagem);
    }

    // Métodos
    public void abastecer(Combustivel combustivel, double quantidade) {
        if (tanque + quantidade > 50) {
            System.out.println("Não foi possível abastecer! Excedeu a quantidade de 50 litros!");
        } else {
            tanque += quantidade;
            double rendimentoTotal = 0;
            rendimentoTotal += combustivel.abastecer(quantidade);
            this.capacidadeRodagem += rendimentoTotal;
            System.out.printf("Abastecido com %.2f litros de %s. Capacidade de rodagem atual: %.2f km%n", quantidade, combustivel.getTipo(), this.capacidadeRodagem);
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Capacidade de Rodagem: %.2f km%n", this.capacidadeRodagem); // Se capacidadeRodagem for herdada
        System.out.println("===============================");
    }
}
