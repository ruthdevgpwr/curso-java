package exercicios_java.exer05;

import java.util.ArrayList;
import java.util.List;

public class SelecionaCaminhao extends Controle {

    private static List<Caminhao> caminhoes = new ArrayList<>();

    public static void selecionarMaisApto() {

//        if (caminhoes.size() == 0) {
//            System.out.println("Nenhum caminhão foi adicionado");
//            return;
//        }

        try {
            Caminhao caminhaoComMaiorCapacidade = caminhoes.get(0);

            for (Caminhao caminhao : caminhoes) {
                if (
                        caminhao.getNumeroDePluviometrosASeremTransportados()
                                > caminhaoComMaiorCapacidade.getNumeroDePluviometrosASeremTransportados()
                ) {
                    caminhaoComMaiorCapacidade = caminhao;
                }
            }
            System.out.println("~~~~~~~~~~~~~~~~~~");
            System.out.println("Tipo: " + caminhaoComMaiorCapacidade.getTipo());;
            System.out.println("Pluviômetros transportados: " + caminhaoComMaiorCapacidade.getPluviometros());;
            System.out.println("~~~~~~~~~~~~~~~~~~");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nenhum caminhão foi adicionado");
        }
    }

    public void adiciona(Caminhao caminhao) {
        caminhoes.add(caminhao);
    }
}

