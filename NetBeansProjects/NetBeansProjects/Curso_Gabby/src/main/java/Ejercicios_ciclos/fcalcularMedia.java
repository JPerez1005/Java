package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Pedir números hasta que se introduzca uno negativo, y calcular la 
        media.*/
public class fcalcularMedia {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este Programa fue diseñado para la"
                + "\ndigitalizacion de numeros \ny hayar la media de todos "
                + "ellos",
                "Calcular la media", 1);
        int a, b = 0, m;
        byte i = 0;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite"
                    + "un numero", "Digite un numero negativo para salir"));
            if (a > 0) {
                b = b + a;
                i++;
            }
        } while (a > 0);//mientras que a sea mayor a cero que siga continuando
        m = b / i;
        JOptionPane.showMessageDialog(null, "Digito numeros " + i + " veces\n"
                + "La media total de todos\nlos numeros introducidos es: " + m);
    }

}
