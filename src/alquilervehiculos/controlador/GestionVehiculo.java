/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos.controlador;

import alquilervehiculos.excepciones.VehiculoExcepcion;
import alquilervehiculos.modelo.AbstractVehiculo;
import alquilervehiculos.modelo.AlquilaVehiculo;
import alquilervehiculos.modelo.Coche;
import alquilervehiculos.modelo.Furgoneta;
import alquilervehiculos.modelo.Moto;
import alquilervehiculos.utilidades.LeerArchivoPlano;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author junor
 */
public class GestionVehiculo  implements Serializable{
    
    private List<AbstractVehiculo> vehiculos;
      private List<AlquilaVehiculo> vehiculosAlquilados  = new ArrayList<>();
    
      
    public GestionVehiculo() {

        llenarVehiculos();
       

    }
    
    public void llenarVehiculos() {
        
        vehiculos = new ArrayList<>();

        vehiculos = LeerArchivoPlano.cargarVehiculos();
                
        if (vehiculos == null || vehiculos.isEmpty()) {
            vehiculos = LeerArchivoPlano.cargarVehiculos();
        }
    }

    public List<AlquilaVehiculo> getVehiculosAlquilados() {
        return vehiculosAlquilados;
    }

    public void setVehiculosAlquilados(List<AlquilaVehiculo> vehiculosAlquilados) {
        this.vehiculosAlquilados = vehiculosAlquilados;
    }

    public GestionVehiculo(List<AbstractVehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
    
    public List<AbstractVehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<AbstractVehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
      
      
       public List<AbstractVehiculo> obtenerVehiculos(String tipo) {

        List<AbstractVehiculo> listaTemporal = new ArrayList<>();

        //Ciclo para recorrer todos los vehiculos y extraer lo neceario 
        for (AbstractVehiculo vehiculo : vehiculos) {

            switch (tipo) {
                case "Coche":
                    if (vehiculo instanceof Coche) {
                        listaTemporal.add(vehiculo);

                    }
                    break;

                case "Moto":
                    if (vehiculo instanceof Moto) {
                        listaTemporal.add(vehiculo);
                    }
                    break;

                case "Furgoneta":
                    if (vehiculo instanceof Furgoneta) {
                        listaTemporal.add(vehiculo);
                    }
                    break;

                case "Vehiculos":
                    if (vehiculo instanceof AbstractVehiculo) {
                        listaTemporal.add(vehiculo);
                    }
                    break;

            }

        }
        return listaTemporal;

    }
 public AbstractVehiculo encontrarVehiculo(String matricula)
    {
        for (AbstractVehiculo vehiculo : getVehiculos())
        {
            AbstractVehiculo veh;
            if (matricula.equals(vehiculo.getMatricula()))
            {
                veh = vehiculo;
                return veh;
            }

        }
        return null;
    }
   
  public void adicionarVehiculoAlquilado(AlquilaVehiculo alquilado) throws VehiculoExcepcion
    {
        vehiculosAlquilados.add(alquilado);
    }
 
 public void adicionarVehiculo(AbstractVehiculo vehiculo) throws VehiculoExcepcion
    {
        if (validarExistenciaVehiculo(vehiculo))
        {
/////////gritar que esa matricula ya existe
            throw new VehiculoExcepcion("El vehiculo con matricula: " + vehiculo.getMatricula()
                    + " ya existe");
        }
        else
        {
///////agrego a la lista
            vehiculos.add(vehiculo);

        }
    }
 
 
  private boolean validarExistenciaVehiculo(AbstractVehiculo vehiculo)
    {
        for (AbstractVehiculo vehi : this.vehiculos)
        {
            if (vehi.getMatricula().compareTo(vehiculo.getMatricula()) == 0)
            {
                return true;
            }
        }
        return false;
    }

 public void vehiculoNoEncontrado(AbstractVehiculo vehiculo) throws VehiculoExcepcion
    {
        if (ValidarVehiculo(vehiculo))
        {
/////////gritar que esa matricula ya existe
            throw new VehiculoExcepcion("El vehiculo con matricula: " + vehiculo.getMatricula()
                    + " no existe");
        }
        else
        {
///////agrego a la lista
            vehiculos.add(vehiculo);

        }
    }
 
  private boolean ValidarVehiculo(AbstractVehiculo vehiculo)
    {
        for (AbstractVehiculo vehi : this.vehiculos)
        {
            if (vehi.getMatricula().compareTo(vehiculo.getMatricula()) == 0)
            {
                return true;
            }
        }
        return false;
    }
}
