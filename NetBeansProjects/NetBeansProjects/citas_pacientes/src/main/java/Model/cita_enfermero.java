/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author pequeño julian
 */
public class cita_enfermero implements ISchedulable{
    
    private int id;
    private paciente paciente;
    private enfermero enfermero;
    private Date fecha;
    private String hora;
    
    public cita_enfermero(paciente paciente, enfermero enfermero){
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
    public paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the enfermero
     */
    public enfermero getEnfermero() {
        return enfermero;
    }

    /**
     * @param enfermero the enfermero to set
     */
    public void setEnfermero(enfermero enfermero) {
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
