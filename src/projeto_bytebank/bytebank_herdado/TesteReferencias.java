package projeto_bytebank.bytebank_herdado;

public class TesteReferencias {

    public static void main(String[] args) {


        Gerente g1 = new Gerente();
        g1.setNome("Emerson");
        g1.setSalario(5000.0);


        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500.0);

        Designer designer = new Designer();
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(editorVideo);
        controle.registra(designer);

        System.out.println(controle.getSoma());
    }
}
