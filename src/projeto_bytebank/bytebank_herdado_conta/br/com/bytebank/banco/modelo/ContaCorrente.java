package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo;

import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo.Tributavel;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return " Número da Conta Corrente: " + super.getNumero();
    }

    @Override
    public int compareTo(Conta o) {
        return 0;
    }
}
