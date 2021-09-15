package exercicios_java.exer01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private double altura;


    public Pessoa(String nome, String dataNascimento, double altura) throws ParseException {
        this.nome = nome;
        this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.dataNascimento);
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //this.dataNascimento = dateFormat.parse(dataNascimento);
        this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;

    }

    public void imprimirDados(){
        System.out.println("Nome:" + nome);
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Altura: " + altura + "m");
    }

    public void calcularIdade(){
        int anoNascimento = Integer.parseInt(new SimpleDateFormat("yyyy").format(this.dataNascimento));
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);
    }

}
