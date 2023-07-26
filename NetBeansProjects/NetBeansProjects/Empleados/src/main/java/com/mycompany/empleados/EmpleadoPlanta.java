/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

/**
 *
 * @author julian
 */
public class EmpleadoPlanta extends Empleado {
    int salarioBase;

    public EmpleadoPlanta(int id, String Nombre, String Departamento, int antiguedad,int salarioBase) {
        super(id , Nombre, Departamento,antiguedad);
        this.salarioBase = salarioBase;
    }
    public EmpleadoPlanta() {
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public void CrearEmpleadoP(){
        
    }
    
}
