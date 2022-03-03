package br.uniesp.poo.aula02;

import java.util.Scanner;

public class LerNome {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o seu nome : ");
        String nome = leitor.nextLine();

        System.out.println("Informe a sua idade");
        int idade = leitor.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        leitor.close();
    }


}
