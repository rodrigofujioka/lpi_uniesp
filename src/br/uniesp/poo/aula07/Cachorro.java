package br.uniesp.poo.aula07;

public class Cachorro extends Animal{

    private String raca;

    public void emitirSom(){
        System.out.println("Comer o chinelo do dono");
        super.emitirSom();
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
