/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pequeño julian
 */
public class Doctor {
    //atributos
    int id;
    String nombre;
    String especialidad;

    Doctor()
    {
      
    }
    
    Doctor(int id, String nombre, String especialidad) {
        System.out.println("el nombre del doctor es: "+nombre);
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    
    
    //metodos
    public void mostrar()
    {
        //instrucciones
        System.out.println("el nombre del doctor es: "+nombre);
    }
    
    
    
    public static int suma(int a,int b)
    {
        return a+b;
    }
}
