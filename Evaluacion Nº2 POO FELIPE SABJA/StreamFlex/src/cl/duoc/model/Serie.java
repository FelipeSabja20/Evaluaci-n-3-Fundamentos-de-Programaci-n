/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenido{
    private int temporadas;
    private String estado;

    public Serie() {
    }

    public Serie(int temporadas, String estado, String codigo, String recomendacion) {
        super(codigo, recomendacion);
        this.temporadas = temporadas;
        this.estado = estado;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Serie{" + "temporadas=" + temporadas + ", estado=" + estado + '}';
    }
    public double calculoCostoMensual(double valorTotal, int COSTO_BASE_SUSCRIPCION){
        COSTO_BASE_SUSCRIPCION = 12000;
        if((this.temporadas>3)&&(equalsIgnoreCase(this.estado)== equalsIgnoreCase("No finalizadas"))){
            valorTotal=1.08*COSTO_BASE_SUSCRIPCION;
            return valorTotal;
    }else{
               return valorTotal;
        }
     
}
    
}
