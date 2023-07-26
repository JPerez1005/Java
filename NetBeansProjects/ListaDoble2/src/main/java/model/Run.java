
package model;

import java.util.Scanner;


public class Run {

   
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
    ListaEnlazadaDoble lista = new ListaEnlazadaDoble();

    int opcion = 0;

    do {
        
        System.out.println("Menú de opciones:");
        System.out.println("1. Agregar vehículo al inicio");
        System.out.println("2. Agregar vehículo entre nodos");
        System.out.println("3. Agregar vehículo al final");
        System.out.println("4. Mostrar lista de inicio a fin");
        System.out.println("5. Mostrar lista de fin a inicio");
        System.out.println("6. Salir");
        System.out.print("Ingrese una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la marca del vehículo: ");
                String marca = scanner.next();
                System.out.print("Ingrese el modelo del vehículo: ");
                String modelo = scanner.next();
                System.out.print("Ingrese el cilindraje del vehículo: ");
                int cilindraje = scanner.nextInt();
                System.out.print("Ingrese la placa del vehículo: ");
                String placa = scanner.next();

                Vehiculo vehiculoInicio = new Vehiculo(marca, modelo, cilindraje, placa);
                lista.agregarAlInicio(vehiculoInicio);
                break;
            case 2:
                System.out.print("Ingrese la marca del vehículo: ");
                String marca2 = scanner.next();
                System.out.print("Ingrese el modelo del vehículo: ");
                String modelo2 = scanner.next();
                System.out.print("Ingrese el cilindraje del vehículo: ");
                int cilindraje2 = scanner.nextInt();
                System.out.print("Ingrese la placa del vehículo: ");
                String placa2 = scanner.next();
                System.out.print("Ingrese la posición en la que desea agregar el vehículo: ");
                int posicion=scanner.nextInt();
                Vehiculo vehiculoEntreNodos = new Vehiculo(marca2, modelo2, cilindraje2, placa2);
//                System.out.println("Posiciones disponibles: de 0 a " + lista.contarNodos());
                int posicionEntreNodos = scanner.nextInt();

                lista.agregarEntreNodos(vehiculoEntreNodos, posicionEntreNodos);
                break;
        case 3:
                System.out.print("Ingrese la marca del vehículo: ");
                String marca3 = scanner.next();
                System.out.print("Ingrese el modelo del vehículo: ");
                String modelo3 = scanner.next();
                System.out.print("Ingrese el cilindraje del vehículo: ");
                int cilindraje3 = scanner.nextInt();
                System.out.print("Ingrese la placa del vehículo: ");
                String placa3 = scanner.next();

                Vehiculo vehiculoFinal = new Vehiculo(marca3, modelo3, cilindraje3, placa3);
                lista.agregarAlFinal(vehiculoFinal);
                break;
            case 4:
                System.out.println("Lista de vehículos de inicio a fin:");
                lista.mostrarInicioFin();
                break;
            case 5:
                System.out.println("Lista de vehículos de fin a inicio:");
                lista.mostrarFinInicio();
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    } while (opcion != 6);

    scanner.close();
}
         }
    

