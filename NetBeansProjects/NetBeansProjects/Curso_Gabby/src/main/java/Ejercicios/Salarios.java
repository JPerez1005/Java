package Ejercicios;

//Hacer un programa que calcule e imprima el salario semanal  de un empleado
//a partir de sus horas semanales trabajadas y de su salario por hora

import java.util.Scanner;

public class Salarios {

    
    public static void main(String[] args) {
        Scanner decimales=new Scanner (System.in);
        Scanner enteros=new Scanner (System.in);
        float salario_hora,sum;
        byte horas_trabajadas;
        
        System.out.println("digite su salario por hora: ");
        salario_hora= decimales.nextFloat();
        System.out.println("digite las horas trabajadas en la semana: ");
        horas_trabajadas=decimales.nextByte();
        sum=salario_hora*horas_trabajadas;
        System.out.println("su salario de esta semana es de: "+sum);
        
    }
    
}
