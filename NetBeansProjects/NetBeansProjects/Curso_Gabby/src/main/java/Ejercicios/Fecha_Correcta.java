package Ejercicios;

import javax.swing.JOptionPane;

/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta
        . Suponiendo todos los meses de 30 días.*/

public class Fecha_Correcta {

    
    public static void main(String[] args) {
        
        int dia,mes,año;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Hola Señor usuario,"
                + " Este programa fue hecho para\nLa digitalizacion de fechas"
                + "\n\n\nPor favor digite"
                + " el dia:"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el"
                + " mes:"));
        año=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el"
                + " año:"));
        
        if(dia>=1 && dia<=30){
            if(mes>=1 && mes<12){
                if(año !=0){
                    JOptionPane.showMessageDialog(null, "Fecha Correcta"
                            + "\n fecha introducida fue: "+dia+"/"+mes+"/"+año);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "año correcto");
                }
            
        }else{
            JOptionPane.showMessageDialog(null, "el mes es incorrecto");
        }
        }else{
            JOptionPane.showMessageDialog(null, "el dia es incorrecto");
        }
    }
    
}
