package tallerkenia;

import java.util.Scanner;
import static tallerkenia.Vehiculo.fin;
import static tallerkenia.Vehiculo.inicio;

public class Principal {
    
    public static void main(String[] args) {
        Vehiculo V=new Vehiculo();
        Scanner scanner = new Scanner(System.in);
        int opcion,modelo,cilindraje;
        String placa,marca;
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        Scanner s4=new Scanner(System.in);
        
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar Vehiculo al inicio de la lista");
            System.out.println("2. Agregar Vehiculo al final de la lista");
            System.out.println("3. Agregar Vehiculo en el medio de la lista");            
            System.out.println("4. Ver Lista de Vehiculos");
            System.out.println("5. Eliminar Vehiculo");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1://Agregar al inicio--------
                    System.out.print("Ingrese la placa del vehiculo: \n");
                    placa = s1.nextLine();
                    V.setPlaca(placa);
                    System.out.print("Ingrese la marca del vehiculo: \n");
                    marca = s1.nextLine();
                    V.setMarca(marca);
                    System.out.print("Ingrese el modelo del vehiculo: \n");
                    modelo = s1.nextInt();
                    V.setModelo(modelo);
                    System.out.print("Ingrese el cilindraje del vehiculo: \n");
                    cilindraje = s1.nextInt();
                    V.setCilindraje(cilindraje);
                    
                    agregarAlInicio(placa, marca, modelo, cilindraje);
                    break;
                
                case 2://Agregar al final------
                    System.out.print("Ingrese la placa del vehiculo: \n");
                    placa = s2.nextLine();
                    V.setPlaca(placa);
                    System.out.print("Ingrese la marca del vehiculo: \n");
                    marca = s2.nextLine();
                    V.setMarca(marca);
                    System.out.print("Ingrese el modelo del vehiculo: \n");
                    modelo = s2.nextInt();
                    V.setModelo(modelo);
                    System.out.print("Ingrese el cilindraje del vehiculo: \n");
                    cilindraje = s2.nextInt();
                    V.setCilindraje(cilindraje);
                    
                    agregarAlFinal(placa, marca, modelo, cilindraje);
                    break;
                
                case 3: //Agregar en el intermedio
                    System.out.print("Ingrese la placa del vehiculo: \n");
                    placa = s3.nextLine();
                    V.setPlaca(placa);
                    System.out.print("Ingrese la marca del vehiculo: \n");
                    marca = s3.nextLine();
                    V.setMarca(marca);
                    System.out.print("Ingrese el modelo del vehiculo: \n");
                    modelo = s3.nextInt();
                    V.setModelo(modelo);
                    System.out.print("Ingrese el cilindraje del vehiculo: \n");
                    cilindraje = s3.nextInt();
                    V.setCilindraje(cilindraje);
                    
                    System.out.println("Ingrese la posición donde agregar el valor: ");
                    int posicion = scanner.nextInt();
                    
                    agregarEnPosicion(placa, marca, modelo, cilindraje, posicion);
                    
                    break;
                
                case 4://Imprimir los vehiculos
                    imprimirNodos();
                    break;
                    
                case 5://Eliminar algun vehiculo
                    System.out.print("Ingrese la placa del vehiculo que desea eliminar: \n");
                    placa = s4.nextLine();
                    V.setPlaca(placa);
                    
                    eliminarNodo(placa);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion !=6 );
        scanner.close();
        
        
    }
    
    // Método para agregar un nuevo nodo al inicio de la lista
    static void agregarAlInicio(String placa, String marca, int modelo, int cilindraje) {
        Vehiculo nuevoNodo = new Vehiculo(placa,marca,modelo,cilindraje);
        nuevoNodo.siguiente = inicio;
        inicio = nuevoNodo;
        if (fin == null) {
            fin = inicio;
        }
        System.out.println("Se agregó el vehiculo con la placa " + placa + ", al inicio de la lista.");
    }
    
    // Método para agregar un nuevo nodo al final de la lista
    static void agregarAlFinal(String placa, String marca, int modelo, int cilindraje) {
        Vehiculo nuevoNodo = new Vehiculo(placa,marca,modelo,cilindraje);
        if (fin == null) {
            fin = nuevoNodo;
            inicio = fin;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
        System.out.println("Se agregó el vehiculo con la placa " + placa + ", al final de la lista.");
    }
    
    // Método para agregar un nuevo nodo en una posición intermedia
    static void agregarEnPosicion(String placa, String marca, int modelo, int cilindraje, int posicion) {
    if (posicion < 0) {
        System.out.println("La posición debe ser un número positivo.");
        return;
    }
    if (posicion == 0) {
        agregarAlInicio(placa,marca,modelo,cilindraje);
        return;
    }
    Vehiculo nuevoNodo = new Vehiculo(placa,marca,modelo,cilindraje);
    Vehiculo actual = inicio;
    Vehiculo anterior = null;
    int contador = 1;
    while (actual != null && contador < posicion) {
        anterior = actual;
        actual = actual.siguiente;
        contador++;
    }
    if (contador != posicion) {
        System.out.println("La posición ingresada es mayor que el tamaño de la lista.");
        return;
    }
    anterior.siguiente = nuevoNodo;
    nuevoNodo.siguiente = actual;
    System.out.println("Se agregó el vehiculo con la placa " + placa + ", en la posición " + posicion + ", de la lista.");
}

    // Método para eliminar un nodo de la lista
    static void eliminarNodo(String placa) {
    Vehiculo actual = inicio;
    Vehiculo anterior = null;
    while (actual != null && (actual.placa == null ? placa != null : !actual.placa.equals(placa))) {
        anterior = actual;
        actual = actual.siguiente;
    }
    if (actual == null) {
        System.out.println("La placa " + placa + " no se encontró en la lista.");
        return;
    }
    if (anterior == null) {
        inicio = actual.siguiente;
    } else {
        anterior.siguiente = actual.siguiente;
    }
    if (actual == fin) {
        fin = anterior;
    }
    System.out.println("Se eliminó el vehiculo con la placa" + placa + " de la lista.");
}
    //Metodo para ver la lista
    static void imprimirNodos() {
    System.out.println("Vehiculos en la lista:");
    Vehiculo actual = inicio;
    while (actual != null) {
        System.out.println("Placa: "+actual.placa);
        System.out.println("Marca: "+actual.marca);
        System.out.println("Modelo: "+actual.modelo);
        System.out.println("Cilindraje: "+actual.cilindraje+"\n");
        System.out.println("----------------------------------------\n");
        actual = actual.siguiente;
    }
}
    
}
