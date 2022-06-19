package br.uniesp.poo.turma20221.aula06;

public class Arquiteto {
    private String nome;
    private int idade;

    public Arquiteto(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibeDadosPessoais() {
        System.out.println(nome);
        System.out.println(idade + " anos");
        System.out.println();
    }

    public void trabalhe(double r1, double r2, double r3) {
        Circulo a = new Circulo(r1);
        double x = a.area();
        double y = a.perimetro();
        imprima(r1, x, y);

        Circulo b = new Circulo(r2);
        x = b.area();
        y = b.perimetro();
        imprima(r2, x, y);

        b = new Circulo(r3);
        x = b.area();
        y = b.perimetro();
        imprima(r2, x, y);
    }

    private void imprima(double raio, double area, double perimetro) {
        System.out.println("raio :" + raio);
        System.out.println("area :" + area);
        System.out.println("perimetro :" + perimetro);
        System.out.println();
    }

}
