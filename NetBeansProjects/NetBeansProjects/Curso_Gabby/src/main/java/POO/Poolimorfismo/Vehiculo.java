package POO.Poolimorfismo;

public class Vehiculo {
    String matricula;
    String marca;
    String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String mostrar(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo;
    }
}
