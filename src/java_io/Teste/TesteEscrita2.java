package java_io.Teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {

        //FileWriter fileWriter = new FileWriter("lorem.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("java_io/Teste/lorem.txt"));
        bufferedWriter.write(" Ruth Dantas de Assis ");
        bufferedWriter.write(System.lineSeparator());
        bufferedWriter.write(System.lineSeparator());
        bufferedWriter.write(System.lineSeparator());
        bufferedWriter.write("Emerson Bezerra");
        bufferedWriter.close();
    }

}
