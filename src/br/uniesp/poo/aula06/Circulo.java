package br.uniesp.poo.aula06;

public class Circulo {

    private  static double PI = 3.141516;
    private double raio;
    public Circulo(){}
    public  Circulo (double r){
        raio = r;
    }



    public double area( ) {
        return PI * raio * raio;
    }
    public double perimetro (){
        return 2 * PI * raio;
    }

}
