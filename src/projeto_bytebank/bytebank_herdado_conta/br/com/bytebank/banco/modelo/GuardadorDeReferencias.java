package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias(){
        this.referencias = new Object[10];
        posicaoLivre = 0;
    }

    public void adiciona(Object ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeElementos(){
        return this.posicaoLivre;
    }

    public Object getReferencia(int posicao) {
        return this.referencias[posicao];
    }
}
