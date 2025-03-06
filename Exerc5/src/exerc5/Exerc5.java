
package exerc5;

public class Exerc5 {

    public static void main(String[] args) {
        Circulo C1 = new Circulo();
        Retangulo R1 = new Retangulo();
        
        R1.definirDimensoes(2.4, 55);
        R1.definirCor("Roxo");
        R1.calcularArea();
        C1.definirDimensoes(70);
        C1.definirCor("Verde");
        C1.calcularArea();
    }
    
}
