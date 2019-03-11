package services;

import external.mapper.UsuariosMapper;
import external.random.RandomConnector;
import external.random.dto.NombreDTO;
import external.random.dto.UsuarioDTO;
import external.random.dto.UsuariosContainer;
import model.usuario.NombreUsuario;
import model.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuariosService {

    @Autowired
    public RandomConnector randomConnector;
    @Autowired
    public UsuariosMapper usuariosMapper;

    public List<Usuario> generarRandom(){
        return usuariosMapper.convertirAUsuario(randomConnector.obtenerUsuarios());
    }

}
