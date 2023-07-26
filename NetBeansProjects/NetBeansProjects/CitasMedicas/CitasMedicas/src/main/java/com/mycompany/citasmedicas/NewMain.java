/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citasmedicas;

import Model.*;
import static com.mycompany.citasmedicas.Interfaz.MenuIU.*;
import java.util.Date;

/**
 *
 * @author USER
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //mostrarMenu();
       /*Paciente paciente = new Paciente ("Fulanito", "fulanito@mail.com");
       paciente.setPeso(75);
       paciente.setTalla(1.75);
       System.out.println(paciente.getPeso());
       System.out.println(paciente.getTalla());
       paciente.setTelefono("3101234567");
       System.out.println(paciente.getTelefono());*/
       
       Doctor doctor = new Doctor("Juan Lopez","Juan@corre.com");
       //System.out.println(doctor.getCitasDisponibles());
      
       //System.out.println(doctor.getCitasDisponibles());

       //System.out.println(doctor.getCitasDisponibles().toString());
       
       //System.out.println(doctor.toString());
       /*for (Doctor.CitaDisponible cita : doctor.getCitasDisponibles()){
           System.out.println(cita.getFecha()+ " "+ cita.getHora());
       }*/
       Usuario usuario = new Enfermero("María Perez", "Maria@gmail.com");
       //usuario.mostrarDatosUsuario();
       mostrarMenu();
    }  
    
}
