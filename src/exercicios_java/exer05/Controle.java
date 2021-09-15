package exercicios_java.exer05;

import java.util.Scanner;

public class Controle {

    public static String leString() {
        String texto;
        Scanner entrada = new Scanner(System.in);
        texto = entrada.next();
        return texto;
    }

    public static Integer leInteiro() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        return numero;
    }
}
