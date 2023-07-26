package Programacionats;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ñMatrices {

    public static void main(String[] args) {
        /*int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i = 0; i < 3; i++) {//numero de filas
            for (int j = 0; j < 3; j++) {//numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }*/
        Scanner entrada=new Scanner(System.in);
        int matriz[][],numFilas,numColumnas;
        numFilas=Integer.parseInt(JOptionPane.showInputDialog
                    ("Digite el numero de filas de la matrix"));
        numColumnas=Integer.parseInt(JOptionPane.showInputDialog
                    ("Digite el numero de columnas de la matrix"));
        
        
        matriz=new int[numFilas][numColumnas];
        
        System.out.println("Digite la matriz: ");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
