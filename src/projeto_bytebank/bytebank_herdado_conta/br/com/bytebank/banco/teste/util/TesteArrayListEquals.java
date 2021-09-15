package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste.util;

import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        List<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
