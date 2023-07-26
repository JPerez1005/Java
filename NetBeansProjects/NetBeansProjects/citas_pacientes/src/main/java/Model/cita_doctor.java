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
public class cita_doctor implements ISchedulable {
    
    private int id;
    private paciente paciente;
    private doctor doctor;
    private Date fecha;
    private String hora;
    
    public cita_doctor(paciente paciente, doctor doctor){
        this.paciente = paciente;
        this.doctor = doctor;
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
     * @return the doctor
     */
    public doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(doctor doctor) {
        this.doctor = doctor;
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
        //Sobreescritura;
        this.fecha = fecha;
        this.hora = hora;
    }
    
}
