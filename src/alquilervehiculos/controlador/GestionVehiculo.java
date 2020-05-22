/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos.controlador;

import alquilervehiculos.modelo.AbstractVehiculo;
import alquilervehiculos.modelo.Coche;
import alquilervehiculos.modelo.Furgoneta;
import alquilervehiculos.modelo.Moto;
import alquilervehiculos.utilidades.LeerArchivoPlano;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author junor
 */
public class GestionVehiculo {
    private List<AbstractVehiculo> vehiculos;
    
    
      
    public GestionVehiculo() {

        llenarVehiculos();
       

    }
    
    public void llenarVehiculos() {
        vehiculos = new ArrayList<>();

        vehiculos = LeerArchivoPlano.cargarMotos();

        if (vehiculos == null || vehiculos.isEmpty()) {
            vehiculos = LeerArchivoPlano.cargarMotos();
        }
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

   
}
