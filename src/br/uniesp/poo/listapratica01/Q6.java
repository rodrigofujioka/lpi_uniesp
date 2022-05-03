package br.uniesp.poo.listapratica01;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int totalAlunosReprovados = 0;
        int totalAlunosAprovados = 0;
        float notaUm;
        float notaDois;
        float media;
        for(int x =1; x < 7; x++){
            System.out.println("Dados do Aluno " + x);
            System.out.println("Informe a nota 1" );
            notaUm = leitor.nextFloat();
            System.out.println("Informe a nota 2");
            notaDois = leitor.nextFloat();
            media = (notaUm + notaDois ) / 2;

            if(media >= 7){
                ++totalAlunosAprovados;
            }
        }
        System.out.println("Total Alunos" );

    }
}
