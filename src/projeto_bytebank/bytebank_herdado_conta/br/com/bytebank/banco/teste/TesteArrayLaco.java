package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste;

public class TesteArrayLaco {

    public static void main(String[] args) {

        int[] idades = new int[5]; //inicializa o array com 0

        for (int i = 0; i < idades.length; i++){
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);;
        }

    }
}
