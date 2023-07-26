package parcial;

public class NodoArbol {
    double dato;
    NodoArbol hijoIzquierdo, hijoDerecho;
    public NodoArbol(double d){
        this.dato=d;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }
    public String toString(){
        return dato + " Su Dato es " + dato;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
}
