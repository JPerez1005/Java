package Programacionats;

public class kArreglos {

    public static void main(String[] args) {
        /*Un array (arreglo) en Java es una estructura de datos que nos permite 
        almacenar un conjunto de datos de un mismo tipo. El tamaño de los arrays
        se declara en un primer momento y no puede cambiar luego durante la
        ejecución del programa.*/
        
        /*Array unidimencional
        la sintaxis es:
        
        tipo_Variable[] nombre=new tipo_Variable[dimension];
        
        Ejemplos
        int[] edad = new int[4];
        long[] edad = new long[3];
        String[] nombres= new String[4];
        
        todo aquello que contenga en su sintaxis la palabra new es por que es 
        un objeto y estamos justamente creandolo con new
        */
        
        int[] numeros= new int[3];/*se coloca 3 por que yo solo quiero almacenar
        3 enteros, recordar que se empieza desde el cero*/
        
        //Empezamos a llenar/definir/asignar el arreglo 
        
        numeros[0]=5;//como podemos ver empezamos desde el cero  1.
        numeros[1]=9;//2.
        numeros[2]=8;//3.
        
        
        /*Tambien podemos hacerlo de la siguiente manera
        int[] numeros={5,9,8,7}*/
        //ahora mostremos estos numeros en pantalla
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }
        
        /*los numeros fueron almacenados y mostrados en pantalla*/
        
    }
    
}
