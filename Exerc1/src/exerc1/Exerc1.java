package exerc1;

public class Exerc1 {

    public static void main(String[] args) {
        Aluno pessoa1 = new Aluno("Lorenzo", 13, "62742030");
        pessoa1.exibirInformacoes();
        System.out.println("Idade: " + pessoa1.getIdade());
    }
}
