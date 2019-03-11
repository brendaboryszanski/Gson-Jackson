package services;

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
    public List<Usuario> generarRandom(){
        return this.mapearUsuarios(randomConnector.obtenerUsuarios());
    }

    private List<Usuario> mapearUsuarios(UsuariosContainer usuarios){
        return usuarios.getUsuario().stream().map(this::mapearUsuario).collect(Collectors.toList());
    }
    private Usuario mapearUsuario(UsuarioDTO usuarioDTO){
        return new Usuario(usuarioDTO.getGender(),
                this.mapearNombre(usuarioDTO.getName()),
                usuarioDTO.getEmail(),
                usuarioDTO.getCell());
    }
    private NombreUsuario mapearNombre(NombreDTO nombreDTO){
        return new NombreUsuario(nombreDTO.first, nombreDTO.last);
    }
}
