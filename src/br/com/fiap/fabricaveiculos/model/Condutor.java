package br.com.fiap.fabricaveiculos.model;

public class Condutor {

    // Atributos
    private String nomeCondutor;
    private int idadeCondutor;

    // Construtor
    public Condutor(String nomeCondutor, int idadeCondutor) {
        this.nomeCondutor = nomeCondutor;
        this.idadeCondutor = idadeCondutor;
    }

    // Getters
    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public int getIdadeCondutor() {
        return idadeCondutor;
    }
}
