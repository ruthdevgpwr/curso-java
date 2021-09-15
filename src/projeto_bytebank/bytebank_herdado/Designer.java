package projeto_bytebank.bytebank_herdado;

public class Designer extends Funcionario{


    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificacao do Designer");
        return 200;
    }
}
