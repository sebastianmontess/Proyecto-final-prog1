
package alquilervehiculos.modelo;


import java.util.Date;


public class AlquilaVehiculo {
   


    public AbstractVehiculo vehiculo;

    public Date fechaAlquiler;
    public Date fechaDevolucion;
    public Cliente cliente;

    public AlquilaVehiculo(AbstractVehiculo vehiculo, Date fechaAlquiler, Date fechaDevolucion, Cliente cliente)
    {
        this.vehiculo = vehiculo;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
    }

    public AbstractVehiculo getVehiculo()
    {
        return vehiculo;
    }

    public void setVehiculo(AbstractVehiculo vehiculo)
    {
        this.vehiculo = vehiculo;
    }

    public Date getFechaAlquiler()
    {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler)
    {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion()
    {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion)
    {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }



    public Object[] obtenerArregloVehiculoAlquilado()
    {
        Object[] dato =
        {
            getVehiculo().getMatricula(), getCliente().cedula, getFechaAlquiler(), getFechaDevolucion()
        };
        return dato;
    }

}


