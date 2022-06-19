package br.uniesp.poo.turma20221.listapratica01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float salarioBruto;
        float valorPrestacao;
        float valorMaximo;

        System.out.println("Informe o salário");
        salarioBruto = leitor.nextFloat();
        System.out.println("Informe o valor da prestacao");
        valorPrestacao = leitor.nextFloat();

        valorMaximo = salarioBruto * 0.3f;

        if(valorPrestacao>valorMaximo){
            System.out.println("Empréstimo Negado");
        }else{
            System.out.println("Empréstimo liberado");
        }





    }

}
