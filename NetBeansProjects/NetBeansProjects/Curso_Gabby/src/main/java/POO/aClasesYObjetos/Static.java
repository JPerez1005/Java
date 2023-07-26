package POO.aClasesYObjetos;

public class Static {
    
    private String frase="Primera Frase";//si se le aplica la palabra reservada
    //Static entonces los valores sera siempre el mismo

    public static void main(String[] args) {
        Static objeto1=new Static();
        Static objeto2=new Static();
        
        objeto2.frase="Segunda Frase";//todos los objetos serian afectados por
        //este cambio si en la linea 5 hubiera una palabra reservad static
        
        System.out.println(objeto1.frase);
        System.out.println(objeto2.frase);
        
        //Esto es lo basico de la palabra reservada estatic pero...
        
        
        
        
        //Sigueme para una segunda parte ;)
    }
    
}
