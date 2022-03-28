package br.uniesp.poo.aula04;

public class Lampada {

    boolean ligada ;

    void ligar(){
        ligada = true;
        System.out.println("Ligando ");
    }
    void desligar(){
        ligada = false;
        System.out.println("Desligando ");
    }
}
