package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Testes {

    public static void main(String[] args) {


        int idade = 29; //Interger
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue(); //unboxing
        String s = args[0];
        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing


        //Autoboxing - transformação do primitivo para o objeto
        //Unboxing - da referencia/objeto para primitivo
        //Wrapper - Autoboxing e Unboxing


    }
}
