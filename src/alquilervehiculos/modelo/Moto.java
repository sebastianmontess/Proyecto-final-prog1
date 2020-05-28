
package alquilervehiculos.modelo;

import java.io.Serializable;


public class Moto extends AbstractVehiculo implements Serializable{
    public boolean casco;

    public Moto(String matricula, int km, boolean estado, double valorAlquiler, boolean casco) {
        super(matricula, km, estado, valorAlquiler);
        this.casco=casco;
    }

    public Moto(String matricula, int km, boolean estado, double valorAlquiler) {
       super(matricula, km, estado, valorAlquiler);
    }

    

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
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
    
     public Object[] obtenerArregloObjeto(){
        Object[] data={ getMatricula(),getKm(),isEstado(),getValorAlquiler(),isCasco()};
        return data;
    }

    @Override
    public void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void devolver(int kmFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alquilar() {
         
        setEstado(false);
    

    }

    @Override
    public double calcularAlquier(int dias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
