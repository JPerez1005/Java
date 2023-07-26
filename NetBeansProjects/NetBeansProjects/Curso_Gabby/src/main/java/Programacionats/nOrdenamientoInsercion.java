package Programacionats;

import java.util.Scanner;

public class nOrdenamientoInsercion {

    public static void main(String[] args) {
        /*Es una manera muy natural de ordenar para un ser humano,
        y puede usarse fácilmente para ordenar un mazo de cartas 
        numeradas en forma arbitraria. Requiere O(n²) operaciones 
        para ordenar una lista de n elementos.*/
        
        Scanner entrada = new Scanner(System.in);

        int arreglo[], nElementos, actual,pos;
        System.out.println("Digite el numero de elementos por favor:");
        nElementos = entrada.nextInt();

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println("Digite un numero:");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamientos por insercion 
        for (int i = 0; i < nElementos; i++) {
            pos=i;
            actual= arreglo[i];
            
            while ((pos>0) && (arreglo[pos-1] > actual)) {                
                arreglo[pos]  = arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=actual;
        }
        
        System.out.println("Orden Ascendente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
