//Ejemplo de Herencia. Clase Padre Empleados y dos clases hijas: EmpPlanta y EmpHoras
package empleados;

public class Empleados {
    //lista de atributos comunes para todos los empleados
   String nombre;
   String id;
   String departamento;
   int atrabajo; //años de vinculacion con la empresa

    public Empleados() {
    }

    public Empleados(String nombre, String id, String departamento, int atrabajo) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
        this.atrabajo = atrabajo;
    }

    public String mostrarDatos(){
        return "Documento de identidad:  "+id +" Nombre:  "+nombre+ " Departamento: "+departamento + " Años de trabajo: "+atrabajo;
        
    }
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", id=" + id + ", departamento=" + departamento + ", atrabajo=" + atrabajo + '}';
    }

   
}

