package br.com.POOalura.limitedecartãocredito.principal;

import br.com.POOalura.limitedecartãocredito.model.CartaoDeCredito;
import br.com.POOalura.limitedecartãocredito.model.Compra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe qual é o seu limite de Crédito:");
        double limite = sc.nextInt();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while(sair != 0){
            System.out.println("Digite a descrição da compra:");
            sc.nextLine();
            String descricao = sc.nextLine();

            System.out.println("Digite o valor da compra:");
            double valor = sc.nextInt();

            Compra compra = new Compra(descricao,valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra Realizada com Sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = sc.nextInt();
            }else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("COMPRAS REALIDADAS:\n");
        for (Compra c : cartao.getCompras()){
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n SALDO DO CARTÃO: " + cartao.getSaldo());

    sc.close();
    }
}
