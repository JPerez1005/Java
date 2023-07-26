/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pequeño julian
 */
public class doctor extends usuario{
    //Atributos:
    private String Especialidad;
    private Date fecha;
    private String hora;
    
    public doctor (String nombre, String email){
        super (nombre, email);
    }
    public doctor (String nombre, String email, String especialidad){
        super (nombre, email);
        this.Especialidad = especialidad;
    }
    //Metodos:
    public void mostrarNombre (){
        //Instrucciones
        System.out.println("El nombre del doctor es: "+getNombre());
       
    }
    
    public void mostrarID(){
        System.out.println("ID Doctor: "+getId());
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    /**
     * @param Especialidad the Especialidad to set
     */
    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public static class CitaDisponible{
        private int id;
        private Date fecha;
        private String hora;
        
        public CitaDisponible(Date fecha, String hora){
            this.fecha = fecha;
            this.hora = hora;
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
         * @return the fecha
         */
        public Date getFecha() {
            return fecha;
        }

        /**
         * @param fecha the fecha to set
         */
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        /**
         * @return the hora
         */
        public String getHora() {
            return hora;
        }

        /**
         * @param hora the hora to set
         */
        public void setHora(String hora) {
            this.hora = hora;
        }
    
    @Override
    public String toString(){
        return "Disponible: "+"\n Fecha: "+fecha+"\n Hora: "+hora+"\n";
    }    
        
    }
    ArrayList<CitaDisponible> citasDisponibles = new ArrayList<>();
    public void agregarCitaDisponible(Date fecha, String hora){
        citasDisponibles.add(new CitaDisponible(fecha,hora));
    }
    
    public ArrayList<CitaDisponible> getCitasDisponibles(){
        return citasDisponibles;
    }
    
    @Override
    public String toString(){ //Heredado de object
        return super.toString()+"\n Especialidad: "+Especialidad+"\n Citas disponibles"+ citasDisponibles.toString();
    }
    
    @Override
    public void mostrarDatosUsuario() {
        System.out.println("Doctor: ");
        System.out.println("\n Especialidad");
    }
            
}
