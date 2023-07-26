package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*pide un numero (que debe estar entre 0 y 10)y mostrar la tabla de 
        multiplicar de dicho numero*/
public class ntablasMultiplicar {

    public static void main(String[] args) {

        byte numero = Byte.parseByte(JOptionPane.showInputDialog(null,
                "Por favor digite un numero de cero a diez"));

        for (int i = 1; i < 11; i++) {

            System.out.println(numero + " x " + i + " = "
                    + (numero * i));
        }
    }

}
