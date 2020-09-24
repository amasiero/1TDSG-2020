package br.com.fiap.arquivos;

import java.io.*;

public class LeituraMain {

    public static void main(String[] args) {

        try {
            File file = new File("arquivo.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String linha;
            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();
            fr.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
