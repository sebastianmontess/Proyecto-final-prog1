
package alquilervehiculos.controlador;

import alquilervehiculos.modelo.TipoUsuario;
import alquilervehiculos.modelo.Usuario;
import alquilervehiculos.utilidades.LeerArchivoPlano;
import java.util.List;


public class GestionUsuario {
    
      private TipoUsuario[] tipoUsuarios;
      private List<Usuario> usuarios;

    public GestionUsuario() {
        llenarTiposUsuario();
        llenarUsuarios();
    }
    
     private void llenarTiposUsuario()
    {
        tipoUsuarios = new TipoUsuario[3]; 
        tipoUsuarios[0] = new TipoUsuario("1", "Administrador");
        tipoUsuarios[1] = new TipoUsuario("2", "Alquiler");
        tipoUsuarios[2] = new TipoUsuario("3", "Cliente");
    }
    
    
    private void llenarUsuarios()
    {
//        usuarios = new Usuario[3];
//        usuarios[0] = new Usuario("sebastian montes", "1002542616", "montess207@gmail.com", "1002542616", tipoUsuarios[0]);
//        usuarios[1] = new Usuario("Daniela prieto", "1002542514", "danielaprieto@gmail.com", "12345", tipoUsuarios[1]);
//        usuarios[2] = new Usuario("pepito perez", "12345678", "pepitoperez@gmail.com", "6789", tipoUsuarios[2]);
//        
        //cargar el csv
        usuarios=LeerArchivoPlano.cargarUsuarios(tipoUsuarios);
        
    
    }
    
    public Usuario encontrarUsuario(String correo, String password)
    {
        for(Usuario usuarioEncontrado: usuarios)
        {
            if(usuarioEncontrado.getCorreo().compareTo(correo)==0 &&
                    usuarioEncontrado.getPassword().compareTo(password)==0)
            {
                return usuarioEncontrado;
            }
        }
        
        return null;
    }
   
    
}
