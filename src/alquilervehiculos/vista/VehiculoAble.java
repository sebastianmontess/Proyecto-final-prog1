/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos.vista;

/**
 *
 * @author junor
 */
public interface VehiculoAble {
      
    public void alquilar();
    
    public void devolver(int kmFinal);
    
    public double calcularAlquier(int dias);

    public void mostrarDatos( );
    @Override
    public String toString();
    
    
}
