package Programacionats;

import java.util.Scanner;

public class mMetodoBurbuja {

    public static void main(String[] args) {
        /*¿Qué es el método burbuja?

        Es un sencillo algoritmo de ordenamiento. Funciona revisando cada 
        elemento de la lista que va a ser ordenada con el siguiente,
        intercambiándolos de posición si están en el orden equivocado.
        Es necesario revisar varias veces toda la lista hasta que no se 
        necesiten más intercambios, lo cual significa que la lista 
        está ordenada.*/

        Scanner entrada = new Scanner(System.in);

        int arreglo[], nElementos, aux;
        System.out.println("Digite el numero de elementos por favor:");
        nElementos = entrada.nextInt();

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println("Digite un numero:");
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 0; i < nElementos - 1; i++) {
            for (int j = 0; j < nElementos - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("Arreglo ordenado en forma creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + "-");
        }
    }

}
