package java_io.Teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída com um Arquivo
        OutputStream outputStream = new FileOutputStream("/home/ruth-dantas/Documentos/Programação/curso-java-basico/src/java-io/src/Teste/lorem2.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write(" Ruth Dantas ");
        bufferedWriter.write(" Emerson Bezerra ");

        bufferedWriter.close();
    }
}
