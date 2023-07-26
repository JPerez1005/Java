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

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void addAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        newNode.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        return;
    }

    public void addAtMiddle(int data, int position) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        Node prev = null;

        for (int i = 0; i < position - 1; i++) {
            prev = temp;
            temp = temp.next;
        }

        newNode.next = temp;
        prev.next = newNode;
    }

    public void deleteNode(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void printList() {
        Node currentNode = head;

        System.out.print("LinkedList: ");

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");

            currentNode = currentNode.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean exit = false;

        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("1. Add node at start");
            System.out.println("2. Add node at end");
            System.out.println("3. Add node at middle");
            System.out.println("4. Delete node");
            System.out.println("5. Print list");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a number:");
                    int startData = sc.nextInt();
                    list.addAtStart(startData);
                    break;
                case 2:
                    System.out.println("Enter a number:");
                    int endData = sc.nextInt();
                    list.addAtEnd(endData);
                    break;
                case 3:
                    System.out.println("Enter a number:");
                    int middleData = sc.nextInt();
                    System.out.println("Enter the position:");
                    int position = sc.nextInt();
                    list.addAtMiddle(middleData, position);
                    break;
                case 4:
                    System.out.println("Enter the number to delete:");
                    int deleteData = sc.nextInt();
                    list.deleteNode(deleteData);
                    break;
                case 5:
                    list.printList();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}

