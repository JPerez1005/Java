package bd_registros;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private Conexion() {
    }
    
    
    
    //variable que guarda el estado de la conexion a la bd
    private static Connection conexion;
    //variable para crear solo una instancia
    private static Conexion instancia;
    
    //variables para la conexion de las bases de datos
    private static final String URL="jdbc:mysql://localhost/bd_registros";
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    
    //creamos el metodo para conectarnos a la base
    public Connection conectar(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            
            return conexion;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog
            (null, "Error: no se pudo abrir la conexion por: "+e+"\n"
                    + "Verifique si su base de datos esta activa");
        }
        return conexion;
    }
    
    //Creamos el metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException{
        
        try {
            conexion.close();
            JOptionPane.showMessageDialog
            (null,"Procediento con la desconexion de la base de datos\n"
                    + "Desconectando de la base de datos......");
            JOptionPane.showMessageDialog
            (null,"Desconectado de la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog
            (null, "Error: no se pudo cerrar por: "+e);
            conexion.close();
        }finally{//finally si o si cierra la conexion
            conexion.close();
        }
        
    }
    
    //Patrón singleton
    
    public static Conexion getInstance(){
        if(instancia ==null){
            instancia=new Conexion();
        }
        return instancia;
    }
    
}
