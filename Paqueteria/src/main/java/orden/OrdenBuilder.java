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
public class OrdenBuilder {

    private Paquete paquete;
    private Servicio servicio;
    private Transporte transporte;
    private double distancia;

    /**
     *
     * @param paquete
     * @return
     */
    public OrdenBuilder setPaquete(Paquete paquete) {
        this.paquete = paquete;
        return this;
    }

    /**
     *
     * @param servicio
     * @return
     */
    public OrdenBuilder setServicio(Servicio servicio) {
        this.servicio = servicio;
        return this;
    }

    /**
     *
     * @param transporte
     * @return
     */
    public OrdenBuilder setTransporte(Transporte transporte) {
        this.transporte = transporte;
        return this;
    }

    /**
     *
     * @param distancia
     * @return
     */
    public OrdenBuilder setDistancia(double distancia) {
        this.distancia = distancia;
        return this;
    }

    /**
     *
     * @return
     */
    public Orden build() {
        return new Orden(paquete, servicio, transporte, distancia);
    }
}
