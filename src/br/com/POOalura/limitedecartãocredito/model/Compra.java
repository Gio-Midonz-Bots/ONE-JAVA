package br.com.POOalura.limitedecartãocredito.model;

public class Compra {
    private String  descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras Realizadas\n: " +
                "descricao='" + descricao + '\'' +
                "valor=" + valor;
    }
}
