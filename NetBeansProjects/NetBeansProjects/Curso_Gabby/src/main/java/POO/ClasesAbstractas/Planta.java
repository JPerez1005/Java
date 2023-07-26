package POO.ClasesAbstractas;

public class Planta extends SerVivo{
    //planta aunque sea padre de todas las plantas , todas las plantas se 
    //alimentan de fotosintesis asi que aplica el metodo alimentarse
    //y no es abstracta
    @Override
    public void alimentarse (){
        System.out.println("La planta se alimenta atraves de la fotos-intesis");
    }
}
