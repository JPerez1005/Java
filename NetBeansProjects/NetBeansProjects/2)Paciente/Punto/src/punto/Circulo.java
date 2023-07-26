
package punto;

public class Circulo extends Punto { 
private double radio; // radio del Circulo 

// constructor sin argumentos; el valor predeterminado de radio es 0.0 

    public Circulo() {
    }



public Circulo( double radio, int valorX, int valorY) {
        super(valorX, valorY);
        this.radio = radio;
}


// establecer el radio 
public void setRadio( double radio ) 
{ if (radio<0) //validar que no se ingrese un valor negativo
     this.radio=0;
  else
     this.radio = radio; 
} 

// devolver el radio 
public double getRadio() 
{ 
return radio; 
} 

// calcular y devolver el diámetro 
public double getDiametro() 
{ 
return 2 * getRadio(); 
} 

// calcular y devolver la circunferencia 
public double getCircunferencia() //2*PI*radio
{ 
  return Math.PI*2*getRadio();
} 

// sobrescribir el método abstracto obtenerArea para devolver área del Circulo 
public double getArea() 
{ 
return Math.PI * Math.pow(radio, 2);
} 

// sobrescribir el método abstracto obtenerNombre para devolver "Circulo" 
public String getNombre() 
{ 
return "Circulo"; 
} 

// sobrescribir toString para devolver la representación String de Circulo 
@Override
public String toString() 
{ 
return "Centro = " + super.toString() + "; Radio = " + getRadio(); 
} 

// Centro= [4,7]; Radio = 10       


} // fin de la clase Circulo
