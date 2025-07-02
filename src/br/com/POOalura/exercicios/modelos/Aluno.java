package br.com.POOalura.exercicios.modelos;

import java.util.Scanner;

public class Aluno {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private double notaPrimeiraUnidade;
    private double notaSegundaUnidade;
    private double notaTerceiraUnidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaPrimeiraUnidade() {
        return notaPrimeiraUnidade;
    }

    public void setNotaPrimeiraUnidade(double notaPrimeiraUnidade) {
        this.notaPrimeiraUnidade = notaPrimeiraUnidade;
    }

    public double getNotaSegundaUnidade() {
        return notaSegundaUnidade;
    }

    public void setNotaSegundaUnidade(double notaSegundaUnidade) {
        this.notaSegundaUnidade = notaSegundaUnidade;
    }

    public double getNotaTerceiraUnidade() {
        return notaTerceiraUnidade;
    }

    public void setNotaTerceiraUnidade(double notaTerceiraUnidade) {
        this.notaTerceiraUnidade = notaTerceiraUnidade;
    }

    public double calcularMedia(){
        System.out.println("Informe suas três notas:");
        notaPrimeiraUnidade = sc.nextDouble(); notaSegundaUnidade = sc.nextDouble();   notaTerceiraUnidade = sc.nextDouble();
        double calcularMedias = (notaPrimeiraUnidade + notaSegundaUnidade + notaTerceiraUnidade ) / 3;
        return calcularMedias;
    }

    @Override
    public String toString() {
        return "Aluno(a): " + nome + "\nSua média é: "+ calcularMedia();

    }
}
