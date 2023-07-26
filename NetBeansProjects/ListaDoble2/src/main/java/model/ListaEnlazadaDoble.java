
package model;

public class ListaEnlazadaDoble {
   
    private Nodo inicio;
    private Nodo fin;

    public ListaEnlazadaDoble() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarAlInicio(Vehiculo vehiculo) {
        Nodo nuevoNodo = new Nodo(vehiculo);

        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(inicio);
            inicio.setAnterior(nuevoNodo);
}
}

public void agregarEntreNodos(Vehiculo vehiculo, int posicion) {
    Nodo nuevoNodo = new Nodo(vehiculo);

    if (inicio == null) {
        inicio = nuevoNodo;
        fin = nuevoNodo;
    } else {
        int contador = 0;
        Nodo actual = inicio;

        while (actual != null && contador < posicion) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (actual == null) {
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(fin);
            fin = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(actual.getAnterior());
            nuevoNodo.setSiguiente(actual);
            actual.getAnterior().setSiguiente(nuevoNodo);
            actual.setAnterior(nuevoNodo);
        }
    }
}

public void agregarAlFinal(Vehiculo vehiculo) {
    Nodo nuevoNodo = new Nodo(vehiculo);

    if (inicio == null) {
        inicio = nuevoNodo;
        fin = nuevoNodo;
    } else {
        fin.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(fin);
        fin = nuevoNodo;
    }
}

public void mostrarInicioFin() {
    Nodo actual = inicio;

    while (actual != null) {
        System.out.println(actual.getVehiculo());
        actual = actual.getSiguiente();
    }
}

public void mostrarFinInicio() {
    Nodo actual = fin;

    while (actual != null) {
        System.out.println(actual.getVehiculo());
        actual = actual.getAnterior();
    }
}
}

