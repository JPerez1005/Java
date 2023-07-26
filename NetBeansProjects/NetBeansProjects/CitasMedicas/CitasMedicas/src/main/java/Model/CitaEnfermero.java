/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author USER
 */
public class CitaEnfermero implements ISchedulable{
    
    private int id;
    private Paciente paciente;
    private Enfermero enfermero;
    private Date fecha;
    private String hora;
    
    public CitaEnfermero(Paciente paciente, Enfermero enfermero){
        this.paciente = paciente;
        this.enfermero = enfermero;
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
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the enfermero
     */
    public Enfermero getEnfermero() {
        return enfermero;
    }

    /**
     * @param enfermero the enfermero to set
     */
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
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
    public void schedule(Date fecha, String hora){
        //Agendar cita con enfermero
        this.fecha = fecha;
        this.hora = hora;
    }
    
}
