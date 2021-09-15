package java_io.Teste;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter ps = new PrintWriter("java_io/Teste/lorem3.txt");

        ps.println("LoremLoremLoremLorem LoremLorem LoremLoremLoremLorem");
        ps.println();
        ps.println();
        ps.println();
        ps.println("Ruth Dantas");

        ps.close();
    }
}
