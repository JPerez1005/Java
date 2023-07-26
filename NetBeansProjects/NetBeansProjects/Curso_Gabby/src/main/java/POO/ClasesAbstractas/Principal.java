package POO.ClasesAbstractas;

public class Principal {

    public static void main(String[] args) {
        Planta planta=new Planta();
        AnimalCarnivoro ac=new AnimalCarnivoro();
        ac.alimentarse();
        planta.alimentarse();
    }
    
}
