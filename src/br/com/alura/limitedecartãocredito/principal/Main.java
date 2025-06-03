package br.com.alura.limitedecartãocredito.principal;

import br.com.alura.limitedecartãocredito.gerenciador.GerenciadorDeLimite;
import br.com.alura.limitedecartãocredito.model.Cartao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

                    GerenciadorDeLimite gerenciador = new GerenciadorDeLimite();
            System.out.println("==============INICIANDO===========");
            System.out.println("Qual é o seu limite do cartão: R$");
            double limite = sc.nextDouble();
            sc.nextLine();

        while(opcao!=0){
            System.out.println("\n------ESCOLHA A OPÇÃO A BAIXO-------");
            System.out.println("1- Deseja Visualizar o limite do seu cartão de crédito:");
            System.out.println("2- Deseja Aumentar o limite do seu cartão de crédito:");
            System.out.println("3- Deseja Diminuir o limite do seu cartão de crédito:");
            System.out.println("4- Deseja Comprar com o seu cartão de crédito:");
            System.out.println("0- Deseja Parar?");
            System.out.println("Digite a sua opção:");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("------VISUALIZAR O LIMITE DO CARTAO-------");

                    System.out.println("O limite do seu cartão é R$"+gerenciador.visualizarLimite(limite));
                    break;
                case 2:
                    System.out.println("------AUMENTAR O LIMITE DO CARTAO-------");
                    break;
                case 3:
                    System.out.println("------DIMINUIR O LIMITE DO CARTAO-------");
                    break;
                case 4:
                    System.out.println("------COMPRAR COM O LIMITE DO CARTAO-------");
                    System.out.println("\nO seu limite do cartão: R$" + gerenciador.visualizarLimite(limite));
                    System.out.println("\nQual é Descrição da compra:");
                    String descricao = sc.nextLine();
                    System.out.println("\nInforme qual é o valor da compra:");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    break;
                case 0:
                    System.out.println("==============VOLTE SEMPRE===========");
                    break;
                default:
                    System.out.println("Valor incorreto! Tente novamente!");
            }
        }





        sc.close();
    }
}
