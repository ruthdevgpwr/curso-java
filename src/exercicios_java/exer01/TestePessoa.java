package exercicios_java.exer01;

import java.text.ParseException;

public class TestePessoa {

    public static void main(String[] args) throws ParseException {

        Pessoa ruth = new Pessoa("Ruth", "10/01/1992", 1.64);
        ruth.imprimirDados();
        ruth.calcularIdade();

        Pessoa emerson = new Pessoa("Emerson", "27/09/1988", 1.69);
        emerson.imprimirDados();
        emerson.calcularIdade();

        Pessoa samara = new Pessoa("Samara ", "24/05/1990", 1.70);
        samara.calcularIdade();
        samara.imprimirDados();

    }
}
