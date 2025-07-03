package br.com.POOalura.ViaCep;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultaCep colsuta = new ConsultaCep();

        System.out.println("Digite um número de CEP: ");
        String CEP = sc.nextLine();
        try{
        Endereco novo = colsuta.buscarEndereco(CEP);
        System.out.println(novo);
        GeradorDeArquivo gerador = new GeradorDeArquivo();
        gerador.gerarArquivo(novo);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizado a aplicação");
        }
    }
}
