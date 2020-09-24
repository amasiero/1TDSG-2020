package br.com.fiap.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class NovaEscritaMain {

    public static void main(String[] args) {

        File arquivo = new File("arquivo.txt");
        if(arquivo.canWrite()) {
            try (FileOutputStream fos = new FileOutputStream(arquivo);
                 PrintWriter writer = new PrintWriter(fos)) {

                writer.println("#--- Novo arquivo com Java ---#");
                writer.println("- Agora sem close! -");

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
