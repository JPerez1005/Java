package Ejercicios;

import javax.swing.JOptionPane;

/*Hacer un programa que tome dos numeros y diga si ambos son pares o impares*/

public class Numeros_Pareeimpares {

    
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Hola Señor usuario,"
                + " Este programa fue hecho para\nLa digitalizacion de dos"
                + " numeros y averiguar si es par o impar\n\n\nPor favor digite"
                + " el primer numero"));
        
        int b=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el"
                + " segundo numero"));
        
        if(a%2==0 && b%2==0){
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        }else if(a%2==0){
            JOptionPane.showMessageDialog(null, "Solo el primer numero es par: "
                    +a+"\nel segundo numero es impar: "+b);
        }else if(b%2==0){
            JOptionPane.showMessageDialog(null, "Solo el segundo numero es par: "
                    +b+"\nel primer numero es impar: "+a);
        }else{
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
        }
    }
    
}
