package br.com.alura.exercicios.modelos;

import java.util.Scanner;

public class MenuBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 100;
        String mensagem = "\nNome do cliente: " + nome + "\nTipo Conta: " + tipoConta + "\nSaldo: " + saldo;

        System.out.println("********************************************************");
        System.out.println("Olá Seja bem-vindo "+nome);
        System.out.println("********************************************************");


        while(opcao != 4){

            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            System.out.print("Digite o número da opção desejada: ");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;

                case 2:
                    double sacar = 0;
                    System.out.println("O seu saldo é: "+saldo + "\nQual é o valor que você deseja retirar: ");
                    sacar = sc.nextDouble();

                    if ( saldo >= sacar) {
                        saldo -= sacar;
                        System.out.println("O seu saldo atual é: " + saldo);
                    }
                    else{
                        System.out.println("Infelizmente saldo insufisiente!");
                    }
                    break;

                case 3:
                    double depositar =0;
                    System.out.println("Quanto você deseja depositar: ");
                    depositar = sc.nextDouble();
                    saldo += depositar;

                    if (depositar <= 0){
                        System.out.println("infelizmente não poderemos ajudar!");
                    }else{
                        System.out.println("Seu deposito foi realizado com sucesso!\nO seu saldo atual é: " + saldo);
                    }
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Agradecemos! Volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}
