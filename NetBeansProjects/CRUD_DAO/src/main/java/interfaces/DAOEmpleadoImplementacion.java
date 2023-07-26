package interfaces;

import dao.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import personas.empleado;

public class DAOEmpleadoImplementacion implements DAOEmpleado{

    Conexion conexion = Conexion.getInstance();
    
    @Override
    public void registrar(empleado empleado) {
        try {
            Connection conectar= conexion.conectar();
            PreparedStatement insertar= conectar.prepareStatement
                ("insert into empleados values(?,?)");
            
            insertar.setInt(1,empleado.getId());
            insertar.setString(2, empleado.getEmpleado());
            insertar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se han registrado los datos "
                    + "correctamente");
            conexion.cerrarConexion();
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
    }

    @Override
    public void modificar(empleado empleado) {
        try {
            Connection conectar= conexion.conectar();
            PreparedStatement modificar= conectar.prepareStatement
                ("update empleados set nombre = ? where id = ?");
            
            
            modificar.setString(1, empleado.getEmpleado());
            modificar.setInt(2,empleado.getId());
            modificar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se han modificado los datos "
                    + "correctamente");
            conexion.cerrarConexion();
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

    @Override
    public void eliminar(empleado empleado) {
        try {
            Connection conectar= conexion.conectar();
            PreparedStatement eliminar= conectar.prepareStatement
                ("delete from empleados where id = ?");
            
            eliminar.setInt(1,empleado.getId());
            eliminar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se han eliminado los datos "
                    + "correctamente");
            conexion.cerrarConexion();
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

    @Override
    public void buscar(empleado empleado) {
        try {
            Connection conectar= conexion.conectar();
            PreparedStatement buscar= conectar.prepareStatement
                ("select * from empleados where id = ?");
            
            buscar.setInt(1,empleado.getId());
            ResultSet consulta = buscar.executeQuery();
            
            if(consulta.next()){
                empleado.setId(Integer.parseInt(consulta.getString("id")));
                empleado.setEmpleado(consulta.getString("nombre"));
                JOptionPane.showMessageDialog(null, "Se han encontrado los datos "
                    + "correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Los datos no han sido encontrados");
            }
            
            
            
            conexion.cerrarConexion();
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
}
