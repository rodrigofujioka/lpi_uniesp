package br.uniesp.poo.turma20221.aula07;

public class UsaAnimais {

    public static void main(String[] args) {
       Animal animal = new Animal();
        preparaComida(animal);
       Cachorro cachorro = new Cachorro();
       preparaComida(cachorro);

       Gato pepita = new Gato();

       fazerBarulho(pepita);
       fazerBarulho(cachorro);
       fazerBarulho(animal);

       Gato garfield = new Gato();

       Animal umBicho = new Gato();
       umBicho = new Cachorro();


    }

    public static void preparaComida(Animal c){
        System.out.println("Preparando Comida");
        c.comer();
    }

    public static void fazerBarulho(Animal umBicho){
        umBicho.emitirSom();
    }


}
