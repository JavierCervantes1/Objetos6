/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Event;

/**
 *
 * @author Javier Tareas
 */
public class Cafetera {
    
    private int capacidadMaxima;
    private int CantidadActual;
    
    public Cafetera(int capacidadMaxima, int CantidadActual) {
        
        this.capacidadMaxima = capacidadMaxima;
        this.CantidadActual = CantidadActual;
        
    }
    
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.CantidadActual = 0;
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public int getCantidadActual() {
        return CantidadActual;
    }
    
    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }
    
    public void Ajustar(int aux) {
        
        if (this.getCantidadActual() > this.getCapacidadMaxima()) {
            aux = this.getCapacidadMaxima() + (this.getCantidadActual() - this.getCapacidadMaxima());            
            this.setCapacidadMaxima(aux);
        }
    }
    
    public void Llenar(int aux) {
        if (this.getCantidadActual() < this.getCapacidadMaxima()) {
            aux = this.getCapacidadMaxima();
            this.setCantidadActual(aux);
        }
    }

    public Cafetera ServirTaza(Cafetera f2) {
        Cafetera c;
        int CapacidadTaza, CantidadActualCafe, aux;
        CapacidadTaza = f2.getCapacidadMaxima();
        
        aux = this.getCantidadActual() - f2.getCantidadActual();
        this.setCantidadActual(aux);
        
        CantidadActualCafe = f2.getCantidadActual();
               
        c = new Cafetera(CapacidadTaza,CantidadActualCafe);
        return c;
    }
    public Cafetera Ajuste(Cafetera f2){
        int aux;
    if (f2.getCantidadActual() < f2.getCapacidadMaxima()) {
            aux = f2.getCapacidadMaxima();
            f2.setCantidadActual(aux);
        }
    return f2;
    }
    
    public void Vaciar(int aux) {
        aux = this.getCantidadActual() - this.getCantidadActual();
        this.setCantidadActual(aux);
    }
    public String Mostrar(){
    String aux;
    aux = "Capacidad Maxima: " + this.getCapacidadMaxima() + "\n" 
        + "Cantidad Actual de Café: " + this.getCantidadActual();

    return aux;


    }
}
