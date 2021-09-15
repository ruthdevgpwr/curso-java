package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public int compareTo(Conta o) {
        return 0;
    }
}
