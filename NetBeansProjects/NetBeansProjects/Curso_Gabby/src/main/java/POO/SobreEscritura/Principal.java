package POO.SobreEscritura;

public class Principal {

    public static void main(String[] args) {
        Persona persona=new Persona();
        Perro perro=new Perro();
        
        persona.Comer();
        perro.Comer();
        
        //Podemos modificar un metodo del mismo nombre siendo hijos de la clase
        //creadora
    }
    
}
