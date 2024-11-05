package br.com.fiap.fabricaveiculos.model;

import java.util.Date;

public class Carro extends Veiculo {

    // Construtor
    public Carro(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam, String motor, String cambio, int aroRodas, double velocidade, int limiteVelocidade, Condutor condutor, boolean estaLigado, double tanque, double capacidadeRodagem) {
        super(marca, modelo, cor, anoFabricacao, anoModelo, renavam, motor, cambio, aroRodas, velocidade, limiteVelocidade, condutor, estaLigado, tanque, capacidadeRodagem);
    }

    // Métodos
    public void abastecer(Combustivel combustivel, double quantidade) {
        if (getTanque() + quantidade > 50) {
            System.out.println("Não foi possível abastecer! Excedeu a quantidade de 50 litros!");
        } else {
            setTanque(getTanque() + quantidade);
            double rendimentoTotal = combustivel.abastecer(quantidade);
            setCapacidadeRodagem(getCapacidadeRodagem() + rendimentoTotal);
            System.out.printf("Abastecido com %.2f litros de %s. Capacidade de rodagem atual: %.2f km%n", quantidade, combustivel.getTipo(), getCapacidadeRodagem());
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Capacidade de Rodagem: %.2f km%n", getCapacidadeRodagem());
        System.out.println("===============================");
    }

    public String getInformacoes() {
        return String.format(
                "🚗 Marca: %s\n" +
                        "📄 Modelo: %s\n" +
                        "🎨 Cor: %s\n" +
                        "🛠 Ano de Fabricação: %tY\n" +
                        "🗓 Ano do Modelo: %tY\n" +
                        "🔢 Chassi: %s\n" +
                        "⚙️ Motor: %s\n" +
                        "🕹 Transmissão: %s\n" +
                        "🚪 Aro das Rodas: %d\n" +
                        "⛽️ Nível de Combustível: %.2f L\n" +
                        "💨 Velocidade Máxima: %d km/h\n" +
                        "👤 Condutor: %s\n" +
                        "🔋 Capacidade de Rodagem: %.2f km\n",
                getMarca(),
                getModelo(),
                getCor(),
                getAnoFabricacao(),
                getAnoModelo(),
                getRenavam(),
                getMotor(),
                getCambio(),
                getAroRodas(),
                getTanque(),
                getLimiteVelocidade(),
                getCondutor().getNome(),
                getCapacidadeRodagem()
        );
    }
}
