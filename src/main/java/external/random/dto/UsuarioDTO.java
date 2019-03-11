package external.random.dto;

public class UsuarioDTO {
    public String gender;
    public NombreDTO name;
    public String email;
    public String cell;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public NombreDTO getName() {
        return name;
    }

    public void setName(NombreDTO name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
