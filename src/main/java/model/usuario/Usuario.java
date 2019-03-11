package model.usuario;

public class Usuario {
    public String genero;
    public NombreUsuario nombre;
    public String email;
    public String celular;

    public Usuario(String genero, NombreUsuario nombre, String email, String celular) {
        this.genero = genero;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public NombreUsuario getNombre() {
        return nombre;
    }

    public void setNombre(NombreUsuario nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
