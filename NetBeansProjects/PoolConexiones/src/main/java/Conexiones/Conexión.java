package Conexiones;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.*;
public class Conexión {
    
    private Conexión(){
        
    }
    
    private static final String URL = "jdbc:mysql://localhost/bd_control_clientes";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Conexión instancia;
    
    public DataSource obtenerFuenteDeDatos(){
        BasicDataSource datos = new BasicDataSource();
        datos.setUrl(URL);
        datos.setUsername(USER);
        datos.setPassword(PASSWORD);
        datos.setInitialSize(0);//tamaño de conexiones a la base de datos
        return datos;
    }
    
    public Connection conectar() throws SQLException{
        return obtenerFuenteDeDatos().getConnection();
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
