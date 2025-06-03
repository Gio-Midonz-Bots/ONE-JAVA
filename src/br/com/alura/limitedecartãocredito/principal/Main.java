package br.com.alura.limitedecartãocredito.principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while(opcao!=0){
            System.out.println("------ESCOLHA A OPÇÃO A BAIXO-------");
            System.out.println("1- Deseja Comprar com o seu cartão de crédito:");
            System.out.println("2- Deseja Visualizar o limite do seu cartão de crédito:");
            System.out.println("3- Deseja Aumentar o limite do seu cartão de crédito:");
            System.out.println("4- Deseja Diminuir o limite do seu cartão de crédito:");
            System.out.println("0- Deseja Parar?");
            System.out.println("Digite a sua opção:");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("ai");
            }
        }





        sc.close();
    }
}
