package Domain;

public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private float saldo;

    public Cliente() {
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente
        (String nombre, String apellido, String email, int telefono, float saldo) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public Cliente(int idCliente, String nombre, String apellido, String email, int telefono, float saldo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

//    public Cliente(String nombre, String apellido, String email, String telefono, float saldo) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.email = email;
//        this.telefono = telefono;
//        this.saldo = saldo;
//    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
        
        public String toString(){
            return "\nId: "+idCliente+"\nNombre: "+nombre+"\nApellido: "
                    +apellido+"\nEmail: "+email+"\nTelefono: "+"\nSaldo: "
                    +saldo+"\n";
        }
    
    
}
