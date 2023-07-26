package Ejercicios;

import javax.swing.JOptionPane;

/*Hacer un programa que simule un cajero automático con un saldo inicial
        de 1000 dólares, con el siguiente menú de opciones:

        1. Ingresar dinero a la cuenta.
        2. Retirar dinero de la cuenta.
        3. Salir*/
public class Cuenta {

    
    public static void main(String[] args) {
        int cuenta=Integer.parseInt(JOptionPane.showInputDialog("Hola Señor usuario,"
                + " Este programa fue hecho para\nLa digitalizacion de su"
                + " cuenta bancaria su saldo inicial es de 1000 dolares"
                + "\n sus opciones son: -1. Ingresar dinero a la cuenta\n"
                + "-2. Retirar dinero de la cuenta\n-3. Salir"
                + "\n\n\nPor favor "
                + "digite el primer numero:"));
        float saldoInicial= 1000f,suma,resta,operacion;
        
        switch(cuenta){
            case 1: 
                suma=Float.parseFloat(JOptionPane.showInputDialog("Ah digitado "
                        + "el numero uno\n"
                        + "cuanto desea ingresar a su cuenta?: "));
                saldoInicial+=suma;
                JOptionPane.showMessageDialog(null,"Ahora su saldo es de: "+
                        saldoInicial);
                break;
            case 2:
                resta=Float.parseFloat(JOptionPane.showInputDialog("Ah digitado "
                        + "el numero dos\n"
                        + "cuanto desea retirar de su cuenta?: "));
                saldoInicial+=resta;
                JOptionPane.showMessageDialog(null,"Ahora su saldo es de: "+
                        saldoInicial);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Saliendo...");
                break;
            
            
            default:JOptionPane.showMessageDialog(null,"El numero escrito no esta"
                    + "\ndentro de las opciones");
        }
    }
    
}
