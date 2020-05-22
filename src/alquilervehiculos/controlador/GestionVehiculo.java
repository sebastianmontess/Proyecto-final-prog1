/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos.controlador;

import alquilervehiculos.modelo.AbstractVehiculo;
import alquilervehiculos.utilidades.LeerArchivoPlano;
import java.util.List;

/**
 *
 * @author junor
 */
public class GestionVehiculo {
    private List<AbstractVehiculo> vehiculos;
    
    
      public void llenarMotos()
    {
        //cargar el csv
        vehiculos=LeerArchivoPlano.cargarMotos(vehiculos);
        
    
    }
      
      public void llenarCoches()
      {
          //cargar el csv
           vehiculos=LeerArchivoPlano.cargarCoches(vehiculos);
      }
      
      
       public void llenarFurgonetas()
      {
          //cargar el csv
           vehiculos=LeerArchivoPlano.cargarFurgonetas(vehiculos);
      }
      
      
      
}
