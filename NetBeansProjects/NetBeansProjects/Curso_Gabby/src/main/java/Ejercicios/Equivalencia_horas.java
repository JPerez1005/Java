package Ejercicios;

/*Construir un programa que, dado un total de horas, devuelve el numero
        de semanas, dias y horas equivalentes. por ejemplo, dado un total de 
        1000 horas debe mostrar 5 semanas, 6 dias y 16 horas*/

import java.util.Scanner;


public class Equivalencia_horas {

    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        long horas,días,semanas,horass;
        System.out.println("digite por favor el numero de horas:");
        horas=entrada.nextLong();
        
        semanas=horas/168;
        días=horas%168/24;
        horass=horas%24;
        
        System.out.println("las Horas: "+horas+"\nLos Días: "+días+"\n"
                + "Las Semanas: "+semanas+"\nHoras que sobraron: "+horass);
    }
    
}
