package Programacionats;

import javax.swing.JOptionPane;


public class gExplicacion_if {

    
    public static void main(String[] args) {
        //las condicionales que existen son simples o dobles    
        byte numero, dato=5;
        
        numero= Byte.parseByte(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero==dato){
            JOptionPane.showMessageDialog(null, "su numero es 5");
        }else{
            JOptionPane.showMessageDialog(null, "su numero es diferente de 5");
        }
        
        if(numero<dato){
            JOptionPane.showMessageDialog(null, "su numero es menor que 5");
        }else if(numero>dato){
            JOptionPane.showMessageDialog(null, "su numero es mayor que 5");
        }
        
        /*los operadores que se pueden usar en las condiciones son:
        
        == igualdad
        != diferencia
        >  mayor
        <  menor
        >= mayor igual
        <= menor igual
        
        
        */
    }
    
}
