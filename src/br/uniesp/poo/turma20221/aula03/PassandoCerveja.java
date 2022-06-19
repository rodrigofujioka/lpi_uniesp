package br.uniesp.poo.turma20221.aula03;

import java.util.Scanner;

public class PassandoCerveja {

    public static void main(String[] args) {

        int cervejas = 99;
        Scanner leitor = new Scanner(System.in);

        while(cervejas>0){
            System.out.println("São " + cervejas + " cervejas na freezer.");
            cervejas = cervejas - 1;
            System.out.println("Pego uma garrafa, passo pra frente. " +
                    "\n Agora são  " + cervejas + "  na freezer.");

            if(cervejas == 0){
                System.out.println("Cervejas acabaram, vai incluir quantas mais");
                cervejas = leitor.nextInt();
                if(cervejas > 0){
                    System.out.println("Foram incluidas mais " + cervejas + " Cervejas");
                }
            }
        }
        System.out.println("Acabou a festa");

    }
}
