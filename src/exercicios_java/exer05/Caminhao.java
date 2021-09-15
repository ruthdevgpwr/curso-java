package exercicios_java.exer05;

import java.util.ArrayList;
import java.util.List;

public class Caminhao {

    private String tipo;
    private Integer numeroDePluviometrosASeremTransportados;
    private List<Pluviometro> pluviometros = new ArrayList<>();

    public Integer getNumeroDePluviometrosASeremTransportados() {
        return numeroDePluviometrosASeremTransportados;
    }

    public void setNumeroDePluviometrosASeremTransportados(Integer numeroDePluviometrosASeremTransportados) {
        this.numeroDePluviometrosASeremTransportados = numeroDePluviometrosASeremTransportados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void adicionaPluviometro(String tipo) {
        pluviometros.add(new Pluviometro(tipo));
    }

    public String getPluviometros() {
        String listaPluviometros = "";
        for (Pluviometro pluviometro : pluviometros) {
            listaPluviometros += pluviometro.getTipo() + " ";
        }
        return listaPluviometros;
    }
}
