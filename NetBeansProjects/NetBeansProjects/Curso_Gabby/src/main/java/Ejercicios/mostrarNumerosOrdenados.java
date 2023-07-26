package Ejercicios;
//Pedir tres números y mostrarlos ordenados de mayor a menor.

import javax.swing.JOptionPane;


public class mostrarNumerosOrdenados {

    
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Hola Señor usuario,"
                + " Este programa fue hecho para\nLa digitalizacion de tres"
                + " numeros y ordenarlos de mayor a menor\n\n\nPor favor digite"
                + " el primer numero:"));
        
        int b=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el"
                + " segundo numero:"));
        
        int c=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el"
                + " tercer numero:"));
        
        if(a>b && b>c){
            JOptionPane.showMessageDialog(null, "su orden de mayor a menor es: "
                    + a+" | "+b+" | "+c);
        }else if(b>a && a>c){
            JOptionPane.showMessageDialog(null, "su orden de mayor a menor es: "
                    + b+" | "+a+" | "+c);
        }else if(c>a && a>b){
            JOptionPane.showMessageDialog(null, "su orden de mayor a menor es: "
                    + c+" | "+a+" | "+b);
        }else if(a>c && c>b){
            JOptionPane.showMessageDialog(null, "su orden de mayor a menor es: "
                    + a+" | "+c+" | "+b);
        }else if(c>b && b>a){
            JOptionPane.showMessageDialog(null, "su orden de mayor a menor es: "
                    + c+" | "+b+" | "+a);
        }else{
            JOptionPane.showMessageDialog(null, "su orden de mayor a menor es: "
                    + b+" | "+c+" | "+a);
        }
    }
    
}
