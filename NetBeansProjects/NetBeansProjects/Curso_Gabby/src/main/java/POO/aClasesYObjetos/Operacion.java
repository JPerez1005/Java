package POO.aClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int n1;
    int n2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodo para saber los numeros que digito el usuario
    public void leerNumeros(){
        n1=Integer.parseInt(JOptionPane.showInputDialog
            ("Digite el numero 1 porfavor"));
        n2=Integer.parseInt(JOptionPane.showInputDialog
            ("Digite el numero 2 porfavor"));
    }
    
    //metodo para  sumar los numeros del usuario
    public void sumar(){
        suma=n1+n2;
    }
    
    //metodo para restar los numeros del usuario
    public void restar(){
        resta=n1-n2;
    }
    
    //metodo para multiplicar los numeros del usuario
    public void multiplicar(){
        multiplicacion=n1*n2;
    }
    
    //metodo paa dividir los numeros del usuario
    public void dividir(){
        division=n1/n2;
    }
    
    //metodo para ostrar los resultados de las anteriores operaciones
    public void mostrar(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
    
    
    public static void main(String[]args){
        Operacion op=new Operacion();
        
        op.leerNumeros();
        op.sumar();
        op.mostrar();
    }
}
