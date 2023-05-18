
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis;//=new ControladoraPersistencia();

    public Controladora() {
        controlPersis=new ControladoraPersistencia();
    }
    
    
    public String validarUsuario(String usuario, String contrasenia) {
        
        
        //traemos los datos en una lista
        List<Usuario> listaUsuarios=controlPersis.traerUsuarios();
        
        String mensaje="";
        //recorremos la lista para  comparar los datos
        for(Usuario usu:listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
             if(usu.getContraseña().equals(contrasenia)){
                mensaje="Usuario y Contraseña correctos . Bienvenido/a" ;
                return mensaje;
             }
             else{
                 mensaje="Contraseña Incorrecta";
                 return mensaje;
             }
        }
            else{
                mensaje="Usuario no Encontrado";
                return mensaje;
            }
        }
        return mensaje;
    }
}
