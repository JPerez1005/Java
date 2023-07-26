/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoswithant;

/**
 *
 * @author kenia
 */
public class NodosWithANT {
    

    
    private String Placa;
    private String Marca;
    private int Modelo;
    private int cilindraje;

    public NodosWithANT() {
    }

    public NodosWithANT(String Placa, String Marca, int Modelo, int cilindraje) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "NodosWithANT{" + "Placa=" + Placa + ", Marca=" + Marca + ", Modelo=" + Modelo + ", cilindraje=" + cilindraje + '}';
    }
    
    
}
