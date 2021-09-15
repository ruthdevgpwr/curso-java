package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class CalculadoraDeImposto {

    private double totalImoposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImoposto += valor;
    }

    public double getTotalImoposto() {
        return totalImoposto;
    }
}
