/*

 */
package eva2_22_polimorfismo_figuras;


public class Triangulo1 implements Figuras1{

private double base;
private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
  public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo1(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }    
 public Triangulo1(){
      
  }

@Override  
    
public double calcularA(){
 return (base*altura)/2;   
}    

@Override

public double calcularPe(){
double hip = Math.hypot(base, altura);
return base+altura+hip;
}    

public void ImprimirDatos(){
    System.out.println("\nTriángulo.");
    System.out.println("Base: " +base);
    System.out.println("Altura: " +altura);
    System.out.println("Área: " +calcularA());
    System.out.println("Perímetro: " +calcularPe());    
}

    
}
