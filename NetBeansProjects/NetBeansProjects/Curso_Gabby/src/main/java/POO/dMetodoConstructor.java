package POO;

public class dMetodoConstructor {
String nombre;
int edad;

    public dMetodoConstructor() {
    }

    public dMetodoConstructor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

public void mostrar(){
    System.out.println("Mi nombre es: "+nombre);
    System.out.println("Mi edad es: "+edad);
}

public void nada(){
    System.out.println("Yo, no estoy haciendo nada");
}
    public static void main(String[] args) {
        dMetodoConstructor persona1= new dMetodoConstructor("Amparo",100);
    }
    
}
