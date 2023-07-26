package tallerno13_arbolbinario_busqueda;

import javax.swing.JOptionPane;

public class TallerNo13_Arbolbinario_Busqueda {

    public static void main(String[] args) {
        int opcion = 0, elemento;
        ArbolBinario arbolito = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                          1. Insertar un Nodo
                                                                          2. Buscar Nodo
                                                                          3. Eliminar Nodo  
                                                                          4. Recorrer el Arbol InOrden
                                                                          5. Recorrer el Arbol PreOrden  
                                                                          6. Recorrer el Árbol PostOrden  
                                                                          7. Salir  
                                                                          Elige una Opción""", "Árboles Binarios",
                        JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Numero del Nodo", "Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE));
                        String Codigo = JOptionPane.showInputDialog(null, "Ingresa el Codigo del Equipo", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        String Nombre = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Equipo", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        String Ciudad = JOptionPane.showInputDialog(null, "Ingresa la Ciudad del Equipo", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        int Campeonatos_ganados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de campeonatos ganados", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        arbolito.agregarNodo(elemento, new EQUIPOS(Codigo, Nombre, Ciudad, Campeonatos_ganados));
                    }
                    case 2 -> {
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Numero del Nodo Buscado", "Buscando Nodo",
                                    JOptionPane.QUESTION_MESSAGE));
                            if (arbolito.buscarNodo(elemento) == null) {
                                JOptionPane.showMessageDialog(null, "El Nodo no se encuentra en el Árbol", "Nodo no encontrado", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("Nodo Encontrado, sus datos son: " + arbolito.buscarNodo(elemento));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El Árbol está vacio", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    case 3 -> {
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Numero del Nodo a Eliminar", "Eliminando Nodo",
                                    JOptionPane.QUESTION_MESSAGE));
                            if (arbolito.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "El Nodo no se encuentra en el Árbol", "Nodo no encontrado", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El Nodo ha sido Eliminado del Árbol", "Nodo Eliminado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El Árbol está vacio", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    case 4 -> {
                        if (!arbolito.estaVacio()) {
                            System.out.println();
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El Árbol está vacio", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    case 5 -> {
                        if (!arbolito.estaVacio()) {
                            System.out.println();
                            arbolito.preOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El Árbol está vacio", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    case 6 -> {
                        if (!arbolito.estaVacio()) {
                            System.out.println();
                            arbolito.postOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El Árbol está vacio", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    case 7 -> {
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 7);
    }

}
