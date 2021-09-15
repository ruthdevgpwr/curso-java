package java_basico_alura;

public class TestaSomatoria {
    public static void main(String[] args) {

        int contador = 0;
        int total = 0;

        while (contador <= 10) {

            total += contador;

            System.out.println(total);
            contador++;
        }
        System.out.println(total);
    }
}
