package br.com.alura.limitedecartãocredito.model;

public class Cartao {

    private String nome;
    private String bandeira;
    private double limite;

    public Cartao( String nome, String bandeira,double limite) {
        this.nome = nome;
        this.bandeira = bandeira;
        this.limite = limite;
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
                ", nome='" + nome + '\'' +
                ", bandeira='" + bandeira + '\'' +
                ", limite=" + limite +
                '}';
    }
}
