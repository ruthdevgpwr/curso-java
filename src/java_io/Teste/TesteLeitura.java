package java_io.Teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com um Arquivo

        InputStream fis = new FileInputStream("/home/ruth-dantas/Documentos/Programação/curso-java-basico/src/java-io/src/Teste/lorem.txt");
        // classe transforma int em caracteres
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {

            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}
