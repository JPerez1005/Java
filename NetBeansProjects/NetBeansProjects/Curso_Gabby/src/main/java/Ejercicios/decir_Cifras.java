package Ejercicios;

import javax.swing.JOptionPane;

/* pedir un numero entre 0 99999 y decir cuantas cifras tiene*/
public class decir_Cifras {

    
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Hola Señor usuario,"
                + " Este programa fue hecho para\nLa digitalizacion de un"
                + " numero y decir las cifras del numero\n\n\nPor favor digite"
                + " el numero:"));
        
        if(a<10){
            JOptionPane.showMessageDialog(null, "el numero es: "+a+"\ncon una "
                    + "cifra");
        }else if(a<100){
            JOptionPane.showMessageDialog(null, "el numero es: "+a+"\ncon dos "
                    + "cifras");
        }else if(a<1000){
            JOptionPane.showMessageDialog(null, "el numero es: "+a+"\ncon tres "
                    + "cifras");
        }else if(a<10000){
            JOptionPane.showMessageDialog(null, "el numero es: "+a+"\ncon cuatro"
                    + " cifras");
        }else if(a<100000){
            JOptionPane.showMessageDialog(null, "el numero es: "+a+"\ncon cinco"
                    + " cifras");
        }else{
            JOptionPane.showMessageDialog(null, "el numero digitado es de mas "
                    + "de cinco cifras\n"+a);
        }
    }
    
}
