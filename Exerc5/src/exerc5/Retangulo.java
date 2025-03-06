
package exerc5;

public class Retangulo extends Forma{
    private double largura, altura, area;
    
    public void definirDimensoes(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }
    
    public void definirCor(String cor){
        this.cor = cor;
    }
    
    @Override
    public void calcularArea() {
        area = altura * largura;
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Cor: " + cor);
        System.out.println("=============================");
    }
    
}
