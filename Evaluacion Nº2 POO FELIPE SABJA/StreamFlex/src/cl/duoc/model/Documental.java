/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenido {
    private int tiempo;
    private String enfoque;

    public Documental() {
    }


    public Documental(int tiempo, String enfoque, String codigo, String recomendacion) {
        super(codigo, recomendacion);
        this.tiempo = tiempo;
        this.enfoque = enfoque;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getEnfoque() {
        return enfoque;
    }

    public void setEnfoque(String enfoque) {
        this.enfoque = enfoque;
    }

    @Override
    public String toString() {
        return "Documental{" + "tiempo=" + tiempo + ", enfoque=" + enfoque + '}';
    }
    public double calculoCostoMensual(double valorTotal, int COSTO_BASE_SUSCRIPCION){
        COSTO_BASE_SUSCRIPCION = 12000;
        if(this.tiempo>90){
            valorTotal=0.95*COSTO_BASE_SUSCRIPCION;
             return valorTotal;
    }else{
            return valorTotal; 
        }
       
}
    
}
