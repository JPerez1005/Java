
package model;

public class Vehiculo {
   private String marca;
    private String modelo;
    private int cilindraje;
    private String placa;

    public Vehiculo(String marca, String modelo, int cilindraje, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindraje=" + cilindraje +
                ", placa='" + placa + '\'' +
                '}';
    }
}
