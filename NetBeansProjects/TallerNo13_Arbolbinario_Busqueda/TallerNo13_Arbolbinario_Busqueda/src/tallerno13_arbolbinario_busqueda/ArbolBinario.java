package tallerno13_arbolbinario_busqueda;

public class ArbolBinario {
    NodoArbol raiz;
    public ArbolBinario(){
        raiz=null;
    }
    
    //Metodo para insertar un nodo en el Arbol
    public void agregarNodo(int d, EQUIPOS nom){
        NodoArbol nuevo = new NodoArbol(d, nom);
        if(raiz==null){
            raiz=nuevo;
        }else{
            NodoArbol auxiliar=raiz;
            NodoArbol padre;
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dato){
                    auxiliar=auxiliar.hijoIzquierdo;
                    if(auxiliar==null){
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar==null){
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    //Metodo para saber cuando el arbol esta vacio
    public boolean estaVacio(){
        return raiz==null;
    }
    
    //Metodo para recorrer el Arbol InOrden
    public void inOrden(NodoArbol r){
        if(r!= null){
            inOrden(r.hijoIzquierdo);
            System.out.print(r.dato + ", ");
            inOrden(r.hijoDerecho);
        }
    }
    
    //Metodo para recorrer el Árbol PreOrden
    public void preOrden(NodoArbol r){
        if(r!= null){
            System.out.print(r.dato + ", ");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
    
    //Metodo para recorrer el Árbol PostOrden
    public void postOrden(NodoArbol r){
        if(r!= null){
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.print(r.dato + ", ");
        }
    }
    
    //Metodo para buscar un Nodo en el Árbol
    public NodoArbol buscarNodo(int d){
        NodoArbol aux=raiz;
        while(aux.dato!=d){
            if(d<aux.dato){
                aux=aux.hijoIzquierdo;
            }else{
                aux=aux.hijoDerecho;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
    
    //Metodo para eliminar un Nodo del Árbol
    public boolean eliminar(int d){
        NodoArbol auxiliar=raiz;
        NodoArbol padre=raiz;
        boolean esHijoIzq=true;
        while(auxiliar.dato!=d){
            padre=auxiliar;
            if(d<auxiliar.dato){
                esHijoIzq=true;
                auxiliar=auxiliar.hijoIzquierdo;
            }else{
                esHijoIzq=false;
                auxiliar=auxiliar.hijoDerecho;
            }
            if(auxiliar==null){
                return false;
            }
        }//Fin del while
        if(auxiliar.hijoIzquierdo==null && auxiliar.hijoDerecho==null){
            if(auxiliar==raiz){
                raiz=null;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=null;
            }else{
                padre.hijoDerecho=null;
            }
        }else if(auxiliar.hijoDerecho==null){
            if(auxiliar==raiz){
                raiz=auxiliar.hijoIzquierdo;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=auxiliar.hijoIzquierdo;
            }else{
                padre.hijoDerecho=auxiliar.hijoIzquierdo;
            }
        }else if(auxiliar.hijoIzquierdo==null){
            if(auxiliar==raiz){
                raiz=auxiliar.hijoDerecho;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=auxiliar.hijoDerecho;
            }else{
                padre.hijoDerecho=auxiliar.hijoIzquierdo;
            }
        }else{
            NodoArbol reemplazo=obtenerNodoReemplazo(auxiliar);
            if(auxiliar==raiz){
                raiz=reemplazo;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=reemplazo;
            }else{
                padre.hijoDerecho=reemplazo;
            }
            reemplazo.hijoIzquierdo=auxiliar.hijoIzquierdo;
        }
        return true;
    }
    
    //Metodo encargado de devolveenos el Nodo reemplazo
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp){
        NodoArbol reemplazarPadre=nodoReemp;
        NodoArbol reemplazo=nodoReemp;
        NodoArbol auxiliar=nodoReemp.hijoDerecho;
        while(auxiliar!=null){
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.hijoIzquierdo;
        }
        if(reemplazo!=nodoReemp.hijoDerecho){
            reemplazarPadre.hijoIzquierdo=reemplazo.hijoDerecho;
            reemplazo.hijoDerecho=nodoReemp.hijoDerecho;
        }
        System.out.println("El Nodo Reemplazo es " + reemplazo);
        return reemplazo;
    }
}
