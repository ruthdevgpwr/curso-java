package projeto_bytebank.bytebank;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.transfere(800, contaDoPaulo);

        if(sucessoTransferencia) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Faltou dinheiro!");
        }
        System.out.println("Conta da Marcela: " + contaDaMarcela.saldo);
        System.out.println("Conta do Paulo: " + contaDoPaulo.saldo);
    }
}
