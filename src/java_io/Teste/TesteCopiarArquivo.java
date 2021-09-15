package java_io.Teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

        InputStream inputStream = s.getInputStream();
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        OutputStream outputStream = s.getOutputStream(); //new FileOutputStream("/home/ruth-dantas/Documentos/Programação/curso-java-basico/src/java-io/src/Teste/lorem2.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String linha = bufferedReader.readLine();

        while (linha != null && !linha.isEmpty()){
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedReader.close();
    }
}
