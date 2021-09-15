package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste;

public class TesteArray {

    //Array []
    public static void main(String[] args) {

        int[] idades = new int[5]; //inicializa o array na posicao 0(padrao)

        //inicializando o array
        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        int idade4 = idades[4];

        System.out.println(idade4);
        System.out.println(idades.length);
    }
}
