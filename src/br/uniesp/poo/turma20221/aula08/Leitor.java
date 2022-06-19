package br.uniesp.poo.turma20221.aula08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {

    Scanner leitor = new Scanner(System.in);
    public int lerIdade(){
        int idade = -1;
        System.out.println("Informe a idade:");
        try {
            idade = leitor.nextInt();
            leitor = null;   //comentar apagar
            leitor.nextInt();   //comentar apagar
            System.out.println("Ocorreu um erro");  //comentar apagar
        }catch (InputMismatchException ie){
            System.out.println("Erro 001 de input: São ceitos apenas números");
        }
        catch (Exception e){
            System.out.println("Erro 002 de input: Erro inesperado");
        }finally {
            System.out.println("Sempre passa por aqui");
        }
        return idade;
    }


    public void exibeInfo() throws Exception{
            exibirIdade();
    }

    public void exibirIdade() throws Exception{
        //asdhjashdjashdajsdhj
        throw new Exception("Erro");
    }

}
