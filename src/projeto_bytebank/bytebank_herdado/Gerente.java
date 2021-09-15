package projeto_bytebank.bytebank_herdado;

//Gerente é um Funcionario || Gerente herda da classe Funcionario, assina contrato Autenticavel(implements), eh um autenticavel

public class Gerente extends Funcionario implements Autenticavel {


    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
