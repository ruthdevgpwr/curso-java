package projeto_bytebank.bytebank_encapsulado;

public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);

        //conta está inconsistente em relacao a regra de negocio
        //conta.setAgencia(-50);
        //conta.setNumero(-330);

        // valor 0 por padrao, por isso que a conta está inconsistente
        System.out.println(conta.getAgencia());

        conta.setAgencia(123123);

        Conta conta2 = new Conta(1444, 1666);

        System.out.println(Conta.getTotal());
    }
}
