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
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Leer 5 numeros por teclado, alamacenarlos en un arreglo y a 
        continuacion realizar la media de los numeros positivos, la media de 
        los negativos y contar el numero de ceros*/
        Scanner sc = new Scanner (System.in);
        float numeros[] = new float[5];
        float suma_positivos=0,suma_negativos=0,mediapositivos,medianegativos;
        int conteo_positivos=0,conteo_negativos=0,conteo_ceros=0;
        
        System.out.println("Guarando los numeros del arreglo...");
        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+". Digite un numero: ");
            numeros[i] =sc.nextFloat();
            
            if(numeros[i]==0)
            {
                conteo_ceros++;
            }
            else if(numeros[i]>0)
            {
                suma_positivos=suma_positivos+numeros[i];
                conteo_positivos++;
            }
            else if(numeros[i]<0)
            {
                suma_negativos=suma_negativos+numeros[i];
                conteo_negativos++;
            }
        }
        
        //media de los positivos
        if(conteo_positivos==0)
        {
            System.out.println("no se puede sacar la media de los positivos");
        }else
        {
            mediapositivos=suma_positivos/conteo_positivos;
            System.out.println("La media de los positivos es: \n");
        }
        
        //media de los negativos
        if(conteo_negativos==0)
        {
            System.out.println("no se puede sacar la media de los negativos");
        }else
        {
            medianegativos=suma_negativos/conteo_negativos;
            System.out.println("La media de los negativos es: \n");
        }
        
        System.out.println("El numero de ceros es: "+conteo_ceros);
    }
    
}
