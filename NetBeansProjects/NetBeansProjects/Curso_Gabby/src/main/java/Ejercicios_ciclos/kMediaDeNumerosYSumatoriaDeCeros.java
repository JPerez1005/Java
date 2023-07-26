package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Pedir 10 números. Mostrar la media de los números positivos, la media de los 
números negativos y la cantidad de ceros.*/

public class kMediaDeNumerosYSumatoriaDeCeros {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Señor usuario Digite 10 numeros "
                + "\ny la maquina hallara la suma de estos mismos");

        int n, mp = 0, mn = 0, co = 0, cp = 0, cn = 0, tp = 0, tn = 0;

        for (int i = 1; i < 11; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                    + "digite el numero " + i));
            if (n > 0) {
                mp = mp + n;
                cp++;
            } else if (n < 0) {
                mn = mn + n;
                cn++;
            } else {
                co++;
            }
        }

        tp = mp / cp;
        tn = mn / cn;

        JOptionPane.showMessageDialog(null,
                "La media de los numeros positivos es: " + tp
                + "\nLa media de los numeros negativos es: " + tn
                + "\nEL numero total de ceros es: " + co);
    }

}
