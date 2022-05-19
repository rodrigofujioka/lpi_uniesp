package br.uniesp.poo.serializacao;

public class UsaManipulaArquivo {

    public static void main(String[] args) {

        ManipulaArquivo.escreverDados();
        System.out.println("Dados Gravados");
        System.out.println("Exibindo dados");
        ManipulaArquivo.lerDados();

    }

}
