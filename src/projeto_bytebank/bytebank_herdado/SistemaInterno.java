package projeto_bytebank.bytebank_herdado;

public class SistemaInterno {

    private int senha = 222;

    public void autentica(Autenticavel funcionarioAutenticavel) {
        boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }
}
