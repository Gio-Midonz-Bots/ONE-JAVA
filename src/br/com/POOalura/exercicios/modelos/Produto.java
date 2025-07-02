package br.com.POOalura.exercicios.modelos;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String aplicarDesconto(){
        System.out.println("Por favor informe o valor do seu desconto:");
        double desconto = sc.nextDouble() ;

        double calculoDesconto = (desconto/100) * preco;
        double aplicarDescontoTotal = preco - calculoDesconto;
        return "Olá " + nome + "\nO valor do seu produto é: R$ "+ preco + " Seu desconto é R$" + calculoDesconto + "\nEntão o valor a pagar é: R$" + aplicarDescontoTotal ;
    }
}
