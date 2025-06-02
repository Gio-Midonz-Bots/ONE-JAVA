package br.com.alura.exercicios.modelos;

public class IdadePessoa {
        private String nome;
        private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade(int idade){
            if(idade >= 18){
                return "Que ótimo! Você é maior de idade.";
            }else{
                return "Que pena! Você é menor de idade.";
            }
        }

}
