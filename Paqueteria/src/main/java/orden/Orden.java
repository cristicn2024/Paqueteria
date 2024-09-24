/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden;

import paquete.Paquete;
import servicio.Servicio;
import transporte.Transporte;

/**
 * Clase que representa una orden de entrega de paquetes.
 * Contiene información sobre el paquete, el servicio, el transporte y la distancia.
 * Proporciona métodos para calcular el costo total de la orden.
 * @author crist
 */
public class Orden {
  private Paquete paquete;
    private Servicio servicio;
    private Transporte transporte;
    private double distancia;

    /**
     * Constructor para crear una instancia de Orden.
     * @param paquete
     * @param servicio
     * @param transporte
     * @param distancia
     */
    public Orden(Paquete paquete, Servicio servicio, Transporte transporte, double distancia) {
        this.paquete = paquete;
        this.servicio = servicio;
        this.transporte = transporte;
        this.distancia = distancia;
    }

    /**
     * Calcula el costo total de la orden.
     * @return
     */
    public double calcularCostoTotal() {
        double costoTransporte = transporte.calcularCosto(distancia);
        double costoPaquete = paquete.calcularPrecio();
        double costoServicio = servicio.obtenerPrecioBase();
        return costoTransporte + costoPaquete + costoServicio;
    }

    /**
     * Obtiene el paquete de la orden.
     * @return
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * Establece el paquete de la orden.
     * @param paquete
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    /**
     * Obtiene el servicio de la orden.
     * @return
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * Establece el servicio de la orden.
     * @param servicio
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * Obtiene el transporte de la orden
     * @return
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * Establece el transporte de la orden
     * @param transporte
     */
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    /**
     * Obtiene la distancia de la orden.
     * @return
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Establece la distancia de la orden.
     * @param distancia
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
}
