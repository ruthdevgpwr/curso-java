package exercicios_java.exer03;

public class Elevador {

    private int andarAtual; //terreo = 0 - desconsidera
    private int totalDeAndaresPredio;
    private int capacidadeDoElevador;
    private int qtdPessoasNoElevador;


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndaresPredio() {
        return totalDeAndaresPredio;
    }

    public void setTotalDeAndaresPredio(int totalDeAndaresPredio) {
        this.totalDeAndaresPredio = totalDeAndaresPredio;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public int getQtdPessoasNoElevador() {
        return qtdPessoasNoElevador;
    }

    public void setQtdPessoasNoElevador(int qtdPessoasNoElevador) {
        this.qtdPessoasNoElevador = qtdPessoasNoElevador;
    }

    void inicializa(int capacidadeDoElevador, int totalDeAndaresPredio) {
        andarAtual = 0;
        qtdPessoasNoElevador = 0;
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.totalDeAndaresPredio = totalDeAndaresPredio;
        System.out.println("Inicializando o elevador");
        System.out.println("A capacidade do elevador é de até " + capacidadeDoElevador + " pessoas");
    }

    public void entra(){
        if (qtdPessoasNoElevador < capacidadeDoElevador){
            qtdPessoasNoElevador ++;
            System.out.println("Pode entrar");
        } else {
            System.out.println("Capacidade máxima atingida");
        }
    }

    public void sai(){
        if (qtdPessoasNoElevador >= 1){
            qtdPessoasNoElevador--;
            System.out.println("Pode sair");
        }
        else {
            System.out.println("Não há pessoas no elevador");
        }
    }

    public void sobe(){
        if (andarAtual < totalDeAndaresPredio) {
            andarAtual++;
            System.out.println("Sobe");
            System.out.println("Você chegou no " + andarAtual + "ºandar");
        } else {
            System.out.println("Você já está no último andar");
        }
    }

    public void desce(){
        if (andarAtual >= 0){
            andarAtual--;
            System.out.println("Desce");
        }
        if (andarAtual < 0){
            System.out.println("Não desce");
        }

    }
}

