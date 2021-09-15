package exercicios_java.exer03;

public class TestaElevador {

    public static void main(String[] args) {

        Elevador elevador = new Elevador();
        elevador.inicializa(3, 3);

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();

        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();

        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();
    }
}


