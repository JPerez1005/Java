package Programacionats;


public class TIpos_de_datos_primitivos {

    
    public static void main(String[] args) {
        
        //la variable es un espacio de almacenamiento
        //las variables tienen limites y las usamos segun esos limites
       
       byte bit=127;
       short medio=12456;
       int entero=21561533;
       long largo=263151555;
       
        System.out.println("lo que sea mayor de 128: "+medio);
        
        //algunas variables pueden guardar numeros reales
        
        float a=3.5f;
        double rande=8.4615;
        
        System.out.println("Numero decimal: "+a);
        
        //tambien hay variables con letras y numeros tambien cuenta asi como los
        //simbolos alfanumericos
        
        char caracter = 'w';
        char reloj= 'h';
        
        System.out.println("Caracter: "+caracter);
        
        //boolean solo tiene dos respuestas false y true, se usan mucho en las
        //condicionales
        
        System.out.println("PALBRAS CLAVES?"); boolean desicion=true;
        
        
        
        
        System.out.println("la Desicion es; "+desicion);
    }
    
}
