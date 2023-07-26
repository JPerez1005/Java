/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citas_pacientes.Interfaz;

import Model.*;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pequeño julian
 */
public class MenuIU {
    public static void mostrarMenu(){
        System.out.println("sistema de agendamiento de citas");
        System.out.println("Seleccione la opción: ");
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
                System.out.println(": Doctor");
                mostrarMenuDoctor();
                break;
            case 2:                
                System.out.println(": Paciente");
                //respuesta = 0;
                mostrarMenuPaciente();
                break;
            case 3:
                System.out.println(": Enfermero");
                mostrarMenuEnfermero();
                break;
            case 0:
                System.out.println("Gracias por su tiempo");
                break;
            default:
                System.out.println("Seleccione otra opción");
        }
        
    }while (respuesta != 0);
    }
        public static void mostrarMenuDoctor(){
        System.out.println("\n\nTipo de usuario: Doctor");
        int respuesta=0;
        do{
            
        
        System.out.println("1. Mostrar citas disponibles");
        System.out.println("2. Agendar una cita");
        System.out.println("0. Regresar");
        
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
        switch (respuesta){
            case 1:
                System.out.println(": Citas disponibles");
                usuario doctor = new doctor ("eliana jaimes", "elija@mail.com");
                doctor.setTelefono("1534489512");
                System.out.println(doctor.toString());
                break;
            case 2:                
                System.out.println(": Agregar cita");
                doctor doctor2 = new doctor ("eliana jaimes", "elija@mail.com");
                       doctor2.agregarCitaDisponible(new Date(), "9:30 a.m.");
                       doctor2.agregarCitaDisponible(new Date(), "1:45 p.m.");
                       doctor2.agregarCitaDisponible(new Date(), "3:00 p.m.");
                System.out.println(doctor2.toString());
                break;
            case 0:
                System.out.println("Regresando...");
                mostrarMenu();
                break;
            default:
                System.out.println("Elija otra opción");
        }
        
    }while (respuesta != 0);
        
    }
        public static void mostrarMenuPaciente(){
        System.out.println("\n\nTipo de usuario: Paciente");
        int respuesta=0;
        do{
            
        
        System.out.println("1. reservar una cita");
        System.out.println("2. observar el historial");
        System.out.println("0. atras");
        
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
        switch (respuesta){
            case 1:
                System.out.println(": Reservar cita");
                break;
            case 2:                
                System.out.println(": Ver historial");
                usuario usuario = new paciente("Julian Perez", "JDPerez@gmail.com");
                usuario.mostrarDatosUsuario();
                break;
            case 0:
                System.out.println("Regresando...");
                mostrarMenu();
                break;
            default:
                System.out.println("Elija otra opción ");
        }
        
    }
        while (respuesta != 0);
        
    }
        public static void mostrarMenuEnfermero(){
        System.out.println("\n\nTipo de usuario: Enfermero");
        int respuesta=0;
        do{
            
        
        System.out.println("1. mostrar citas disponibles");
        System.out.println("2. Agendar una cita");
        System.out.println("0. atras");
        
        Scanner sc = new Scanner(System.in);
        respuesta = Integer.valueOf(sc.nextLine());
        switch (respuesta){
            case 1:
                System.out.println(": Citas disponibles");
                usuario enfermero = new enfermero ("Julian Rojas", "JulianRo@mail.com");
                enfermero.setTelefono("3158163819");
                System.out.println(enfermero.toString());
                break;
            case 2:                
                System.out.println(":: Agregar citas");
                enfermero enfermero2 = new enfermero("Julian Rojas", "JulianRo@mail.com");
                       enfermero2.agregarCitaDisponible(new Date(), "1:20 p.m.");
                       enfermero2.agregarCitaDisponible(new Date(), "2:50 p.m.");
                       enfermero2.agregarCitaDisponible(new Date(), "3:00 p.m.");
                System.out.println(enfermero2.toString());
                break;
            case 0:
                System.out.println("Regresando...");
                mostrarMenu();
                break;
            default:
                System.out.println("Elija otra opcion");
        }
        
    }while (respuesta != 0);
        
    }
}
