package br.com.alura.limitedecartãocredito.model;

public class Cartao {
    private int IDconta;
    private String nome;
    private String bandeira;
    private double limite;

    public Cartao(int IDconta, String nome, String bandeira, double limite) {
        this.IDconta = IDconta;
        this.nome = nome;
        this.bandeira = bandeira;
        this.limite = limite;
    }

    public int getIDconta() {
        return IDconta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "IDconta=" + IDconta +
                ", nome='" + nome + '\'' +
                ", bandeira='" + bandeira + '\'' +
                ", limite=" + limite +
                '}';
    }
}
