package Programacionats;

import javax.swing.JOptionPane;

public class lLLenarUnArreglo {
    
    public static void main(String[] args) {
        int nElementos;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog
                    ("Digite la cantidad de elementos del arreglo"));
        
        char[] letras= new char[nElementos];
        
        JOptionPane.showMessageDialog(null,
                "Digite los elementos del arreglo:");
        
        for (int i = 0; i < nElementos; i++) {
            letras[i]=JOptionPane.showInputDialog
                        ((i+1)+". Digite un caracter: ").charAt(0);
        }
        System.out.println("Los caracteres fueron almacenados y mostrados:");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1)+". caracter: "+letras[i]);
        }
    }
    
}
