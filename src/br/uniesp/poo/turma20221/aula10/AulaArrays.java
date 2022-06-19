package br.uniesp.poo.turma20221.aula10;

import br.uniesp.poo.turma20221.aula07.Pessoa;

public class AulaArrays {

    public static void main(String[] args) {
        int[] numeros = {3,5,7,6,10};
        int[] listaNumeros = new int[5];
        var outrosNumeros = new int[10];
        listaNumeros[4] = 20;
        listaNumeros[3] = 19;
        outrosNumeros[0] = 50;
        Pessoa[] lista = new Pessoa[10];
        lista[0] = new Pessoa();
        lista[0].setNome("Rodrigo Fujioka");
        System.out.println(lista[0].getNome());

        System.out.println(listaNumeros.length);
        for(int valor: listaNumeros){
            System.out.println(valor);
        }
        for(int x=0; x<listaNumeros.length; x++){
            System.out.println(listaNumeros[x]);
        }

    }
}
