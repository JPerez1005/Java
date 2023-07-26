package POO.Poolimorfismo;

public class VehiculoTurismo extends Vehiculo{
    byte numeroPuertas;
    
    
    public VehiculoTurismo(byte numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public String mostrar(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nNumero de puertas: "+numeroPuertas;
    }
    
}
