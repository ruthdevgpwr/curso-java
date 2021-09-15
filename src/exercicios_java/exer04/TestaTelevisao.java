package exercicios_java.exer04;

public class TestaTelevisao {

    public static void main(String[] args) {

        Televisao televisaoDeRuth = new Televisao();
        ControleRemoto controleRemoto = new ControleRemoto(televisaoDeRuth);
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();

        controleRemoto.diminuirVolume();

        controleRemoto.aumentarNumeroCanal();
        controleRemoto.aumentarNumeroCanal();
        controleRemoto.aumentarNumeroCanal();

        controleRemoto.diminuirNumeroCanal();
        controleRemoto.diminuirNumeroCanal();
        controleRemoto.diminuirNumeroCanal();
        controleRemoto.diminuirNumeroCanal();


        controleRemoto.trocarParaCanal(20);

    }
}
