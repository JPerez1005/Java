package POO.Poolimorfismo;

public class Principal {

    public static void main(String[] args) {
        Vehiculo miVehiculos[]=new Vehiculo[4];
        
        miVehiculos[0]=new Vehiculo("asg4","Ferrari","a89");
        miVehiculos[1]=new VehiculoTurismo((byte)4, "sad4", "Audi", "s5000");
        miVehiculos[2]=new VehiculoDeportivo(100, "asad4", "chevrolet", "a557");
        miVehiculos[3]=new VehiculoFurgoneta(2000, "jy8", "toyota", "j9");
        //Esto es polimorfismo, son las muchas formas de como un objeto
        //puede comportarse, un vehiculo es un vehiculo, pero hay muchos tipos
        //de vehiculos y todos son diferentes, pero como son del mismo tipo de
        //vehiculos tiene la mayoria de caracteristicas iguales
        for(Vehiculo vehiculos: miVehiculos){
            System.out.println(vehiculos.mostrar());
            System.out.println("");
        }
    }
    
}
