
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa= new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        //SELET FROM USUARIOS
        return usuJpa.findUsuarioEntities();
    }
    
}
