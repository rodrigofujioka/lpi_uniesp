package br.uniesp.poo.turma20221.aula07;

public class Animal {

    private String especie;
    private String som;

    public void comer(){
        System.out.println(" Comendo ");
    }

    public void emitirSom(){
        System.out.println(getSom());
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}
