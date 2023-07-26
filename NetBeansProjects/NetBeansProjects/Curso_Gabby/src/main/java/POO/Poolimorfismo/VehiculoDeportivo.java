package POO.Poolimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    int cilindrada;


    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String mostrar(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nCilindrada: "+cilindrada;
    }
    
}
