package Ejercicios_ciclos;

import javax.swing.JOptionPane;

    /*Pedir diez numeros y escribir la suma total*/
public class isumadedieznumeros {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite diez numeros para hallar "
                + "la suma", "suma de numeros", 1);
        int suma,s2=0;
        for (int i = 0; i < 10; i++) {
            suma=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"
                    + " "+(i+1)+".", "Digite aquí"));
            s2=s2+suma;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los diez numeros es: "+s2);
    }
    
}
