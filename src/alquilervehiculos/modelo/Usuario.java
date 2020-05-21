
package alquilervehiculos.modelo;

import java.io.Serializable;


public class Usuario implements Serializable {
    private String nombre;
    private String cedula;
    private String correo;
    private String password;
    private TipoUsuario tipoUsuario;

    public Usuario(String nombre, String cedula, String correo, String password, TipoUsuario tipoUsuario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario(String dato, String dato0, TipoUsuario tipo, String dato1, String dato2, byte parseByte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

 @Override
    public String toString() {
        return this.nombre.toUpperCase()  ;
    }
    
    
    

    
}
