
package empleados;

public class EmpPlanta extends Empleados { //EmpPlanta es subclase de Empleados
    
    double sbase; //El salario base es un atributo propio de esta clase

    public EmpPlanta() {
    }

    public EmpPlanta(double sbase, String nombre, String id, String departamento, int atrabajo) {
        super(nombre, id, departamento, atrabajo);
        this.sbase = sbase;
    }

    public String mostrarDatos(){
        return super.mostrarDatos()+ " Sueldo base: "+sbase;
    }
    
    public double calcularSalario(){
        double bono=0,bant=0; //bono por antiguedad
        if (departamento.equalsIgnoreCase("Sistemas")){
            bono=250000;
        }
        else {
            if (departamento.equalsIgnoreCase("Ventas")){
                bono=150000;
            } 
        }
        if (atrabajo>=10)
            bant=sbase*0.1;
        else {
            if (atrabajo>=5)
                bant=sbase*0.05;
        }    
        return sbase+bono+bant;
    }
    
    
}
