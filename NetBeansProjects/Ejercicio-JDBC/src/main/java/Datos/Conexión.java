package Datos;
import java.sql.*;
import javax.sql.DataSource;
import javax.swing.JOptionPane;

public class Conexión {
    
    private Conexión(){
        
    }
    
    private static final String URL = "jdbc:mysql://localhost/bd_control_clientes";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Conexión instancia;
    private static Connection conexion;
    
    public Connection conectar(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            
            return conexion;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog
            (null, "Error: no se pudo abrir la conexion por: "+e+"\n"
                    + "Verifique si su base de datos esta activa");
        }
        return conexion;
    }
    
    public void desconectar(Connection conexión){
        try {
            conexión.close();
        } catch (SQLException e) {
        }
    }
    
    public void cerrarResultSet(ResultSet resultado){
        try {
            resultado.close();
        } catch (SQLException e) {
            System.out.println("error: "+e);
        }
    }
    
    public void cerrarStatement(PreparedStatement consultaPreparada){
        try {
            consultaPreparada.close();
        } catch (SQLException e) {
        }
    }
    
    //Patron singleton
    public static Conexión getInstance(){
        if(instancia == null){
            instancia = new Conexión();
        }
        return instancia;
    }
}
