package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/* Diseñar un programa que muestre el producto de los 10 primeros
        números impares.*/
public class jproductonumerosimpares {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Señor usuario Digite 10 numeros "
                + "impares \ny la maquina hallara la suma de estos mismos");
        int impares, suma = 0;
        for (int i = 1; i < 11; i++) {
            do {
                impares = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                        + " el "+ i + " numero"));
                if (impares % 2 != 0) {
                    suma = suma + impares;
                } else {
                    JOptionPane.showMessageDialog(null, "Lo lamento el numero "
                            + "que ingreso no es impar,\npor favor vuelva a "
                            + "repetir");
                }
            } while (impares % 2 == 0);
        }
        
        JOptionPane.showMessageDialog(null,"La suma de los numeros es:\n"+suma);
    }

}
