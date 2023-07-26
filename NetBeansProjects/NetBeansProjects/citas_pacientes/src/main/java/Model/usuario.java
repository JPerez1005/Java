/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pequeño julian
 */
public abstract class usuario {
    private int id;
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    
    public usuario (String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
        if (telefono.length()>10){
            System.out.println("El número de telefono no debe exceder los 10 digitos");
        }
        else{
           this.telefono = telefono; 
        }
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\n email: "+email+"\n Dirección: "+direccion+"\n Telefono: "+telefono;
    }
    
    public abstract void mostrarDatosUsuario();
    
}