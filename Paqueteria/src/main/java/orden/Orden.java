/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden;

import paquete.Paquete;
import servicio.Servicio;
import transporte.Transporte;

/**
 *
 * @author crist
 */
public class Orden {
  private Paquete paquete;
    private Servicio servicio;
    private Transporte transporte;
    private double distancia;

    public Orden(Paquete paquete, Servicio servicio, Transporte transporte, double distancia) {
        this.paquete = paquete;
        this.servicio = servicio;
        this.transporte = transporte;
        this.distancia = distancia;
    }

    public double calcularCostoTotal() {
        double costoTransporte = transporte.calcularCosto(distancia);
        double costoPaquete = paquete.calcularPrecio();
        double costoServicio = servicio.obtenerPrecioBase();
        return costoTransporte + costoPaquete + costoServicio;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
}
