package POO.Poolimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    @Override
    public String mostrar(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo
                +"Carga: "+carga;
    }
    
}
