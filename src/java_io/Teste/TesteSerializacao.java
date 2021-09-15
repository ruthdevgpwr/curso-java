package java_io.Teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("desenvolvedor");
        cliente.setCpf("121212121");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java_io/Teste/cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());
    }
}
