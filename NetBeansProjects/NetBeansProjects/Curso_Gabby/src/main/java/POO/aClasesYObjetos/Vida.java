package POO.aClasesYObjetos;

public class Vida {
    private final String nombre;
    private int edad;

    public Vida(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public  static void main(String [] args){
        Vida persona1 = new Vida("Julian",20);
        
        persona1.setEdad(21);
        
        //Set nombre no aparece , primero porque no estabecí un set ni un get
        //en la clase vida y segundo por que nombre no es una variable
        //nombre es una constante
        
        persona1.mostrar();
    }
}
