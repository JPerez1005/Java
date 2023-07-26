/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.empleados;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Lista_Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> cadenas;
        
        cadenas= new ArrayList<String>();
        
        Empleado empleados=new Empleado();
        EmpleadoPlanta empleadosp=new EmpleadoPlanta();
        
        int opcion=0; String op="";
        op=JOptionPane.showInputDialog("Seleccionar una opcion: \n"
                +"1.Crear un nuevo Empleado Planta"
                +"2.Crear un nuevo Empleado Por Horas"
                +"3.Listado Empleados Planta"
                +"4.Listado Empleados por hora mayores de un año"
                +"5.Calcular valor valor de la nomina de los empleados"
                +"6.Porcentaje Empleados de planta"
        );
        
        opcion=Integer.parseInt(op);
        switch(opcion){
            case 1: 
                
        }
        
        
        
        
        
    }
    
}
