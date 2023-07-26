package calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {

   
    public static void main(String[] args) {
        
        byte n1;
        byte n2;
        
        Scanner Variable = new Scanner(System.in);
        byte op;
        
        do{
            /*
            System.out.println("Digite la primera variable: ");
        n1=Variable.nextByte();
        System.out.println("Digite la segunda variable: ");
        n2=Variable.nextByte();*/
            
        
        op=Byte.parseByte(JOptionPane.showInputDialog("Menu calculadora"+
                "\n1.sumar"+
                "\n2.restar"+
                "\n3.Multiplicar"+
                "\n4.Dividir"+
                "\n5.Salir"));
        
        
            switch(op){
                case 1://suma
                    n1=Byte.parseByte(JOptionPane.showInputDialog("Digite la primera variable: "));
            n2=Byte.parseByte(JOptionPane.showInputDialog("Digite la segunda variable: "));
            
        Suma sum = new Suma(n1,n2);
        sum.mostrarResultado();
        break;
        
                case 2://resta
                    n1=Byte.parseByte(JOptionPane.showInputDialog("Digite la primera variable: "));
            n2=Byte.parseByte(JOptionPane.showInputDialog("Digite la segunda variable: "));
            
        Resta res = new Resta(n1,n2);
        res.mostrarResultado();
        break;
        
                case 3://multiplicacion
                    n1=Byte.parseByte(JOptionPane.showInputDialog("Digite la primera variable: "));
            n2=Byte.parseByte(JOptionPane.showInputDialog("Digite la segunda variable: "));
            
        Multiplicacion mul = new Multiplicacion(n1,n2);
        mul.mostrarResultado();
        break;
        
                case 4://division
                    n1=Byte.parseByte(JOptionPane.showInputDialog("Digite la primera variable: "));
            n2=Byte.parseByte(JOptionPane.showInputDialog("Digite la segunda variable: "));
            
        Division div = new Division(n1,n2);
        div.mostrarResultado();
        break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por venir!!!!");
                    break;
                }
        }while(op!=5);
    }
}
