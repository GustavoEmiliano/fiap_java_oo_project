package br.com.fiap.fabricaveiculos.model;

import java.util.Date;

public abstract class Veiculo {

    // Atributos
    protected String marca;
    protected String modelo;
    protected String cor;
    protected Date anoFabricacao;
    protected Date anoModelo;
    protected  String renavam;
    protected String motor;
    protected String cambio;
    protected int aroRodas;
    protected  double velocidade;
    protected int limiteVelocidade;
    protected Condutor condutor;
    protected boolean estaLigado;
    protected double tanque;
    protected double capacidadeRodagem;

    // Construtor
    public Veiculo(String marca, String modelo, String cor, Date anoFabricacao, Date anoModelo, String renavam, String motor, String cambio, int aroRodas, double velocidade, int limiteVelocidade, Condutor condutor, boolean estaLigado, double tanque, double capacidadeRodagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.renavam = renavam;
        this.motor = motor;
        this.cambio = cambio;
        this.aroRodas = aroRodas;
        this.velocidade = velocidade;
        this.limiteVelocidade = limiteVelocidade;
        this.condutor = condutor;
        this.estaLigado = estaLigado;
        this.tanque = tanque;
        this.capacidadeRodagem = capacidadeRodagem;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getAroRodas() {
        return aroRodas;
    }

    public void setAroRodas(int aroRodas) {
        this.aroRodas = aroRodas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getLimiteVelocidade() {
        return limiteVelocidade;
    }

    public void setLimiteVelocidade(int limiteVelocidade) {
        this.limiteVelocidade = limiteVelocidade;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getCapacidadeRodagem() {
        return capacidadeRodagem;
    }

    public void setCapacidadeRodagem(double capacidadeRodagem) {
        this.capacidadeRodagem = capacidadeRodagem;
    }

    // Métodos
    public void exibirInformacoes() {
        System.out.println("===============================");
        System.out.println("|         INFORMAÇÕES         |");
        System.out.println("===============================");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano de fabricação: " + this.anoFabricacao);
        System.out.println("Ano do modelo: " + this.anoModelo);
        System.out.println("RENAVAM: " + this.renavam);
        System.out.println("Motor: " + this.motor);
        System.out.println("Câmbio: " + this.cambio);
        System.out.println("Aro das rodas: " + this.aroRodas);
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
        System.out.println("Limite de velocidade: " + this.limiteVelocidade + " km/h");
        System.out.println("Condutor: " + (this.condutor != null ? this.condutor.getNomeCondutor() : "Nenhum"));
        System.out.println("Veículo está ligado: " + (this.estaLigado ? "Sim" : "Não"));
        System.out.println("Nível do tanque: " + this.tanque + " litros");
        System.out.println("Capacidade de rodagem: " + this.capacidadeRodagem + " km");
    }

}
