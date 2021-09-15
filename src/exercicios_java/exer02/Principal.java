package exercicios_java.exer02;

public class Principal {

    public static void main(String[] args) {

       Agenda agenda = new Agenda();
       agenda.armazenaPessoa("Ruth",29, 1.65);
       agenda.armazenaPessoa("Emerson",33, 1.65);
       agenda.armazenaPessoa("Thiago",45, 1.65);
       agenda.armazenaPessoa("Kamilla",89, 1.65);
       agenda.armazenaPessoa("Tulio",30, 1.65);
       agenda.armazenaPessoa("Paula",42, 1.65);
       agenda.armazenaPessoa("Lucas",22, 1.65);
       agenda.armazenaPessoa("Jussara",25, 1.65);
       agenda.armazenaPessoa("Alex",28, 1.65);
       agenda.armazenaPessoa("Osvany",40, 1.65);
       agenda.armazenaPessoa("Josenilson",36, 1.65);

       int indiceRuth = agenda.buscaPessoa("Ruth");
       int indiceOsvany = agenda.buscaPessoa("Osvany");
       int indicePedro = agenda.buscaPessoa("Pedro");
       int indiceMaria = agenda.buscaPessoa("Maria");

       System.out.println(indiceRuth);
       System.out.println(indiceOsvany);
       System.out.println(indiceMaria);

       //agenda.removePessoa("Ruth");

      indiceRuth = agenda.buscaPessoa("Ruth");

      System.out.println(indiceRuth);

      agenda.imprimePessoa(0);

      agenda.imprimeAgenda();




    }
}
