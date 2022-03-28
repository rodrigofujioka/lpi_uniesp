package br.uniesp.poo.aula04;

public class UsaPersonagem {

    public static void main(String[] args) {

        boolean ligada;

        Personagem baby = new Personagem();
        Personagem dathVader = new Personagem();
        Personagem yoda = new Personagem();

        baby.nome = "Baby Yoda";
        baby.idade = 3;
        dathVader.nome = "Dath Vader";
        dathVader.idade = 25;
        yoda.nome = "Yoda";
        yoda.idade = 80;

        baby.exibirNome();
        baby.exibirIdade();

    }
}
