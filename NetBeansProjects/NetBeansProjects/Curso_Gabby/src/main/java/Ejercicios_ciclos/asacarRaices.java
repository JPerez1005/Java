package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se 
        introduzca un número negativo.*/
public class asacarRaices {

    public static void main(String[] args) {
        int a, raiz;

        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Hola Señor usuario,"
                    + " Este programa fue hecho para\nLa digitalizacion de "
                    + " numeros y obtener su raiz\n\n\nPor favor digite"
                    + " el numero:"));
            raiz = (int) Math.sqrt(a);
            JOptionPane.showMessageDialog(null, "La raiz del numero: " + a + "\nes:"
                    + " " + raiz + ".");
        } while (a > 0);
    }

}
