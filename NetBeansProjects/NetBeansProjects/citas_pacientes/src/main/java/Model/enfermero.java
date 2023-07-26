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
public class enfermero extends usuario {
    
    private String especialidad;
    
    public enfermero(String nombre, String email){
        super(nombre,email);
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        return super.toString()+"\n Especialidad: "+especialidad+"\n Citas disponibles"+ citasDisponibles.toString();
    }
    

    @Override
    public void mostrarDatosUsuario() {
        System.out.println("Enfermero: ");
        System.out.println("\n Especialidad");
        System.out.println("\n Rango: Auxiliar");
    }
}

