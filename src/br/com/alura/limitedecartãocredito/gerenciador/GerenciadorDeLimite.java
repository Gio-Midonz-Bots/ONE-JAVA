package br.com.alura.limitedecartãocredito.gerenciador;

import br.com.alura.limitedecartãocredito.model.Cartao;

import java.util.ArrayList;
//eu preciso criar os outro metodos
//preciso retornar se o limite do cartão quando for estourado
//preciso retornar as compras em ordem  do menor valor de comprar ao maior quando sair do programa
public class GerenciadorDeLimite {
    ArrayList<Cartao> lista = new ArrayList();

    public double visualizarLimite(double limite) {

        for (Cartao i : lista) {
            System.out.println(i.getLimite());
        }
        return limite;
    }

}
