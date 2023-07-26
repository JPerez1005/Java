package Biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaPublicaciones {
    private ArrayList <Publicacion> listapub;
    
    //Contructor
    public ListaPublicaciones(){
        listapub = new ArrayList <Publicacion> ();
    }
    
    //metodo para agregar publicacion
    public void agregarPublicacion(Publicacion pub){
        listapub.add(pub);
    }
    
    
    public void CodigoLibroConsulta(int Codigo) {
        for (Publicacion tmp: listapub) {       //Uso de for extendido
            if (tmp instanceof Libro){
                if(((Libro) tmp).getCodigo()==Codigo)
                   JOptionPane.showMessageDialog(null,tmp.toString()); 
                }
        }
    }
    
    
    public void PrestadoLibroConsulta() {
        for (Publicacion tmp: listapub) {       //Uso de for extendido
            if (tmp instanceof Libro){
                if(((Libro) tmp).getPrestado()>0)
                   JOptionPane.showMessageDialog(null,tmp.toString()); 
                }
        }
    }
    
    public void PublicacionRevistaConsulta() {
        for (Publicacion tmp: listapub) {       //Uso de for extendido
            if (tmp instanceof Revista){
                if(((Revista) tmp).getAñoPublicacion()>2017)
                   JOptionPane.showMessageDialog(null,tmp.toString()); 
                }
        }
    }
    
    
    
    
    
    
    
    
}
