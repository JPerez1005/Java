package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Leer números hasta que se introduzca un 0. Para cada uno indicar si 
        es par o impar.*/
public class bParoImpar {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este programa es\n para indicar si"
                + " un numero es par o impar,\nel programa se cierra cuando se"
                + " digite un cero, \npara continuar presione yes");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite "
                + "el numero: "));

        if (a != 0) {
            if (a % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero " + a +
                        " es par");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + a +
                        " es impar");
            }
            while (a != 0) {
                a = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                        + "digite otro numero"));
                if (a % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "El numero " + a + 
                            " es par");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero " + a + 
                            " es impar");
                }
                
                if (a == 0) {
                    JOptionPane.showMessageDialog(null, "El numero digitado fue"
                            + " cero\n"
                            + "Cerrando el programa... ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El numero digitado fue cero\n"
                    + "Cerrando el programa... ");
        }
    }

}
