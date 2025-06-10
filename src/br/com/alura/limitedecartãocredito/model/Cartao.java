package br.com.alura.limitedecartãocredito.model;

public class Cartao {
    private double limite;

    public Cartao( double limite) {
        this.limite = limite;
    }



    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


}
