package POO.ClasesAbstractas;

public class AnimalCarnivoro extends Animal{
    //es hijo de animal 
    @Override
    public void alimentarse(){
        System.out.println("El animal carnivoro se alimenta de carne");
    }
}
