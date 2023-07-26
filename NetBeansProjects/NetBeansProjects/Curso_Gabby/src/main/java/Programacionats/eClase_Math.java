package Programacionats;


public class eClase_Math {

    
    public static void main(String[] args) {
        byte raiz= (byte) Math.sqrt(9);//hay que hacer esta linea con byte 
        //entreparentesis debido a que el resultado de la raiz va a ser 
        //siempre un resultado decimal, pero este metodo lo que hace es
        //cambiar el resultdo a modo byte, a esto se le conoce como cast
        
        System.out.println("la raiz es: "+raiz);
        
        float b=5, e=2;
        float elevacion=(float) Math.pow(b, e);//esto se usa para elevar un nuemro
        //la base que desees por el exponente que desees
        
        System.out.println("el numero elevado es: "+elevacion);
        
        //ahora redondearemos los numeros
        
        float flotante=7.255f;//recordar la f al final
        byte entero = (byte) Math.round(flotante);//recordar el cast
        
        //la f en el float nos permite colocar los numeros decimales--doble no
        //necesita de una f al final, pero aunque es el mas util es el que mas
        //gasta espacio en memoria(te vuelve lento el programa)
        //el cast nos permite pasar un decimal a un entero
        System.out.println("el numero transformado es: "+entero);
        
        //Ahora crearemos numeros al azar
        float decimal=(float) Math.random();//no olvidar el cast
        System.out.println("el numero al azar es: "+decimal);//puedes imprimirlas las veces que
        //quieras, como digo los numeros son aleatorios pero puedes decidir de 
        //donde hacia donde(es decir es manipulable)
        
        //Hay muchisimos mas metodos de la clase Math , Pueden buscarlos,asi sus
        //programas seran mas completos
        
        
    }
    
}
