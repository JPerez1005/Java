package Ejercicios;

import javax.swing.JOptionPane;

    /*un obrero necesita calcular su salario semanal, el cual se obtiene de la
siguiente manera
-Si trabaja 40 horas o menos se le paga  $16 por hora
-Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas
y $20 por cada hora extra

*/

public class Salario_Obrero {

    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Hola señor obrero, necesitamos\n"
                + "su informacion sobre sus horas de trabajo :)");
        
        int HorasTrabajadas,sobrante,s2,total,suma,suma2,Horafija=40;
        
        HorasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                + "digite sus\n horas trabajadas en la semana"));
        
        if (HorasTrabajadas<=40){
            JOptionPane.showMessageDialog(null, "Sus horas trabajadas son: "
                + HorasTrabajadas*16);
        }else {
            s2=HorasTrabajadas-40;
            suma=Horafija*16;
            suma2= s2*20;
            total=suma+suma2;
            JOptionPane.showMessageDialog(null, "Sus horas trabajadas son: "
                + total);
        }
        
    }
    
}
