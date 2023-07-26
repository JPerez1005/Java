/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        /*int numero;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        
        System.out.println("el numero digitado fue: "+numero);
        
        String cadena;
        
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        
        System.out.println("La cadena es: "+cadena);
        */
        
        char Caracter;
        
        System.out.println("Digite un caracter: ");
        Caracter=entrada.next().charAt(1);
        
        System.out.println("El caracter es: "+Caracter);
    }
    
}
