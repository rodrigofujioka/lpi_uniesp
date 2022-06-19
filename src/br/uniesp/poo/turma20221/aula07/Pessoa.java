package br.uniesp.poo.turma20221.aula07;

public class Pessoa {
    public String nome;
    public static int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        Pessoa.idade = idade;
    }
}
