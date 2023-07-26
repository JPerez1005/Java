package Programacionats;


public class iWhileAndDoWhile {

    
    public static void main(String[] args) {
         byte i=0;
         
         //Los ciclones es un remolino que da vueltas y vueltas es por eso
         //que en programacion java hay ciclos, procesos que se repiten y se 
         //repiten
         
         //en programacion java se usa mas que todo para repetir procesos y 
         //hacer diversas situaciones
        
        while(i<=10){
            System.out.println(i);
            i++;
        }
        /*precisamente el while tiene el ciclo while como sintaxis y en los 
        parentesis contiene la operacion o restriccion necesaria para
        parar o cerrar un ciclo, hasta donde llega un ciclo?, tu eres quien
        decide*/
        /*a diferencia del while el do while tiene entrada gratis, primero 
        entras y ahí si ocurre la restriccion, digamos algo as como que el
        while te pide identificacion al inicio y el do while te pide
        identificacion al final*/
        System.out.println("--------los siguientes numeros son hechos por el "
                + "\nciclo do while---------");
        do{
            i--;
            System.out.println(i);
            
        }while(i>=1);
    }
    
}
