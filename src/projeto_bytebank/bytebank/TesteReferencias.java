package projeto_bytebank.bytebank;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraconta = new Conta();
        primeiraconta.saldo = 300;

        System.out.println("Saldo da primeira conta: " + primeiraconta.saldo);

        Conta segundaconta = primeiraconta;

        System.out.println("Saldo da segunda conta:" + segundaconta.saldo);

        segundaconta.saldo += 100;

        System.out.println("Saldo da segunda conta: " + segundaconta.saldo);
        System.out.println("Saldo da primeira conta: " + primeiraconta.saldo);

        if (primeiraconta == segundaconta) {
            System.out.println("São as mesmas contas");
        } else {
            System.out.println("Não são as mesmas contas");
        }
    }
}
