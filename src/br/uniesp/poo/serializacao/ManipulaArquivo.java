package br.uniesp.poo.serializacao;

import java.io.*;

public class ManipulaArquivo {

    public static void escreverDados(){
        FileOutputStream arq;
        try {
            arq = new FileOutputStream("Dados.dat");
            for(int cont = 65; cont<90;cont ++){
                arq.write(cont);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerDados(){
        FileInputStream arq;
        int letra = 0;
        try {
            arq = new FileInputStream("dados.dat");
            while(letra!=-1){
                letra = arq.read();
                System.out.println(letra);
            }
            arq.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void lerDadosTxt(){
        FileReader in = null;

        try {
            in = new FileReader("dados.txt");
            int c;
            while((c = in.read())!=1){
                System.out.println((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
    }


    public static void escreverDadosTxt(){
        FileWriter out = null;
        int contLetra = 0;
        String texto = "Um texto para trabalhar";

        try {
            out = new FileWriter("dados.txt");
            while(contLetra < texto.length()){
                out.write(texto.charAt(contLetra));
                contLetra++;
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
