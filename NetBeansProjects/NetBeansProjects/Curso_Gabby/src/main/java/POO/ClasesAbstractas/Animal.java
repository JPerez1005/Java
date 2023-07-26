package POO.ClasesAbstractas;

public abstract class Animal extends SerVivo{
    @Override
    public abstract void alimentarse();
    //Animal es el padre de animal herbivoro y carniboro, pero es hijo de ser 
    //vivo, no se implementa alimentarse por que un animal no come cualquier cosa
    //por eso esta e una clase abstracta como ser vivo
}
