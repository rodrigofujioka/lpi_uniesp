package br.uniesp.poo.turma20221.aula04;

import java.util.Scanner;

public class UsaPersonagemLeitura {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade;
        Personagem baby = new Personagem();
        System.out.println("Informe o nome :");
        nome = leitor.nextLine();
        System.out.println("Informe a idade");
        idade = leitor.nextInt();
        baby.nome = nome;
        baby.idade = idade;
        baby.exibirIdade();
        baby.exibirNome();
    }
}
