package tallerno13_arbolbinario_busqueda;

public class EQUIPOS {
    private String Codigo;
    private String Nombre;
    private String Ciudad;
    private int Campeonatos_ganados;

    public EQUIPOS(String Codigo, String Nombre, String Ciudad, int Campeonatos_ganados) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Campeonatos_ganados = Campeonatos_ganados;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getCampeonatos_ganados() {
        return Campeonatos_ganados;
    }

    public void setCampeonatos_ganados(int Campeonatos_ganados) {
        this.Campeonatos_ganados = Campeonatos_ganados;
    }

    @Override
    public String toString() {
        return "EQUIPOS{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Ciudad=" + Ciudad + ", Campeonatos_ganados=" + Campeonatos_ganados + '}';
    }
}
