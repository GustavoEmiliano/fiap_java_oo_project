package br.com.fiap.fabricaveiculos.main;

import br.com.fiap.fabricaveiculos.model.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        boolean sair = false;

        while (!sair) {
            System.out.println("================================");
            System.out.println("|             MENU             |");
            System.out.println("================================");
            System.out.println("1. ⛽️ Abastecer");
            System.out.println("2. 🔑 Ligar o Carro");
            System.out.println("3. ⚡️ Acelerar");
            System.out.println("4. 🛑 Desacelerar");
            System.out.println("5. 📴 Desligar o Carro");
            System.out.println("6. 📋 Exibir Informações do Carro");
            System.out.println("7. 🚪 Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("\nEscolha o tipo de combustível:");
                    System.out.println("1. 🟢 Gasolina");
                    System.out.println("2. 🔴 Álcool");
                    System.out.println("3. 🟡 Diesel");
                    System.out.print("Digite o número correspondente: ");
                    int combustivelTipo = scanner.nextInt();
                    System.out.print("Digite a quantidade de litros: ");
                    double litros = scanner.nextDouble();

                    Combustivel combustivel;
                    if (combustivelTipo == 1) {
                        combustivel = new Gasolina();
                        System.out.println("Abastecendo com 🟢 Gasolina...");
                    } else if (combustivelTipo == 2) {
                        combustivel = new Alcool();
                        System.out.println("Abastecendo com 🔴 Álcool...");
                    } else if (combustivelTipo == 3) {
                        combustivel = new Diesel();
                        System.out.println("Abastecendo com 🟡 Diesel...");
                    } else {
                        System.out.println("Opção inválida.");
                        break;
                    }
                    carro.abastecer(combustivel, litros);
                    break;

                case 2:
                    carro.liga();
                    System.out.println("Carro ligado 🔑");
                    break;

                case 3:
                    System.out.print("Digite a velocidade para acelerar (km/h): ");
                    double velocidadeAcelerar = scanner.nextDouble();
                    carro.acelera(velocidadeAcelerar);
                    System.out.println("Acelerando ⚡️...");
                    break;

                case 4:
                    System.out.print("Digite a velocidade para desacelerar (km/h): ");
                    double velocidadeDesacelerar = scanner.nextDouble();
                    carro.desacelera(velocidadeDesacelerar);
                    System.out.println("Desacelerando 🛑...");
                    break;

                case 5:
                    carro.desliga();
                    System.out.println("Carro desligado 📴.");
                    break;

                case 6:
                    carro.exibirInformacoes();
                    break;

                case 7:
                    System.out.println("Saindo do sistema 🚪...");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
