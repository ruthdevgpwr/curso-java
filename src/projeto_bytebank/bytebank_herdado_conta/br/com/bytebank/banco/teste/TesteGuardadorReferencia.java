package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste;

import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencia {

    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}
