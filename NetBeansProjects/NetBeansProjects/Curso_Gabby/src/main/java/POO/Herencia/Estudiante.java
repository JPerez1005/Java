package POO.Herencia;

public class Estudiante extends Persona{
    static int CodigoEstudiante;
    static float notaFinal;
    
    public Estudiante(){
        
    }
    
    
    public Estudiante(int CodigoEstudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.CodigoEstudiante = CodigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public static void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+
                "\nEdad: "+edad+"\nCodigoEstudiante: "+CodigoEstudiante+
                "\nNota Final: "+notaFinal);
    }
    
}
