package Ejercicios;

import java.util.Scanner;

/*La Calificacion final de un estudiante de informatica se calcula con base 
        a las calificaciones de cuatro aspectos de su rendimiento academico :
        participacion , primer examen parcial, segundo examen parcialy examen 
        final. Sabiendo que las calificaciones anteriores entran a la calificacion 
        final con ponderaaciones del 10%, 25%, 25% y 40%, Hacer un programa que
        calcule e imprima la calificaion final obtenida por un estudiante*/

public class Calificaciones_finales {

    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        float nota1,nota2,nota3,nota4,suma;
        
        System.out.println("Digite la nota de la participacion del estudiante:");
        nota1=entrada.nextFloat();
        
        System.out.println("Digite la nota del examen 1 del estudiante:");
        nota2=entrada.nextFloat();
        
        System.out.println("Digite la nota del examen 2 del estudiante:");
        nota3=entrada.nextFloat();
        
        System.out.println("Digite la nota del examen final del estudiante:");
        nota4=entrada.nextFloat();
        
        suma=(float) ((nota1*0.1)+(nota2*0.25)+(nota3*0.25)+(nota4*0.40));
        
        System.out.println("la calificacion final del estudiante es: "+suma);
    }
    
}
