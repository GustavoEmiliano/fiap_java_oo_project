package br.com.fiap.fabricaveiculos.main;

import br.com.fiap.fabricaveiculos.model.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Condutor condutor = new Condutor("Nome Condutor", "cpf", "endereço", 20, "cnh");

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                "Branco",
                new Date(2010, 1, 1),
                new Date(2010, 1, 1),
                "123456789",
                "1.8L",
                "Automático",
                16,
                0.0,
                180,
                condutor,
                false,
                20.0,
                600.0
        );

        carro.abastecer(new Gasolina(), 20.0);
        carro.liga();
        carro.acelera(10.0);
        carro.desacelera(10.0);
        carro.desliga();
        carro.exibirInformacoes();
    }
}
