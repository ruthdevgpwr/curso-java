package projeto_bytebank.bytebank_herdado;

public class TesteFuncionario {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();


        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("22335566-80");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
