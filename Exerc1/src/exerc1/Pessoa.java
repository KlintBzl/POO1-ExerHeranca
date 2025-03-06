package exerc1;

public class Pessoa {
    protected String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
