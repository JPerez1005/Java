/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class JOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        letra = JOptionPane.showInputDialog("Digite una cadena: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("introduzca un numero: "));
        
        JOptionPane.showMessageDialog(null,"su mensaje fue: "+cadena);
        JOptionPane.showMessageDialog(null,"su mensaje fue: "+entero);
        JOptionPane.showMessageDialog(null,"su mensaje fue: "+letra);
        JOptionPane.showMessageDialog(null,"su mensaje fue: "+decimal);
    }
    
}
