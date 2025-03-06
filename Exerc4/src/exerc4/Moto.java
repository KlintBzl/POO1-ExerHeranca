package exerc4;

public class Moto extends Veiculo {
    
    private int cilindradas;

    public Moto(int vM, int cilindradas) {
        super(vM);
        this.cilindradas = cilindradas;
    }
    
    
    @Override
    public void descrever(){
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Cilindradas: " + cilindradas);
    }
    @Override
    public void descrever(String extra){
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Descrição extra: " + extra);
        System.out.println("Cilindradas: " + cilindradas);
    }
}
