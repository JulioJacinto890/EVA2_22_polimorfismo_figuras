/*

 */
package eva2_22_polimorfismo_figuras;


public class Circulo1 implements Figuras1{

private double radio;

    Circulo1() {
 
    }
  public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo1(double radio) {
        this.radio = radio;
    }
 
@Override
    
public double calcularA(){
return Math.PI*(radio*radio);    
}    

@Override

public double calcularPe(){
return Math.PI*(radio*2);
}      

public void ImprimirDatos(){
    System.out.println("\nCírculo.");
    System.out.println("Radio: " +radio);
    System.out.println("Área: " +calcularA());
    System.out.println("Perímetro: " +calcularPe());    
}


    
}
