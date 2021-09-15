package java_io.Teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {


    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("Teste/contas.csv"));

        while (scanner.hasNextLine()) {  //hasnextline - tem uma proxima linha no meu arquivo?
            String linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(" , ");

            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            String.format(" %s - %04d- %d, %s: %f", valor1, valor2, valor3, valor4, valor5);
            System.out.println(valor1 + " , " + valor2 + " , " + valor3 + " , " + valor4 + " , " + valor5);

            linhaScanner.close();


            /*String[] valores = linha.split(" , ");
            System.out.println(valores[3]);*/
        }
        //String linha = scanner.nextLine(); //nextLine - pega a proxima linha no meu arquivo

        scanner.close();
    }
}
