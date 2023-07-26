/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pequeño julian
 */
public class paciente extends usuario {
    
    private String fechaNacimiento;
    private double peso;
    private double talla;
    private String tipoSangre;
    
    public paciente(String nombre, String email){
        super(nombre,email);
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso + " kg";
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the talla
     */
    public String getTalla() {
        return talla + "m.";
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(double talla) {
        //Lógica para que la talla sea en metros
        this.talla = talla;
    }

    /**
     * @return the tipoSangre
     */
    public String getTipoSangre() {
        return tipoSangre;
    }

    /**
     * @param tipoSangre the tipoSangre to set
     */
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public void mostrarDatosUsuario() {
        System.out.println("Paciente: ");
        System.out.println("\n Historial Paciente");
    }
}
