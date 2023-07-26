package Ejercicios;

import javax.swing.JOptionPane;

/*Hacer un programa que lea un caracter por teclado y compruebe si es una letra
mayuscula
*/
public class Comprobacion_mayusculas {

    
    public static void main(String[] args) {
        char caracter;
        caracter=JOptionPane.showInputDialog("Digite un caracter").charAt(0);
        
        if(Character.isUpperCase(caracter)){
            JOptionPane.showMessageDialog(null, "el caracter esta en mayuscula");
        }else {
            JOptionPane.showMessageDialog(null, "el caracter esta en minuscula");
        }
    }
    
}
