package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste;

import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.CalculadoraDeImposto;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.SeguroVida;

public class TesteTributaveis {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroVida seguro = new SeguroVida();

        CalculadoraDeImposto calc = new CalculadoraDeImposto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImoposto());
    }
}
