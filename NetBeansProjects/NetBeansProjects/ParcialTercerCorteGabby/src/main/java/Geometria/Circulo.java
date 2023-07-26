
package Geometria;

public class Circulo {
    public double radio;

    public Circulo() {
        
    }
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
public double Area(double radio) 
{
return Math.PI * Math.pow(radio, 2);
} 
}
