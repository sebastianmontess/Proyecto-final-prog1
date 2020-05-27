
package alquilervehiculos.controlador;



import alquilervehiculos.excepciones.ClienteExcepcion;
import alquilervehiculos.excepciones.VehiculoExcepcion;
import alquilervehiculos.modelo.Cliente;
import alquilervehiculos.modelo.TipoUsuario;
import alquilervehiculos.modelo.Usuario;
import alquilervehiculos.utilidades.LeerArchivoPlano;
import java.util.List;


public class GestionUsuario {
    
      private TipoUsuario[] tipoUsuarios;
      public List<Usuario> usuarios;
     private List<Cliente> clientes;

    public GestionUsuario() {
        llenarTiposUsuario();
        llenarUsuarios();
        llenarClientes();
    }
    
     private void llenarTiposUsuario()
    {
        tipoUsuarios = new TipoUsuario[3]; 
        tipoUsuarios[0] = new TipoUsuario("1", "Administrador");
        tipoUsuarios[1] = new TipoUsuario("2", "Alquiler");
        tipoUsuarios[2] = new TipoUsuario("3", "Cliente");
    }
    
    
    public void llenarUsuarios()
    {
//        usuarios = new Usuario[3];
//        usuarios[0] = new Usuario("sebastian montes", "1002542616", "montess207@gmail.com", "1002542616", tipoUsuarios[0]);
//        usuarios[1] = new Usuario("Daniela prieto", "1002542514", "danielaprieto@gmail.com", "12345", tipoUsuarios[1]);
//        usuarios[2] = new Usuario("pepito perez", "12345678", "pepitoperez@gmail.com", "6789", tipoUsuarios[2]);
//        
        //cargar el csv
        usuarios=LeerArchivoPlano.cargarUsuarios(tipoUsuarios);
        
    
    }
     public void llenarClientes() {
        
        clientes = LeerArchivoPlano.cargarClientes(tipoUsuarios);
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    

    public TipoUsuario[] getTipoUsuarios() {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(TipoUsuario[] tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

  public void adicionarUsuario(Usuario usuario) throws ClienteExcepcion
    {
        if (validarExistenciaUsuario(usuario)){

            throw new ClienteExcepcion("El usuario on identificación: " + usuario.getCedula() + " ya existe");
        }
        else
        {      

        usuarios.add(usuario);

        }
    }

    private boolean validarExistenciaUsuario(Usuario usuario) {
       for (Usuario usr : this.usuarios)
        {
            if (usr.getCedula().compareTo(usuario.getCedula()) == 0)
            {
                return true;
            }
        }
        return false;
    }
       private boolean validarExistenciaUsuario(Cliente cliente)
    {

                for (Cliente cli : this.clientes)
        {
            if (cli.getCedula().compareTo(cliente.getCedula()) == 0)
            {
                return true;
            }
        }
        return false;
    }
public void adicionarCliente(Cliente cliente) throws VehiculoExcepcion
    {
        if (validarExistenciaUsuario(cliente))
        {

            throw new VehiculoExcepcion("El usuario con identidicación: " + cliente.getCedula() + " ya existe");
        }
        else
        {  

        clientes.add(cliente);

        }
    }
        public Cliente encontrarCliente(String id) 
    {
              for (Cliente cliente : getClientes())
            {
                Cliente cli;
                if (id.equals(cliente.getNombre()))
                {
                    cli = cliente; 
                    return cli;
                }
           
            }
            return null;
    }

    
    }

