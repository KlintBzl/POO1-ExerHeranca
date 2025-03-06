
package exerc5;

public class Circulo extends Forma{
    private double raio, area;
    
    public void definirDimensoes(int raio){
        this.raio = raio;
    }
    public void definirDimensoes(double raio){
        this.raio = raio;
    }
    
    public void definirCor(String cor){
        this.cor = cor;
    }
    @Override
    public void calcularArea() {
        area = 3.14 * (raio * raio);
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
        System.out.println("Cor: " + cor);
        System.out.println("=============================");
    }
}
