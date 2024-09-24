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

    public OrdenBuilder setPaquete(Paquete paquete) {
        this.paquete = paquete;
        return this;
    }

    public OrdenBuilder setServicio(Servicio servicio) {
        this.servicio = servicio;
        return this;
    }

    public OrdenBuilder setTransporte(Transporte transporte) {
        this.transporte = transporte;
        return this;
    }

    public OrdenBuilder setDistancia(double distancia) {
        this.distancia = distancia;
        return this;
    }

    public Orden build() {
        return new Orden(paquete, servicio, transporte, distancia);
    }
}
