package exercicios_java.exer05;

public class Principal {
    public static void main(String[] args) {

        SelecionaCaminhao selecionaCaminhao = new SelecionaCaminhao();

        // Vai adicionar vários caminhões ao objeto selecionaCaminhao
        while (true) {

            // Cria um novo caminhão a ser adicionado
            Caminhao caminhao = new Caminhao();

            System.out.println("Informe o tipo de caminhão ('Alfa' ou 'Beta') ou 'Fim' para encerrar: ");
            String tipo = Controle.leString();

            if (tipo.equalsIgnoreCase("fim")) break;

            caminhao.setTipo(tipo);

            System.out.println("Informe o número de pluviômetros a serem transportados: ");
            int numero = Controle.leInteiro();
            caminhao.setNumeroDePluviometrosASeremTransportados(numero);

            for (int i = 0; i < numero; i++) {
                System.out.println("Informe o tipo do pluviômetro " + (i + 1) + ": ");
                String tipoPluviometro = Controle.leString();
                caminhao.adicionaPluviometro(tipoPluviometro);
            }
            selecionaCaminhao.adiciona(caminhao);
        }

        SelecionaCaminhao.selecionarMaisApto();
    }
}
