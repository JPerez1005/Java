package Ejercicios_ciclos;

import javax.swing.JOptionPane;

/*Pedir 10 sueldos mostrar su suma y cuantos hay mayores de $1000*/

public class lSueldos {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Señor usuario Digite 10 sueldos");
        
        float sueldo,sumatoria=0;
        byte contsueldo=0;
        for (int i = 1; i < 11; i++) {
            sueldo=Float.parseFloat(JOptionPane.showInputDialog("Por favor digite el sueldo numero "+i));
            
            if (sueldo>1000) {
                contsueldo++;
            }
            
            sumatoria=sumatoria+sueldo;
        }
        
        JOptionPane.showMessageDialog(null,
                "Suma total de sueldos: " + sumatoria
                + "\nLos numeros mayores de 1000 son: " + contsueldo);
        
    }
    
}
