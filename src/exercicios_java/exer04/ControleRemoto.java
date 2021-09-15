package exercicios_java.exer04;

public class ControleRemoto {

    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void aumentarVolume() {
        int volumeAtual = televisao.getVolume();
        televisao.setVolume(volumeAtual + 1);
        System.out.println("Volume " + televisao.getVolume());
    }

    public void diminuirVolume() {
        int volumeAtual = televisao.getVolume();
        televisao.setVolume(volumeAtual - 1);
        System.out.println("Volume " + televisao.getVolume());
    }

    public void aumentarNumeroCanal() {
        int canalAtual = televisao.getCanal();
        televisao.setCanal(canalAtual + 1);
        System.out.println("Canal " + televisao.getCanal());
    }

    public void diminuirNumeroCanal() {
        int canalAtual = televisao.getCanal();
        televisao.setCanal(canalAtual -1);
        System.out.println("Canal " + televisao.getCanal());
    }

    public void trocarParaCanal(int canal){
        televisao.setCanal(canal);
        System.out.println("Canal " + canal);
    }

}
