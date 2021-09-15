package projeto_bytebank.bytebank_herdado;

//nao pode instanciar dessa classe abstrata, apenas filha dessa classe que não seja abstrata
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;


    //metodo sem corpo, nao ha implementacao desse metodo aqui, mas os filhos precisam implementar esse metodo
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
