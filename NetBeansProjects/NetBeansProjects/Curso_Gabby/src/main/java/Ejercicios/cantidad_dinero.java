package Ejercicios;

//Guillermo tiene N dolares . Luis tiene la mitad de lo que tiene Guillermo
//Juan tiene la mitad de lo que poseee luis y Guillermo juntos.
//hacer un programa que calcule e imprima la cantidad de dinero que tienen
//entre los tres

import java.util.Scanner;

public class cantidad_dinero {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float Guillermo,Luis,Juan;
        
        System.out.println("Cuanto dinero tiene Guillermo?: ");
        Guillermo= entrada.nextFloat();
        
        Luis= Guillermo/2;
        
        Juan=(Guillermo+Luis)/2;
        
        System.out.println("Guillermo tiene: "+Guillermo+"\nLuis tiene: "+Luis+
                "\nJuan tiene: "+Juan);
    }
    
}
