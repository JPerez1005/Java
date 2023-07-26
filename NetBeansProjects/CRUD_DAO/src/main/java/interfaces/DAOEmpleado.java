package interfaces;

import personas.empleado;

public interface DAOEmpleado {
    public void registrar(empleado empleado);
    public void modificar(empleado empleado);
    public void eliminar(empleado empleado);
    public void buscar(empleado empleado);
}
