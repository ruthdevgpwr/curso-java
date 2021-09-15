package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste;

import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.Cliente;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        //int[] idades = new int[5];

        Object[] referencias = new Object[5];

        System.out.println(referencias.length);

        ContaCorrente cc1 = new ContaCorrente(22, 11);

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        //System.out.println(cc2.getNumero());

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        //System.out.println(ref.getNumero()); //e a mesma coisa de;
        //System.out.println(cc2.getNumero());
    }
}
