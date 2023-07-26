
package Biblioteca;


public class Libro extends Publicacion{
    String autor;
    int prestado;

    public Libro(String autor,int prestado, int codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrestado() {
        return prestado;
    }

    public void setPrestado(int prestado) {
        this.prestado = prestado;
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
        return "Libro\n" + "autor= " + autor + "\nprestado= " + prestado;
    }

    
    
    
}
