package java_basico_alura;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 20;
        int quantidadePessoas = 1;

        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }
    }
}
