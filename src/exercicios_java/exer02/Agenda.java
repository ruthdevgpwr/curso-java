package exercicios_java.exer02;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> contatos = new ArrayList<>(10);


    void armazenaPessoa(String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        contatos.add(pessoa);
    }

    int buscaPessoa(String nome) {
        for (Pessoa p : contatos) {
            if (p.getNome().equals(nome)) {
                return contatos.indexOf(p);
            }
        }
        return -1;
    }

    void removePessoa(String nome) {
        int indicePessoa = buscaPessoa(nome);
        contatos.remove(indicePessoa);
    }

    void imprimePessoa(int index) {
        if (index < contatos.size()) {
            Pessoa pessoa = contatos.get(index);
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
        } else {
            System.out.println("Índice vazio");
        }
    }

    void imprimeAgenda(){
        for (Pessoa i : contatos) {
            System.out.println(i);
        }
    }
}

