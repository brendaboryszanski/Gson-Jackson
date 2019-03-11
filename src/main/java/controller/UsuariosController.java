package controller;

import model.usuario.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import services.UsuariosService;

import java.util.List;

@RestController
public class UsuariosController {
    @Autowired
    public UsuariosService usuariosService;
    private static final Logger LOGGER = LoggerFactory.getLogger(UsuariosController.class);

    @ResponseBody
    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public List<Usuario> generarRandom() throws Throwable {
        LOGGER.info("Creando usuario random");
        return this.usuariosService.generarRandom();
    }

}
