
package empleados;

public class EmpHoras extends Empleados {
    int numHoras;
    double valorHora;

    public EmpHoras() {
    }

    public EmpHoras(int numHoras, double valorHora, String nombre, String id, String departamento, int atrabajo) {
        super(nombre, id, departamento, atrabajo);
        this.numHoras = numHoras;
        this.valorHora = valorHora;
    }

    
    public String mostrarDatos(){
        return super.mostrarDatos()+ " Valor de la hora: "+valorHora + " Numero de horas laboradas: "+numHoras;
    }
    
    public double calcularSalario(){
        
        double bono=0,auxt=0;
        if (departamento.equalsIgnoreCase("Sistemas")){
            bono=250000;
        }
        else {
            if (departamento.equalsIgnoreCase("Ventas")){
                bono=150000;
            } 
        }
        double sueldo=numHoras*valorHora;
        if (sueldo<2000000) //Auxilio de transporte
            auxt=87000;
        
        return sueldo+bono+auxt;
    
    }
}