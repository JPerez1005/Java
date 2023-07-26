
package Geometria;


public class Cono extends Circulo{
    public double altura;

    
    public Cono() {
        
    }
    public Cono(double altura, double radio) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
    public double Volumen(double radio,double altura)
    {
        
        return 1/3*Math.PI*Math.pow(radio, 2)*altura;
        
    }
    
}
