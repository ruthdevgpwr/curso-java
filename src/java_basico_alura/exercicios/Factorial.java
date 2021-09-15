package java_basico_alura.exercicios;

public class Factorial {

    public static void main(String[] args) {
        int fatorial = 1;
        for (int n = 1; n < 11; n++) {
            fatorial *= n;
            System.out.println("O fatorial  de " + n + " = " + fatorial);
        }
    }
}
