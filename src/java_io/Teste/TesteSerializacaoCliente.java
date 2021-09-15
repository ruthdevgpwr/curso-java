package java_io.Teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();

        //String nome = "Nico Steppat";

        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.in"));
        oos.writeObject(nome);
        oos.close();*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java_io/Teste/objeto.in"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);
    }
}
