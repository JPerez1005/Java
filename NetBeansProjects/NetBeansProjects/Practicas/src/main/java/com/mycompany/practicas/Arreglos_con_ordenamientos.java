/*
Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
Estos los guardaremos en una tabla de tamaño 10. Leer un numero N, e insertarlo
e insertarlo en el lugar adecuado para que la tbla continue ordenada
 */
package com.mycompany.practicas;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Arreglos_con_ordenamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente= true;
        int numero,sitio_num=0,j=0;
        
        
        System.out.println("Llenar el arreglo");
        do{
            //Llenando el arreglo
            for(int i=0;i<5;i++)
            {
                System.out.println((i+1)+". Digite un numero: ");
                arreglo[i] = sc.nextInt();
            }
            //comprobar si el arreglo esta ordenado de forma
            //ascendente
            for(int i=0;i<4;i++)
            {
                if(arreglo[i]<arreglo[i+1])
                {
                    creciente= true;
                }
                if(arreglo[i]>arreglo[i+1])
                {
                    creciente= false;
                    break;
                }
            }
            
            if(creciente == false)
            {
                System.out.println("\n El arreglo no esta ordenado de forma creciente");
            }
        }while(creciente==false);
        
        
        System.out.println("\nDigite un elemento a insertar: ");
        numero= sc.nextInt();
        
        //La posicion del numero
        while(arreglo[j]<numero && j<5)
        {
            sitio_num++;
            j++;
        }
        
        //trasladar una posicion en el arreglo a los elementos
        //Anteriores
        for(int i=4;i>=sitio_num;i--)
        {
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[sitio_num]=numero;
        
        System.out.println("\nel arreglo queda de la siguiente manera: ");
        for(int i=0;i<6;i++)
        {
            System.out.println(arreglo[i]+" - ");
        }
        System.out.println("");
    }
    }
    

