package Programacionats;

import java.util.Scanner;

public class bEntrada_y_Salida_de_datos_por_consola {

   
    public static void main(String[] args) {
        //Scanner es una libreria y hay que importarla
        Scanner entrada= new Scanner(System.in);//a partir de esta linea se crea 
        //la entrada escaner, hagamos de cuenta que escaner es un objeto
        
        byte corto;
        
        System.out.println("Digite un numero desde el 1 hasta el 127: ");
        corto=entrada.nextByte();//aqui se hizo el llamado del objeto escaner
        //se hizo una fusion entre la variable corto y el objeto escaner
        //el numero que el usuario digita se quedara guardado en el objeto
        
        
        System.out.println("El numero digitado fue: "+corto);
        
        //algo a tener en cuenta con el tipo de dato primitivo float es que 
        //si digitamos un numero decimal, el dato flotante no nos lo aceptara
        //(asi que en vez de colocar 13.4 colocaremos 13,4), lo anterior es un 
        //ejemplo
        
        //Ahora procederemos a guardar cadenas de texto
        
        Scanner entradac= new Scanner(System.in);
        
        System.out.println("Digite una frase: ");
        String cadena=entradac.nextLine();//nextline guarda toda la frase
        
        System.out.println("la frase digitada fue: "+cadena);
        
        //Ahora solo guardaremos un caracter
        
        Scanner entradachar= new Scanner(System.in);
        
        System.out.println("digite una letra: ");
        char letra=entrada.next().charAt(0);
        System.out.println("la letra digitada fue: "+letra);
    }
    
}
