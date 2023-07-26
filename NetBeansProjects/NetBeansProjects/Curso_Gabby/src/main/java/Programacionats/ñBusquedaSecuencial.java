package Programacionats;

import javax.swing.JOptionPane;

public class ñBusquedaSecuencial {

    public static void main(String[] args) {
        int[] arreglo={4,1,8,2,7};
        int dato;
        boolean band=false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"
                + " que quiere buscar: "));
        
        int i=0;
        
        while (i<5 && band==false) {  //mientras que la bandera sea falsa
            // entonces el ciclo continua
            if(arreglo[i]==dato){
                band=true;//cuando bandera se verdadera entonces ya no va ser 
                //falsa y el ciclo se acaba, tambien quiere decir que se 
                //encontro el numero que buscaba el usuario
            }
            i++;
        }
        
        if(band==false){
            JOptionPane.showMessageDialog
        (null, "El numero no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog
        (null, "El numero ah sido encontrado en la posicion: "+(i-1));
        }
        
    }
    
}
