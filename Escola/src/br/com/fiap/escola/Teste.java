package br.com.fiap.escola;

import br.com.fiap.escola.domain.Aluno;

import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {
        System.out.println(Aluno.class.getDeclaredFields()[0].getType().getCanonicalName());

        String texto = """
                    <html> 
                        <head>
                            <title>Nome da pagina</title>
                        </head> 
                        <body>
                            <h1>Pagina X</h1>
                        </body> 
                    </html>
                """;

        System.out.println(texto);
    }
}
