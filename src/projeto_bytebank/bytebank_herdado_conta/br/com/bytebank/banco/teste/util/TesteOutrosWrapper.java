package projeto_bytebank.bytebank_herdado_conta.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {


    public static void main(String[] args) {


        Integer idadeRef = Integer.valueOf(29);
        System.out.println(idadeRef.doubleValue());

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef);

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);
    }


}
