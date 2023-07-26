package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*Hacer un programa que lea un numero entero y muestre si el numero es
multiplo de diez
*/

public class Multiplo_de_diez {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un "
                + "numero: "));
        
        if(numero%10==0){
            JOptionPane.showMessageDialog(null, "el numero es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "el numero no es multiplo de 10");
        }
    }
    
}
