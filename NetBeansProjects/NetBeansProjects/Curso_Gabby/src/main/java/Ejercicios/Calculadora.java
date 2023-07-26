package Ejercicios;

import javax.swing.JOptionPane;

/*Construir un programa que simule el funcionamiento de una calculadora que
puede realizar las  cuatro operaciones aritméticas básicas (suma, resta, 
producto y división) con valores numéricos enteros. El usuario debe especificar
la operación con el primer carácter del primer parámetro de la línea de 
comandos: S o s para la suma, R o r para la resta, P, p, M o m para el producto
y D o d para la división.
 */
public class Calculadora {

    
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Hola Señor usuario,"
                + " Este programa fue hecho para\nLa digitalizacion de dos"
                + " numeros y hacer una operacion aritmetica\n\n\nPor favor "
                + "digite el primer numero:"));
        
        int b=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el"
                + " segundo numero:"));
        
        char letra=JOptionPane.showInputDialog("Las operaciones aritmeticas"
                + "\n seran de la siguiente manera:\n -s. Para sumar\n"
                + "-r. Para restar\n-m. Para multiplicar\n-d. Para dividir\n"
                + "por favor digite el caracter dependiendo de \n"
                + "la operacion aritmetica que desee obtener").toLowerCase().charAt(0);
        
        switch(letra){
            case 's': 
                JOptionPane.showMessageDialog(null,"el primer numero digitado"
                        + " fue: "+a+"\nel segundo numero digitado fue: "+b+
                        "\nLa suma de estos numeros es: "+(a+b));
                break;
            case 'r':
                JOptionPane.showMessageDialog(null,"el primer numero digitado"
                        + " fue: "+a+"\nel segundo numero digitado fue: "+b+
                        "\nLa resta de estos numeros es: "+(a-b));
                break;
            case 'm':
                JOptionPane.showMessageDialog(null,"el primer numero digitado"
                        + " fue: "+a+"\nel segundo numero digitado fue: "+b+
                        "\nLa multiplicacion de estos numeros es: "+(a*b));
                break;
            case 'd':
                JOptionPane.showMessageDialog(null,"el primer numero digitado"
                        + " fue: "+a+"\nel segundo numero digitado fue: "+b+
                        "\nLa divicion de estos numeros es: "+(a/b));
                break;
            
            default:JOptionPane.showMessageDialog(null,"la letra escrita no esta"
                    + "\ndentro de las opciones");
        }
    }
    
}
