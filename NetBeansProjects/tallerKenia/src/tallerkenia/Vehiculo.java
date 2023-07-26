package tallerkenia;

public class Vehiculo {
    String placa;
    String marca;
    int modelo;
    int cilindraje;
    Vehiculo siguiente;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, int modelo, int cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.siguiente = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
    

    public Vehiculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Vehiculo siguiente) {
        this.siguiente = siguiente;
    }
    
    public static Vehiculo getInicio() {
        return inicio;
    }

    public static void setInicio(Vehiculo inicio) {
        Vehiculo.inicio = inicio;
    }

    public static Vehiculo getFin() {
        return fin;
    }

    // Punteros para el inicio y fin de la lista
    public static void setFin(Vehiculo fin) {
        Vehiculo.fin = fin;
    }
    static Vehiculo inicio = null;
    static Vehiculo fin = null;
    
    
}
