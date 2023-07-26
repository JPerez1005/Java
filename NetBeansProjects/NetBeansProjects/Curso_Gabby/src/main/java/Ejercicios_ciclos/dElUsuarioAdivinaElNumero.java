package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Realizar un juego para adivinar un número. Para ello generar un número
        aleatorio entre 0-100, y luego ir pidiendo números indicando
        “es mayor” o “es menor” según sea mayor o menor con respecto a N. 
        El proceso termina cuando el usuario acierta y mostrar el número 
        de intentos.*/
public class dElUsuarioAdivinaElNumero {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este programa fue hecho para que\n"
                + "usted pueda introducir numeros e intentar acertar\nel numero"
                + " que genera la maquina\n el numero esta desde 0 a 100\nPara"
                + " salir Presione 0 o cierre el programa\n"
                + "para continuar presione OK");

        int azar, i = 0, e;
        String a;
        do {
            azar = (int) (Math.random() * 100);
            do {
                i++;
                e = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"
                ));
                if (e > azar) {
                    JOptionPane.showMessageDialog(null, "El numero es menor");
                } else if (e < azar) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor");
                } else if (e == azar) {
                    JOptionPane.showMessageDialog(null, "El numero es :" + azar
                            + " FELICIDADES!!!!\nSu numero de intetos fue de:"
                            + i);
                }
            } while (azar != e);
            a = JOptionPane.showInputDialog("Desea continuar?"
                    + "\n\nPara continuar digite si"
                    + "\nPara salir digite no").toLowerCase();
        } while (a.equals("si"));
        JOptionPane.showMessageDialog(null, "El Programa esta cerrando....");

    }

}
