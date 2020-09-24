package br.com.fiap.escola.helper;

import br.com.fiap.escola.exception.FileEscolaException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// Helper ou Utils
public class FileHelper {

    public static Properties getEnvProperties() throws FileEscolaException {
        File file = new File("application.properties");

        if(!file.exists())
            throw new FileEscolaException("� necess�rio criar o arquivo application.properties");

        try (FileInputStream fis = new FileInputStream(file)) {
            Properties props = new Properties();
            props.load(fis);
            return props;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new FileEscolaException("N�o foi poss�vel carregar o arquivo de propriedades.");
        }
    }

}
