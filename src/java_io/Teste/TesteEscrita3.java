package java_io.Teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {

        //FileWriter fileWriter = new FileWriter("lorem.txt");
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem.txt"));


        PrintStream printStream = new PrintStream("java_io/Teste/lorem2.txt");

        printStream.println("Ruth Dantas de Assis");
        printStream.println();
        printStream.println("ljdljdsiofjsoidjfjsdlfjsiodfjiosdfj");

        printStream.close();
    }

}
