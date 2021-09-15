package projeto_bytebank.bytebank;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("A primeira conta tem " + primeiraConta.saldo + "reais");
        primeiraConta.saldo += 100;
        System.out.println("A primeira conta tem " + primeiraConta.saldo + "reais");

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("A segunda conta tem: " + segundaConta.saldo + " reais");

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.titular);

        if (primeiraConta == segundaConta) {
            System.out.println("São as mesmas contas");
        } else {
            System.out.println("São contas diferentes");
        }
    }
}
