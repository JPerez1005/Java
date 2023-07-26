package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Pedir un numero N, y mostrar todos los numeros del 1 al N*/

public class gNumerosHasta {

    
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor"
                + " digite un numero al que quiera llegar rapidamente", 
                "iniciamos desde cero"));
        
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
    
}
