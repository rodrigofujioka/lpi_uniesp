package br.uniesp.poo.serializacao;

public class UsaManipulaArquivo {

    public static void main(String[] args) {

        ManipulaArquivo.escreverDados();
        System.out.println("Dados Gravados");
        System.out.println("Exibindo dados");
        ManipulaArquivo.lerDados();
        //crie um arquivo txt na raiz do projeto com qualquer
        //conteúdo e que tenha o nome dados.txt

        ManipulaArquivo.escreverDadosTxt();
        ManipulaArquivo.lerDadosTxt();
    }

}
