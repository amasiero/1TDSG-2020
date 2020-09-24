package br.com.fiap.arquivos;

import java.io.*;

public class EscritaMain {

    public static void main(String[] args) {
        try {
            File arquivo = new File("arquivo.txt");
            FileOutputStream fos = new FileOutputStream(arquivo);
            PrintWriter writer = new PrintWriter(fos);

            writer.println("#--- Meu primeiro arquivo com Java ---#");
            writer.println("- Hello Arquivos! -");

            writer.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
