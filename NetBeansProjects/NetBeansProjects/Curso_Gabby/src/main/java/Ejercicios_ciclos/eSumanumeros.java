package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Pedir numeros hasta que se teclee un 0, mostrar la suma de todos 
        los numeros introducidos*/

public class eSumanumeros {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Este Programa fue diseñado para la"
                + "\ndigitalizacion de numeros \ny la suma de estos mismos",
                "Sumatoria de los numeros", 1);
        int a, b = 0;
        byte i = 0;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite"
                    + "un numero", "Digite cero para salir"));
            i++;
            b = b + a;
        } while (a != 0);

        JOptionPane.showMessageDialog(null, "Digito numeros " + i + " veces\n"
                + "La suma total de todos\nlos numeros introducidos es: " + b);

    }

}
