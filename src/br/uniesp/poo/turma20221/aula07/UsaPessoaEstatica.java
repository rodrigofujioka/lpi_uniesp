package br.uniesp.poo.turma20221.aula07;

public class UsaPessoaEstatica {

    public static void main(String[] args) {

        Pessoa matheus = new Pessoa();
        Pessoa vinicius = new Pessoa();
        Pessoa cleonice = new Pessoa();
        cleonice.setNome("Cleonice");
        cleonice.setIdade(18);
        System.out.println(cleonice.getIdade());
        vinicius.setNome("Vinicius");
        vinicius.setIdade(65);
        matheus.setNome("Matheus");
        matheus.setIdade(30);

        System.out.println(cleonice.getIdade());
        System.out.println(Pessoa.idade);

    }
}
