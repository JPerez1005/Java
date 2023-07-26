package Datos;
import Domain.Cliente;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
public class ClienteDAO {
    
    Conexión instancia= Conexión.getInstance();
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "select * from cliente";
    private static final String SQL_INSERT = "insert into cliente(nombre,apellido,email,telefono,saldo) values(?,?,?,?,?)";
    private static final String SQL_UPDATE = "update cliente set nombre = ?, apellido = ?, email = ?, telefono = ?, saldo = ? where id_cliente = ?";
    private static final String SQL_DELETE = "delete from cliente where id_cliente = ?";

    public ClienteDAO() {
    }

    public ClienteDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    
    
    //Creamos el metodo para enlistar los datos

    public List<Cliente> Listar()
    {
        Connection conexion=null;
        PreparedStatement consulta=null;
        ResultSet resultado=null;
        
        List<Cliente> clientes;
        clientes = new ArrayList<>();
        
        Cliente cliente;
        
        try {
//            conexion = instancia.conectar();//Conexion normal
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instancia.conectar();
            consulta = conexion.prepareStatement(SQL_SELECT);
            resultado = consulta.executeQuery();
            
            while(resultado.next()){
                int id_cliente = resultado.getInt("id_cliente");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String email = resultado.getString("email");
                int telefono = resultado.getInt("telefono");
                float saldo = resultado.getFloat("saldo");
                
                cliente = new Cliente(id_cliente, nombre, apellido, email, telefono, saldo);
                clientes.add(cliente);
            }
        } catch (Exception e) {
        }finally{
            instancia.cerrarResultSet(resultado);
            instancia.cerrarStatement(consulta);
//            instancia.desconectar(conexion);
            if(conexionTransaccional==null){
                instancia.desconectar(conexion);
            }
        }
        
        return clientes;
                
    }
    
    //creamos metodo para insertar
    
    public int insertar(Cliente cliente){
        Connection conexion = null;
        PreparedStatement consulta = null;
        int registros= 0;
        try {
//            conexion = instancia.conectar();
conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instancia.conectar();
            consulta = conexion.prepareStatement(SQL_INSERT);
            consulta.setString(1, cliente.getNombre());
            consulta.setString(2, cliente.getApellido());
            consulta.setString(3, cliente.getEmail());
            consulta.setInt(4, cliente.getTelefono());
            consulta.setFloat(5, cliente.getSaldo());
            
            registros = consulta.executeUpdate();
            
        } catch (Exception e) {
        }finally{
            instancia.cerrarStatement(consulta);
//            instancia.desconectar(conexion);
if(conexionTransaccional==null){
                instancia.desconectar(conexion);
            }
        }
        
        return registros;
    }
    
    public int modificar(Cliente cliente){
        Connection conexion = null;
        PreparedStatement consulta = null;
        int registros= 0;
        try {
//            conexion = instancia.conectar();
conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instancia.conectar();
            consulta = conexion.prepareStatement(SQL_UPDATE);
            consulta.setString(1, cliente.getNombre());
            consulta.setString(2, cliente.getApellido());
            consulta.setString(3, cliente.getEmail());
            consulta.setInt(4, cliente.getTelefono());
            consulta.setFloat(5, cliente.getSaldo());
            consulta.setInt(6, cliente.getIdCliente());
            
            registros = consulta.executeUpdate();
            
        } catch (Exception e) {
        }finally{
            instancia.cerrarStatement(consulta);
//            instancia.desconectar(conexion);
if(conexionTransaccional==null){
                instancia.desconectar(conexion);
            }
        }
        
        return registros;
    }
    
    public int eliminar(Cliente cliente){
        Connection conexion = null;
        PreparedStatement consulta = null;
        int registros= 0;
        try {
//            conexion = instancia.conectar();
conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instancia.conectar();
            consulta = conexion.prepareStatement(SQL_DELETE);
           
            consulta.setInt(1, cliente.getIdCliente());
            
            registros = consulta.executeUpdate();
            
        } catch (Exception e) {
        }finally{
            instancia.cerrarStatement(consulta);
//            instancia.desconectar(conexion);
if(conexionTransaccional==null){
                instancia.desconectar(conexion);
            }
        }
        
        return registros;
    }
    
}
