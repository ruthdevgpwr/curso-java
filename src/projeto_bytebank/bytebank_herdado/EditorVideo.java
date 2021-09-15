package projeto_bytebank.bytebank_herdado;

public class EditorVideo extends Funcionario{

    public double getBonificacao(){
        System.out.println("Chamando o metdo de bonificacao do Editor de Vídeo.");
        return 150;
    }
}
