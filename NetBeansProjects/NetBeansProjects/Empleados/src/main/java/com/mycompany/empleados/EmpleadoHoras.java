/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleados;

/**
 *
 * @author julian
 */
public class EmpleadoHoras extends Empleado{
    int numHoras;
    int valorHora;

    public EmpleadoHoras(int id, String Nombre, String Departamento, int antiguedad,int numHoras, int valorHora) {
        super(id , Nombre, Departamento,antiguedad);
        this.numHoras = numHoras;
        this.valorHora = valorHora;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
