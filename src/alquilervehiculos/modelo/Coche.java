
package alquilervehiculos.modelo;

import java.io.Serializable;


public class Coche extends  AbstractVehiculo implements Serializable{
    private boolean extras;

    public Coche(String matricula, int km, boolean estado, double valorAlquiler,boolean extras) {
        super(matricula, km, estado, valorAlquiler);
        this.extras=extras;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
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
    public double calcularAlquiler(int km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] obtenerArregloObjeto() {
        Object[] data={ getMatricula(),getKm(),isEstado(),getValorAlquiler(),isExtras()};
        return data;
    }

    
    
}
