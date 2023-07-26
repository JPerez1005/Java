
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pequeño julian
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor mydoctor=new Doctor(1005,"daniel","cirujano");
        mydoctor.nombre="maria dayana";
        mydoctor.mostrar();
        
        Doctor doctor2 =new Doctor(58,"naren","");
        
        int numero=Doctor.suma(1, 4);
        System.out.println("la suma es: "+numero);
    }
    
}
