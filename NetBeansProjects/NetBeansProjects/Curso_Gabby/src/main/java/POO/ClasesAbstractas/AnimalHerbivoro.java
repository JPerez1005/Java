package POO.ClasesAbstractas;

public class AnimalHerbivoro extends Animal{
    //Es hijo de animal
    @Override
    public void alimentarse(){
        System.out.println("El animal Herbivoro  se alimenta de hierbas ");
    }
}
