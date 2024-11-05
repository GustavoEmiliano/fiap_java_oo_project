package br.com.fiap.fabricaveiculos.main;

import br.com.fiap.fabricaveiculos.model.*;

import java.util.Date;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Condutor condutor = new Condutor("Nome Condutor", "cpf", "endereço", 20, "cnh");

        Carro carro = new Carro("Toyota", "Corolla", "Branco", new Date(2010, 1, 1), new Date(2010, 1, 1), "123456789", "1.8L", "Automático", 16, 0.0, 180, condutor, false, 20.0, 0);

        carro.abastecer(new Gasolina(), 20.0);
        carro.liga();
        carro.acelera(10.0);
        carro.desacelera(10.0);
        carro.desliga();
        carro.exibirInformacoes();

        menu(carro);

    }

    public static void menu(Carro carro) {
        boolean sair = false;
        while (!sair) {
            String[] opcoesMenu = {"⛽️ Abastecer", "🔑 Ligar o Carro", "⚡️ Acelerar", "🛑 Desacelerar", "📴 Desligar o Carro", "📋 Exibir Informações do Carro", "🚪 Sair"};

            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);

            switch (escolha) {
                case 0: // Abastecer
                    String[] tiposCombustivel = {"🟢 Gasolina", "🔴 Álcool", "🟡 Diesel"};
                    int combustivelTipo = JOptionPane.showOptionDialog(null, "Escolha o tipo de combustível:", "Tipo de Combustível", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tiposCombustivel, tiposCombustivel[0]);

                    String litrosStr = JOptionPane.showInputDialog("Digite a quantidade de litros:");
                    if (litrosStr != null) {
                        double litros = Double.parseDouble(litrosStr);

                        Combustivel combustivel;
                        switch (combustivelTipo) {
                            case 0:
                                combustivel = new Gasolina();
                                JOptionPane.showMessageDialog(null, "Abastecendo com 🟢 Gasolina...");
                                break;
                            case 1:
                                combustivel = new Alcool();
                                JOptionPane.showMessageDialog(null, "Abastecendo com 🔴 Álcool...");
                                break;
                            case 2:
                                combustivel = new Diesel();
                                JOptionPane.showMessageDialog(null, "Abastecendo com 🟡 Diesel...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida.");
                                continue;
                        }
                        carro.abastecer(combustivel, litros);
                    }
                    break;

                case 1:
                    carro.liga();
                    JOptionPane.showMessageDialog(null, "Carro ligado.");
                    break;

                case 2:
                    String velocidadeAcelerarStr = JOptionPane.showInputDialog("Digite a velocidade para acelerar (km/h):");
                    if (velocidadeAcelerarStr != null) {
                        double velocidadeAcelerar = Double.parseDouble(velocidadeAcelerarStr);
                        carro.acelera(velocidadeAcelerar);
                    }
                    break;

                case 3:
                    String velocidadeDesacelerarStr = JOptionPane.showInputDialog("Digite a velocidade para desacelerar (km/h):");
                    if (velocidadeDesacelerarStr != null) {
                        double velocidadeDesacelerar = Double.parseDouble(velocidadeDesacelerarStr);
                        carro.desacelera(velocidadeDesacelerar);
                    }
                    break;

                case 4:
                    carro.desliga();
                    JOptionPane.showMessageDialog(null, "Carro desligado.");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, carro.getInformacoes(), "Informações do Carro", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema 🚪...");
                    sair = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}
