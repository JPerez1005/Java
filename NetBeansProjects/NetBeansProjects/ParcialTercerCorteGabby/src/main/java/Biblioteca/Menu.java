
package Biblioteca;

import javax.swing.JOptionPane;

public class Menu {

    
    public static void main(String[] args) {
        
        ListaPublicaciones listapub = new ListaPublicaciones();
        
        int codigo,añoPublicacion,serial,prestado,op,codigoLibro;
        String titulo,autor,mensaje;
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("MENU DE ACCIONES"+
                                "\n 1. Crear un libro"+
                                "\n 2. Crear una revista"+
                                "\n 3. Consultar Libro por codigo"+
                                "\n 4. prestar lbro"+
                                "\n 5. Listado libros prestados"+
                                "\n 6. Listado de revistas publicadas en los ultimos 5 años"+
                                "\n 7. Cantidad de ejemplares de revistas de un nombre dado"+
                                "\n 8. Salir del menu"+
                                "\n\n Ingrese su eleccion: "));
            
            switch(op){
                case 1:codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la codigo del libro: "));
                       titulo=JOptionPane.showInputDialog("Ingrese el titulo del libro: ");
                       añoPublicacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicacion del libro: "));
                       autor=JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
                       
                           JOptionPane.showMessageDialog(null, "el libro sera prestado dependiendo del numero\n"
                               + "(1) significa que el libro es prestado\n"
                               + "(0) significa que el libro no es prestado");
                       prestado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese si quiere que el libro sea prestado: "));
                       if (prestado<0 || prestado>1){
                           do{
                           JOptionPane.showMessageDialog(null, "el numero seleccionado no es una de las opciones"
                                   + "\npor favor vuelva a digitar");
                           JOptionPane.showMessageDialog(null, "el libro sera prestado dependiendo del numero\n"
                               + "(1) significa que el libro es prestado\n"
                               + "(0) significa que el libro no es prestado");
                           prestado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese si quiere que el libro sea prestado: "));
                           }while(prestado<0 || prestado>1);
                       }
                       Libro L= new Libro(autor,prestado,codigo,titulo,añoPublicacion);
                       listapub.agregarPublicacion(L);
                       break;
                case 2:codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la codigo de la revista: "));
                       titulo=JOptionPane.showInputDialog("Ingrese el titulo de la revista: ");
                       añoPublicacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicacion de la revista: "));
                       serial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el serial de la revista: "));
                       Revista R= new Revista(serial,codigo,titulo,añoPublicacion);
                       listapub.agregarPublicacion(R);
                       break;
                case 3: codigoLibro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del libro a consultar: "));
                        listapub.CodigoLibroConsulta(codigoLibro);
                case 4: 
                        break;
                case 5: listapub.PrestadoLibroConsulta();
                        break;
                case 6: listapub.PublicacionRevistaConsulta();
                        break;
                case 7: 
                        break;
                case 8: JOptionPane.showMessageDialog(null, "usted esta saliendo del programa");
                        break;
                        
                        
            }
            
        }while(op<8);
    }
    
}
