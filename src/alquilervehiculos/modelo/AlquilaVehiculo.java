
package alquilervehiculos.modelo;

import java.io.Serializable;


public class AlquilaVehiculo implements Serializable{
     public AbstractVehiculo vehiculo;
    public Usuario usuario;

    public String cedulaCliente;
    public String fechaInicio;
    public String fechaFin;
    public String matricula;
    public String restricciones;
    public String usuarioAlquiler;
    public int diasAlquiler;
    public int kmFinales;
public AlquilaVehiculo(AbstractVehiculo vehiculo, Usuario usuario, int kmFinales) {
        this.vehiculo = vehiculo;
        this.usuario = usuario;
        this.kmFinales = kmFinales;
    }

    public AlquilaVehiculo(String matricula, String cedulaCliente, String restricciones, String usuarioAlquiler,
            String fechaInicio, String fechaFin, int diasAlquiler) {

        this.usuarioAlquiler = usuarioAlquiler;
        this.cedulaCliente = cedulaCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.diasAlquiler = diasAlquiler;
        this.matricula = matricula;
        this.restricciones = restricciones;
    }

    public AbstractVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(AbstractVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void AlquilarVehiculo() {

    }

    public int getKmFinales() {
        return kmFinales;
    }

    public void setKmFinales(int kmFinales) {
        this.kmFinales = kmFinales;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }

    public String getUsuarioAlquiler() {
        return usuarioAlquiler;
    }

    public void setUsuarioAlquiler(String usuarioAlquiler) {
        this.usuarioAlquiler = usuarioAlquiler;
    }
}
