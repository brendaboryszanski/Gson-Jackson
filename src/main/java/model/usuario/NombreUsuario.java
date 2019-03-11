package model.usuario;

public class NombreUsuario {
    public String primerNombre;
    public String segundoNombre;

    public NombreUsuario(String primerNombre, String segundoNombre) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
}
