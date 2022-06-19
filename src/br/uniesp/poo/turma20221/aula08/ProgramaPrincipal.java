package br.uniesp.poo.turma20221.aula08;

public class ProgramaPrincipal {

    public static void main(String[] args) throws Exception {

        Leitor leitor = new Leitor();
        Usuario romeu =
                new Usuario("Romeu", leitor.lerIdade());

        leitor.exibeInfo();
    }
}
