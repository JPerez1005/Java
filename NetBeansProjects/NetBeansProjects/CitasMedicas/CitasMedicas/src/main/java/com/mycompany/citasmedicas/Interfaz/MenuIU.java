/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.citasmedicas.Interfaz;

import java.util.Scanner;
import Model.*;
import java.util.Date;

/**
 *
 * @author USER
 */
public class MenuIU {
    public static void mostrarMenu(){
        System.out.println("Bienvenido al sistema de agendamiento de citas :D");
        System.out.println("Seleccione la opción deseada: ");
        int respuesta=0;
        do{
            
        
        System.out.println("1. Doctor");
        System.out.println("2. Paciente");
        System.out.println("3. Enfermero");
        System.out.println("0. Salir");
        
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
        switch (respuesta){
            case 1:
                System.out.println(":: Doctor");
                mostrarMenuDoctor();
                break;
            case 2:                
                System.out.println(":: Paciente");
                //respuesta = 0;
                mostrarMenuPaciente();
                break;
            case 3:
                System.out.println(":: Enfermero");
                mostrarMenuEnfermero();
                break;
            case 0:
                System.out.println("Gracias por su visita");
                break;
            default:
                System.out.println("Seleccione una opción correcta");
        }
        
    }while (respuesta != 0);
    }
        public static void mostrarMenuDoctor(){
        System.out.println("\n\nTipo de usuario: Doctor");
        int respuesta=0;
        do{
            
        
        System.out.println("1. Mostrar citas disponibles");
        System.out.println("2. Agregar una cita");
        System.out.println("0. Regresar");
        
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
        switch (respuesta){
            case 1:
                System.out.println(":: Citas disponibles");
                Usuario doctor = new Doctor ("Andrés Lopez", "AndresLo@mail.com");
                doctor.setTelefono("3101234567");
                System.out.println(doctor.toString());
                break;
            case 2:                
                System.out.println(":: Agregar cita");
                Doctor doctor2 = new Doctor ("Andrés Lopez", "AndresLo@mail.com");
                       doctor2.agregarCitaDisponible(new Date(), "4:30 p.m.");
                       doctor2.agregarCitaDisponible(new Date(), "4:45 p.m.");
                       doctor2.agregarCitaDisponible(new Date(), "5:00 p.m.");
                System.out.println(doctor2.toString());
                break;
            case 0:
                System.out.println("Regresando...");
                mostrarMenu();
                break;
            default:
                System.out.println("Seleccione una opción correcta");
        }
        
    }while (respuesta != 0);
        
    }
        public static void mostrarMenuPaciente(){
        System.out.println("\n\nTipo de usuario: Paciente");
        int respuesta=0;
        do{
            
        
        System.out.println("1. Reservar una cita");
        System.out.println("2. Ver el historial");
        System.out.println("0. Regresar");
        
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
        switch (respuesta){
            case 1:
                System.out.println(":: Reservar cita");
                break;
            case 2:                
                System.out.println(":: Ver historial");
                Usuario usuario = new Paciente("María Perez", "Maria@gmail.com");
                usuario.mostrarDatosUsuario();
                break;
            case 0:
                System.out.println("Regresando...");
                mostrarMenu();
                break;
            default:
                System.out.println("Seleccione una opción correcta");
        }
        
    }
        while (respuesta != 0);
        
    }
        public static void mostrarMenuEnfermero(){
        System.out.println("\n\nTipo de usuario: Enfermero");
        int respuesta=0;
        do{
            
        
        System.out.println("1. Mostrar citas disponibles");
        System.out.println("2. Agregar una cita");
        System.out.println("0. Regresar");
        
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
        switch (respuesta){
            case 1:
                System.out.println(":: Citas disponibles");
                Usuario enfermero = new Enfermero ("Julian Ramirez", "JulianRa@mail.com");
                enfermero.setTelefono("3106105582");
                System.out.println(enfermero.toString());
                break;
            case 2:                
                System.out.println(":: Agregar citas");
                Enfermero enfermero2 = new Enfermero("Julian Ramirez", "JulianRa@mail.com");
                       enfermero2.agregarCitaDisponible(new Date(), "7:30 p.m.");
                       enfermero2.agregarCitaDisponible(new Date(), "7:45 p.m.");
                       enfermero2.agregarCitaDisponible(new Date(), "8:00 p.m.");
                System.out.println(enfermero2.toString());
                break;
            case 0:
                System.out.println("Regresando...");
                mostrarMenu();
                break;
            default:
                System.out.println("Seleccione una opción correcta");
        }
        
    }while (respuesta != 0);
        
    }
        
}
