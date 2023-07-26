package Ejercicios;

//Hacer un programa que calcule e imprima la suma de tres calificaciones

import java.util.Scanner;


public class Operadores {

    
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        float notauno,notados,notatres,suma;
        
        System.out.println("Digite por favor la nota 1: ");
        notauno= entrada.nextFloat();
        System.out.println("Digite por favor la nota 2: ");
        notados= entrada.nextFloat();
        System.out.println("Digite por favor la nota 3: ");
        notatres= entrada.nextFloat();
        
        suma=notauno+notados+notatres;
        System.out.println("La nota final es: "+suma/3);
        
    }
    
}
