package parcial;

import javax.swing.JOptionPane;

public class Parcial {

    public static void main(String[] args) {
        int opcion = 0;
        double numero;
        ArbolBinario arbolito = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                          1. Agregar Numero Real
                                                                          2. Eliminar Numero Real 
                                                                          3. El Numero Mayor Real del Arbol Binario de Busqueda es
                                                                          4. El Numero Menor Real del Arbol Binario de Busqueda es  
                                                                          5. El numero Total de Nodo del Arbol Binario de Busqueda es   
                                                                          6. Salir  
                                                                          Elige una Opción""", "Árboles Binarios",
                        JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1 -> {
                        numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el Numero a Insertar", "Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE));
                        arbolito.agregarNodo(numero);
                    }
                    case 2 -> {
                        if (!arbolito.estaVacio()) {
                            numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el Numero del Nodo a Eliminar", "Eliminando Nodo",
                                    JOptionPane.QUESTION_MESSAGE));
                            if (arbolito.eliminar(numero) == false) {
                                JOptionPane.showMessageDialog(null, "El Nodo no se encuentra en el Árbol", "Nodo no encontrado", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El Nodo ha sido Eliminado del Árbol", "Nodo Eliminado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El Árbol está vacio", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    case 3 -> {
                        System.out.println("El numero Mayor es " + arbolito.mayorValor());
                    }
                    case 4 -> {
                        System.out.println("El numero Menor es " + arbolito.menorValor());
                    }
                    case 5 -> {
                        System.out.println("El numero Total de Nodo en el Arbol es: " + arbolito.cantidadNodos());
                    }
                    case 6 -> {
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 6);
    }
    
}
