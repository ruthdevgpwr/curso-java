package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class SeguroVida implements Tributavel {


    @Override
    public double getValorImposto() {
        return 42;
    }
}
