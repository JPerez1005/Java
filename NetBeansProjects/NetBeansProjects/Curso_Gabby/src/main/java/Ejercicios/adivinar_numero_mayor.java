package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*pedir dos numeros y decir cual es el mayor o si son iguales*/

public class adivinar_numero_mayor {

    
    public static void main(String[] args) {
        float num1,num2;
        
        num1=Float.parseFloat(JOptionPane.showInputDialog("se digitaran dos "
                + "numero y se decidira \ncual numero es mayor o si son iguales"
                + "\ndigite el primer numero: "));
        num2=Float.parseFloat(JOptionPane.showInputDialog("digite el segundo "
                + "numero"));
        
        if(num1>num2){
            JOptionPane.showMessageDialog
            (null, "el numero "+num1+" es mayor que el "+num2);
        }else if(num1<num2){
            JOptionPane.showMessageDialog
            (null, "el numero "+num2+" es mayor que el "+num1);
        }else{
            JOptionPane.showMessageDialog(null, "son numeros iguales");
        }
    }
}
