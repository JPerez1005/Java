/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                + " la cantidad de elementos que quiere digitar"));
        
        char[] letras = new char[nElementos];
        
        System.out.println("Digite los elementos del arreglo: ");
        for(int i=0;i<nElementos;i++)
        {
            System.out.println((i+1)+" Digite un caracter: ");
            letras[i]=entrada.next().charAt(0);
        }
        
        System.out.println("\n los caracteres digitados fueron: ");
        for(int i=0;i<nElementos;i++)
        {
            System.out.println(letras[i]);
        }
    }
    
}
