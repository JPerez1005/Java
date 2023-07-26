package Programacionats;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class cJOptionPane {

    
    public static void main(String[] args) {
        String cadena;
        byte numero;
        char letra;
        float decimal;
        
        cadena= JOptionPane.showInputDialog("Digite una cadena: ");//JOption 
        //muestra ventanas emergentes para visualizar la informacion programada
        //el dialog como su nombre lo indica es para dialogar o interactuar
        //con el usuario, al igual que el escanner se importa una libreria 
        //pero aqui no se usa la palabra new
        
        //el JOptionPane es muy facil de usar solo colocas JOptionPane despues
        //de eso un punto junto con control y espacio si es necesario 
        //para desplegar todos los metodos de este objeto JOptionPane
        
        //Quiere mostrar la cadena digitada? preste atencion a la siguiente
        //linea
        
        JOptionPane.showMessageDialog(null, cadena);//como el mismo metodo lo
        //indica show es mostrar y message es mensage que se usa principalmente
        //para mostrar cualquier tipo de informacion es como un sout, tampoco
        //es necesario tener una variable primitiva para poder colocar 
        //informacion en el objeto JOptionPane
        
        JOptionPane.showMessageDialog(null, "No es necesario una variable\n"
                + "para usarme, ¿si ven?\n\nYo tambien hago concatenaciones\n"
                + "por si se lo preguntan");
        
        //ahora hay que tener en cuenta que este objeto es principalmente String
        //es decir de tipo texto, entonces como haremos para convertir un texto
        //en numeros? usaremos una clase como respuesta
        
        numero = Byte.parseByte(JOptionPane.showInputDialog("Digite un numero: "));
        
        //de esta manera transformamos el string en un entero
        
        //ahora por ultimo haremos otra transformacion de variables pero hacia
        //una variable de tipo caracter
        
        letra=JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        //Ahora es su turno hagan una transformacion de tipo String a flotante
        //Suerte les deseo
        
        
    }
    
}
