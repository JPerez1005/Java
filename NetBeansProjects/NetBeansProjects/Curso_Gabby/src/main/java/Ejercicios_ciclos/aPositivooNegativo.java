package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Leer un numero y mostrar si es positivo o negativo, el porceso se 
        termina hasta que se introduzca un cero*/

public class aPositivooNegativo {

    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null, "este programa esta diseñado para"
                + "\ndeterminar si un numero es positivo o negativo\n"
                + "al introducir cero se cierrra el programa\nPresione "
                + "yes para continuar");

        int a = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));

        if (a != 0) {
            if (a > 0) {
                JOptionPane.showMessageDialog(null, "el numero digitado es "
                        + "positivo");
            } else {
                JOptionPane.showMessageDialog(null, "el numero digitado es "
                        + "negativo");
            }
            while (a != 0) {
                a = Integer.parseInt(JOptionPane.showInputDialog("digite otro"
                        + " numero: "));
                if (a > 0) {
                    JOptionPane.showMessageDialog(null, "el numero digitado es "
                            + "positivo");
                } else {
                    JOptionPane.showMessageDialog(null, "el numero digitado es "
                            + "negativo");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "el numero digitado fue cero"
                    + "\n\n"
                    + "cerrando el programa.....");
        }

    }

}
