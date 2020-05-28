/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos.modelo;

import alquilervehiculos.vista.VehiculoAble;

/**
 *
 * @author junor
 */
abstract public class AbstractVehiculo implements VehiculoAble {
    public String matricula;
    public int km;
    public boolean estado;
    public double valorAlquiler;
    public Object otro; 

    public AbstractVehiculo(String matricula, int km, boolean estado, double valorAlquiler) {
        this.matricula = matricula;
        this.km = km;
        this.estado = estado;
        this.valorAlquiler = valorAlquiler;
    }

    public Object getOtro() {
        return otro;
    }

    public void setOtro(Object otro) {
        this.otro = otro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }
    
    
    
    
    
    @Override
    public abstract void mostrarDatos();

    public abstract double calcularAlquiler(int dias);

    @Override
    public abstract void devolver(int kmFinal);

    @Override
    public abstract void alquilar();
    
     
        public abstract Object[] obtenerArregloObjeto();
        
}
