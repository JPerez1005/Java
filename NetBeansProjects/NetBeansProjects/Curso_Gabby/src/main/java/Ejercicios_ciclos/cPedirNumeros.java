package Ejercicios_ciclos;

import javax.swing.JOptionPane;


public class cPedirNumeros {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este programa es hecho para la "
                + "digitalizacion\nde numeros y mostrar cuantos numeros fueron"
                + " digitados,\nEl programa se cierra al digitar un cero"
                + "\npara continuar presione OK");
        int a,i=0;
        do {
            a=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite "
                    + "un numero: "));
            i++;
        } while (a!=0);
        
        JOptionPane.showMessageDialog(null, "El total de numeros digitados "
                + "fueron: "+i);
        
    }
    
}
