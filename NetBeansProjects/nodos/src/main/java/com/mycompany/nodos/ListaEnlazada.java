/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodos;

/**
 *
 * @author JPerez
 */
import java.util.Scanner;

public class ListaEnlazada {

    // Clase Nodo que representa cada elemento de la lista
    static class Nodo {
        int valor;
        Nodo siguiente;

        public Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    // Punteros para el inicio y fin de la lista
    static Nodo inicio = null;
    static Nodo fin = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar nodo al inicio");
            System.out.println("2. Agregar nodo al final");
            System.out.println("3. Agregar nodo en posición intermedia");
            System.out.println("4. Eliminar nodo");
            System.out.println("5. Imprimir nodos en orden de tamaño");
            System.out.println("6. Imprimir nodos de principio a fin");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a agregar: ");
                    int valorInicio = scanner.nextInt();
                    agregarAlInicio(valorInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a agregar: ");
                    int valorFin = scanner.nextInt();
                    agregarAlFinal(valorFin);
                    break;
                case 3:
                    System.out.print("Ingrese el valor a agregar: ");
                    int valorPosicion = scanner.nextInt();
                    System.out.print("Ingrese la posición donde agregar el valor: ");
                    int posicion = scanner.nextInt();
                    agregarEnPosicion(valorPosicion, posicion);
                    break;
                case 4:
                    System.out.print("Ingrese el valor a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    eliminarNodo(valorEliminar);
                    break;
                case 5:
                    imprimirEnOrden();
                    break;
                case 6:
                    imprimirNodos();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 7);
        scanner.close();
    }

    // Método para agregar un nuevo nodo al inicio de la lista
    static void agregarAlInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = inicio;
        inicio = nuevoNodo;
        if (fin == null) {
            fin = inicio;
        }
        System.out.println("Se agregó el valor " + valor + " al inicio de la lista.");
    }

    // Método para agregar un nuevo nodo al final de la lista
    static void agregarAlFinal(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (fin == null) {
            fin = nuevoNodo;
            inicio = fin;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
        System.out.println("Se agregó el valor " + valor + " al final de la lista.");
    }

    // Método para agregar un nuevo nodo en una posición intermedia
    // Método para agregar un nuevo nodo en una posición intermedia
static void agregarEnPosicion(int valor, int posicion) {
    if (posicion < 0) {
        System.out.println("La posición debe ser un número positivo.");
        return;
    }
    if (posicion == 0) {
        agregarAlInicio(valor);
        return;
    }
    Nodo nuevoNodo = new Nodo(valor);
    Nodo actual = inicio;
    Nodo anterior = null;
    int contador = 0;
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
    System.out.println("Se agregó el valor " + valor + " en la posición " + posicion + " de la lista.");
}

// Método para eliminar un nodo de la lista
static void eliminarNodo(int valor) {
    Nodo actual = inicio;
    Nodo anterior = null;
    while (actual != null && actual.valor != valor) {
        anterior = actual;
        actual = actual.siguiente;
    }
    if (actual == null) {
        System.out.println("El valor " + valor + " no se encontró en la lista.");
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
    System.out.println("Se eliminó el valor " + valor + " de la lista.");
}

// Método para imprimir los nodos en orden de tamaño
static void imprimirEnOrden() {
    // Creamos una lista temporal para almacenar los nodos
    Nodo actual = inicio;
    Nodo[] nodos = new Nodo[tamanioLista()];
    int i = 0;
    while (actual != null) {
        nodos[i] = actual;
        actual = actual.siguiente;
        i++;
    }
    // Ordenamos los nodos por tamaño
    for (int j = 0; j < nodos.length - 1; j++) {
        for (int k = j + 1; k < nodos.length; k++) {
            if (nodos[k].valor < nodos[j].valor) {
                Nodo temp = nodos[j];
                nodos[j] = nodos[k];
                nodos[k] = temp;
            }
        }
    }
    // Imprimimos los nodos en orden
    System.out.println("Nodos en orden de tamaño:");
    for (int j = 0; j < nodos.length; j++) {
        System.out.print(nodos[j].valor + " ");
    }
    System.out.println();
}

// Método para obtener el tamaño de la lista
static int tamanioLista() {
    Nodo actual = inicio;
    int contador = 0;
    while (actual != null) {
        contador++;
        actual = actual.siguiente;
    }
    return contador;
}

static void imprimirNodos() {
    System.out.println("Nodos en la lista:");
    Nodo actual = inicio;
    while (actual != null) {
        System.out.println(actual.valor);
        actual = actual.siguiente;
    }
}

}

