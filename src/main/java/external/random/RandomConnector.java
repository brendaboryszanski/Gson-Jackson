package external.random;

import external.random.dto.UsuariosContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomConnector {
    public static final String usuarios = "https://randomuser.me/api/";
    public UsuariosContainer obtenerUsuarios(){
        return null;
    }
}
