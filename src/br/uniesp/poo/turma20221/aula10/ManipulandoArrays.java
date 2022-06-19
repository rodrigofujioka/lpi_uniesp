package br.uniesp.poo.turma20221.aula10;

import java.util.*;

public class ManipulandoArrays {

    public static void main(String[] args) {
        int[] lista = new int[10];
        int[] segundaLista = new int[10];
        Arrays.fill(lista, 10);
        Arrays.fill(segundaLista, 11);
        System.out.println(lista[3]);
        System.out.println(segundaLista[9]);
        if(Arrays.equals(lista, segundaLista)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }

        int[] listaOrdenada = {7,4,8,3,1,9,0};
        System.out.println(Arrays.toString(listaOrdenada));
        Arrays.sort(listaOrdenada);
        System.out.println(Arrays.toString(listaOrdenada));

        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Amanda Uol");
        listaNomes.add("Rodrigo Fujioka");
        listaNomes.add("Rodrigo Fujioka");
        listaNomes.add("Ricardo Uol");

        System.out.println(listaNomes.toString());
        Collections.reverse(listaNomes);
        System.out.println(listaNomes.toString());

        Set<String> listaPessoa = new HashSet<>();
        listaPessoa.add("Raira");
        listaPessoa.add("Raira");
        listaPessoa.add("Raira");
        System.out.println(listaPessoa.toString());

        Map<String, String> mapa = new HashMap<>();
        mapa.put("professor","Rodrigo Fujioka");
        mapa.put("coordenador","Marcelo Fernandes");
        mapa.put("professor","Messias");
        System.out.println(mapa.get("coordenador"));

    }
}
