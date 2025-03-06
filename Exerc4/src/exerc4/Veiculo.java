package exerc4;

public class Veiculo {
    protected int velocidadeMaxima;
    
    public Veiculo(int vM){
        this.velocidadeMaxima = vM;
    }
    
    public void descrever(){
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
    }
    public void descrever(String extra){
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Descrição extra: " + extra);
    }
}
