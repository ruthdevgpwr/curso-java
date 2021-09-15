package projeto_bytebank.bytebank_herdado;

public class TesteSistema {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(g);
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(cliente);
    }
}
