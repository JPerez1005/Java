package Programacionats;

import java.util.Scanner;


public class dOperadores {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        
        float num1,num2,sum,rest,mult,div,mod;
        
        System.out.println("Digite dos numeros\nEl Primero: ");
        num1= entrada.nextFloat();
        System.out.println("El segundo: ");
        num2= entrada.nextFloat();
        
        sum = num1+num2;
        rest = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        mod = num1%num2;
        
        System.out.println("La suma es: "+sum);
        System.out.println("La resta es: "+rest);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La division es: "+div);
        System.out.println("el modulo es: "+mod);
        
        //tambien podemos manipular los numeros desde el pprograma directamente
        
        sum= sum+8;//entonces el resultado cambia, si el usuario coloco 1 y 1
        //sumandose serian un 2 pero con un +8 el resultado ahora sera 10.
        
        rest -=5;//se supone que esto se hace para acortar el codigo y ahorrar
        //mas tiempo, apriori los programadores dicen que esto es muy profecional
        //yo digo que lo hacen para confundir a las personas :)
        
        //pueden aprenderlo como quieran, recordarles que esto aplica con todos
        //los signos operacionales
        
        System.out.println("La suma es: "+sum);
        System.out.println("La resta es: "+rest);
        
        //por si no me creen les demuestro que el resultado cambia
        
        
    }
    
}
