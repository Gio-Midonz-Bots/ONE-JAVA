package br.com.POOalura.exercicios.modelos;

public class Principal {
    public static void main(String[] args) {
        Produto pt = new Produto();
        Aluno caderneta = new Aluno();


        pt.setNome("Giskleide");
        pt.setPreco(200);
        System.out.println(pt.aplicarDesconto());
        System.out.println("--------------------------------------------------");

        caderneta.setNome("Fernanda");
        System.out.println(caderneta.toString());
        System.out.println("--------------------------------------------------");


    }
}
