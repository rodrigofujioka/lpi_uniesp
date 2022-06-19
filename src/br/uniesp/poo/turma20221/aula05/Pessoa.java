package br.uniesp.poo.turma20221.aula05;

public class Pessoa {

    public String apelido;
    String nome;
    private int idade;
    protected String sobrenome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<0){
            System.out.println("Valor inválido");
        }else{
            this.idade = idade;
        }
    }
}
