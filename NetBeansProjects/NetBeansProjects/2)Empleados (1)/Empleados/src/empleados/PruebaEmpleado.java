
package empleados;


import javax.swing.JOptionPane;
import java.util.ArrayList;
public class PruebaEmpleado {
    public static void main (String [] args){
        //Listado de variables
        int op,op1,i,antiguedad,cantidadh;
        double sueldo,valorh,suma;
        String nom, id, depto;
        
        ArrayList<EmpPlanta> listaEP = new ArrayList<>();
        
        ArrayList<EmpHoras> listaEH = new ArrayList<>();
        
        EmpPlanta E1 = new EmpPlanta(2800000,"Beltran Camilo", "102030","Sistemas",2);
        EmpPlanta E2 = new EmpPlanta(4500000,"Mendez Luis", "105566","Ventas",9);
        listaEP.add(E1);
        listaEP.add(E2); 
          
        EmpHoras H1 = new EmpHoras(180,8500,"Duarte Carlos", "109988","Contabilidad",6);
        EmpHoras H2 = new EmpHoras(180,8500,"Rosas Katherine", "645566","Sistemas",12);
        listaEH.add(H1);
        listaEH.add(H2);
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("MENU DE OPCIONES"+
                                 "\n1. Agregar nuevo empleado"+
                                 "\n2. Calcular la nómina de la empresa"+
                                 "\n3. Listado de empleados planta por departamento"+
                                 "\n4. Lista empleados Horas ordenada por nombre"+
                                 "\n5. Porcentaje de empleados que son de planta"+
                                 "\n6. Salir del menu."+
                                 "\n\n Ingrese su opcion:"));
            
            switch(op){
                case 1:  op1=Integer.parseInt(JOptionPane.showInputDialog("TIPO DE EMPLEADO"+
                                 "\n1. Agregar nuevo empleado de Planta"+
                                 "\n2. Agregar nuevo empleado por Horas"+
                                 "\n3. Salir del menu."+
                                 "\n\n Ingrese su opcion:"));
                         switch(op1){
                             case 1: id=JOptionPane.showInputDialog("Ingrese el documento de identidad:");
                                     nom=JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                                     depto=JOptionPane.showInputDialog("Ingrese el departamento del empleado:");
                                     antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de antiguedad del empleado:"));
                                     sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado:"));
                                     EmpPlanta EP = new EmpPlanta(sueldo,nom,id,depto,antiguedad);
                                     listaEP.add(EP);
                                     break;
                             case 2: id=JOptionPane.showInputDialog("Ingrese el documento de identidad:");
                                     nom=JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                                     depto=JOptionPane.showInputDialog("Ingrese el departamento del empleado:");
                                     antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de antiguedad del empleado:"));
                                     cantidadh=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas laboradas en el mes: "));
                                     valorh=Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor hora del empleado:"));
                                     EmpHoras EH = new EmpHoras(cantidadh,valorh,nom,id,depto,antiguedad);
                                     listaEH.add(EH);
                                     break;
                         }
                         break;
                case 2:  //CALCULAR LA NOMIMA DE TODOS LOS EMPLEADOS
                        suma=0; //acumulador de sueldos
                        for (i=0; i< listaEP.size()  ; i++){
                            suma= suma + listaEP.get(i).calcularSalario();
                        }
                        for (i=0; i< listaEH.size()  ; i++){
                            suma= suma + listaEH.get(i).calcularSalario();
                        }   
                        JOptionPane.showMessageDialog(null,"El valor total de la nómina es; "+suma );
                        break;
                    
                case 3: depto=JOptionPane.showInputDialog("Ingrese el departamento que desea listar:"); 
                        //recorrer el ArrayList de Empleados de Planta listaEP
                        String salida="";
                        for(i=0;i<listaEP.size();i++){
                            if(listaEP.get(i).departamento.equalsIgnoreCase(depto)){  
                              salida = salida + listaEP.get(i).mostrarDatos()+"\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null,salida);
                        break;
                case 4: EmpHoras aux =new EmpHoras();
                //Ordenamiento por el método de comparación
                    for(i=0;i<(listaEH.size()-1);i++){  
                            for(int j=i+1;j<listaEH.size();j++){
                            if(listaEH.get(i).nombre.compareTo(listaEH.get(j).nombre)>0){
                              aux.nombre=listaEH.get(i).nombre;
                              aux.id=listaEH.get(i).id;
                              aux.departamento=listaEH.get(i).departamento;
                              aux.atrabajo=listaEH.get(i).atrabajo;
                              aux.numHoras=listaEH.get(i).numHoras;
                              aux.valorHora=listaEH.get(i).valorHora;
                              
                              listaEH.get(i).nombre=listaEH.get(j).nombre;
                              listaEH.get(i).id=listaEH.get(j).id;
                              listaEH.get(i).departamento=listaEH.get(j).departamento;
                              listaEH.get(i).atrabajo=listaEH.get(j).atrabajo;
                              listaEH.get(i).numHoras=listaEH.get(j).numHoras;
                              listaEH.get(i).valorHora=listaEH.get(j).valorHora;
                              
                              listaEH.get(j).nombre=aux.nombre;
                              listaEH.get(j).id=aux.id;
                              listaEH.get(j).departamento=aux.departamento;
                              listaEH.get(j).atrabajo=aux.atrabajo;
                              listaEH.get(j).numHoras=aux.numHoras;
                              listaEH.get(j).valorHora=aux.valorHora;
                              
                         } 
                        }
                    }
                    for(i=0;i<listaEH.size();i++){  
                        JOptionPane.showMessageDialog(null,listaEH.get(i).mostrarDatos());
                    }

                        break;
                        
                case 5: //Calcular el porcentaje de empleados que son de planta
                    int total;
                    double porcentaje;
                    total= listaEP.size()+listaEH.size();
                    porcentaje = (double) (listaEP.size() * 100 / total);  
                    JOptionPane.showMessageDialog(null,"El porcentaje de empleados de planta es " + porcentaje);
            }
                       
            
        }while(op!=6);
        
    }
    


}