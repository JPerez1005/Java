package Programacionats;

import javax.swing.JOptionPane;


public class hCondicional_Swicht {

    
    public static void main(String[] args) {
        /*el swicht sirve principalmente como una interfaz o mejor resumida como
        el menu de opciones, para poder hacer un menu se pueden de diferentes
        metodos pero esa es una historia para otr clase por ahora continuaremos
        con el modo normal :) */
        
        byte opcion; //es mejor tener la opcion en byte, nocreo que hayan mas de
        //128 opciones 
        
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Digite una opcion\n"
                + "entre el 1 y el 5:"));
        
        switch(opcion){
            case 1: 
                JOptionPane.showMessageDialog(null,"este es el numero 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"este es el numero 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"este es el numero 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"este es el numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"este es el numero 5");
                break;
            default:JOptionPane.showMessageDialog(null,"el numero no esta "
                    + "\ndentro de las opciones");
        }
        
        
    }
    
}
