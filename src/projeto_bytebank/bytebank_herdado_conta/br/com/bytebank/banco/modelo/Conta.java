package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 *
 * @author ruthd
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     *
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     *
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta" + this.numero);
    }

    public abstract void deposita(double valor);

    /**
     *
     * Valor recisa ser maior do que o saldo.
     *
     * @param valor
     * @return
     */

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {

        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
        }
        this.numero = numero;

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref){

        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia){
            return false;
        }

        if (this.numero != outra.numero){
            return false;
        }
        return true;
    }
}

