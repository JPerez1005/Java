package POO.aClasesYObjetos;

public class Static2 {
    private static String frase ="Primera frase";
    
    public static int sumar (int  n1, int n2){
        int suma=n1+n1;
        return suma;
    }
    public static void main(String[] args) {
        System.out.println(Static2.frase);//como podemos ver no es necesario 
        //crear un pbjeto para llamar la frase o el metodo al main
        System.out.println("La suma es "+Static2.sumar(5, 4));
    }
    
}
