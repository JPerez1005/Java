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

public class LinkedListDemo {
    
    // Definimos la estructura del nodo
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Definimos el primer nodo (cabeza) de la lista
    static Node head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n1. Agregar nodo al inicio");
            System.out.println("2. Agregar nodo al final");
            System.out.println("3. Agregar nodo en medio");
            System.out.println("4. Eliminar nodo");
            System.out.println("5. Recorrer lista");
            System.out.println("6. Salir");
            System.out.print("Ingresa tu opción: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Ingresa el valor del nodo: ");
                    int val = sc.nextInt();
                    addAtBeginning(val);
                    break;
                case 2:
                    System.out.print("Ingresa el valor del nodo: ");
                    val = sc.nextInt();
                    addAtEnd(val);
                    break;
                case 3:
                    System.out.print("Ingresa el valor del nodo: ");
                    val = sc.nextInt();
                    System.out.print("Ingresa la posición después de la cual quieres insertar el nodo: ");
                    int pos = sc.nextInt();
                    addInMiddle(val, pos);
                    break;
                case 4:
                    System.out.print("Ingresa el valor del nodo que quieres eliminar: ");
                    val = sc.nextInt();
//                    deleteNode(val);
                    break;
                case 5:
                    System.out.println("La lista es la siguiente: ");
//                    printList();
                    break;
                case 6:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (option != 6);
    }

    // Agregar nodo al inicio
    public static void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Nodo agregado al inicio");
    }

    // Agregar nodo al final
    public static void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Nodo agregado al final");
    }

    // Agregar nodo en medio
    public static void addInMiddle(int data, int position) {
        Node newNode = new Node(data);
        int count = 0;
        Node current = head;
        while (current != null && count < position) {
            current = current.next;
            count++;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
            System.out.println("Nodo agregado en la posición " + position);
        } else {
            System.out.println("No se puede agregar nodo en la posición " + position);
        }
    }
    }

    //

