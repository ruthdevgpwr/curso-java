package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste;

import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayTipoObject {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22,11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22,22);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

        //Conta ref = contas[1];
        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(ref.getNumero());
    }
}
