
package model;


public class Nodo {
    
     private Vehiculo vehiculo;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.siguiente = null;
        this.anterior = null;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
    
    
    

