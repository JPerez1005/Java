
package Biblioteca;


public class Revista extends Publicacion{
    int serial;

    public Revista(int serial, int codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.serial = serial;
    }

    

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    

    @Override
    public String toString() {
        return "Revista:" + "\nserial= " + serial;
    }
    
    
}
