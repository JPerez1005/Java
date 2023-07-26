package tallerno13_arbolbinario_busqueda;

public class NodoArbol {
    int dato;
    public EQUIPOS nombre;
    NodoArbol hijoIzquierdo, hijoDerecho;
    public NodoArbol(int d, EQUIPOS nom){
        this.dato=d;
        this.nombre=nom;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }
    public String toString(){
        return nombre + " Su Dato es " + dato;
    }
}
