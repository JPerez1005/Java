package Programacionats;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class fSentencia_if {

    
    public static void main(String[] args) {
        
        /*La sentencia if trata principalmente de una de las condicionales mas
        usadas en el universo :) , si estas solo y no tienes con quien hablar
        puedes crear una base de datos entera de if , ¿para que existe alexa, 
        roxana y siri si tenemos el if? , primeramente hay que aclarar que no 
        todo en el if se cumple, muchas gracias por su atencion
        */
        
        Scanner entrada=new Scanner(System.in);
        
        String r,r1,r2;
                r=JOptionPane.showInputDialog("hola");
        if("hola".equals(r)){
            r1=JOptionPane.showInputDialog("como estas?");
            if("bien".equals(r1)){
                JOptionPane.showMessageDialog(null, "que bueno me alegro mucho por ti");
            }else if("mal".equals(r1)){
                JOptionPane.showMessageDialog(null, "espero su situacion mejore");
            }else {
                JOptionPane.showMessageDialog(null, "no entiendo lo que me dices humano :)");
            }
        }else if("chao".equals(r)){
            JOptionPane.showMessageDialog(null, "chao entonces");
        }else {
                JOptionPane.showMessageDialog(null, "no entiendo lo que me dices humano :)");
            }
        
        
    }
    
}
