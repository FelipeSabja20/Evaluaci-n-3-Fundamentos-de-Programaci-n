/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */

public class Pelicula extends Contenido{
    private String duracion;
    private double calificacion;

    public Pelicula() {
    }

    public Pelicula(String duracion, double calificacion, String codigo, String recomendacion) {
        super(codigo, recomendacion);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", calificacion=" + calificacion + '}';
    }
    public double calculoCostoMensual(double valorTotal, int COSTO_BASE_SUSCRIPCION){
        COSTO_BASE_SUSCRIPCION = 12000;
        if(this.calificacion>=4.5){
            valorTotal=1.1*COSTO_BASE_SUSCRIPCION;
             return valorTotal;
    }else{
             return valorTotal;
        }
       
}
}
