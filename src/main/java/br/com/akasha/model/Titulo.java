package br.com.akasha.model;

public abstract class Titulo {

    private Long id;
    private String nome;
    private String sinopse;
    private int anoLancamento;
    private double avaliacao;
    private boolean favorito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

}
