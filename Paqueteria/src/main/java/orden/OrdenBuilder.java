/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden;

import paquete.Paquete;
import servicio.Servicio;
import transporte.Transporte;

/**
 * Clase para construir objetos de tipo Orden.
 * Utiliza el patrón Builder para facilitar la creación de instancias de Orden.
 * @author crist
 */
public class OrdenBuilder {

    private Paquete paquete;
    private Servicio servicio;
    private Transporte transporte;
    private double distancia;

    /**
     * Establece el paquete de la orden.
     * @param paquete
     * @return
     */
    public OrdenBuilder setPaquete(Paquete paquete) {
        this.paquete = paquete;
        return this;
    }

    /**
     * Establece el servicio de la orden.
     * @param servicio
     * @return
     */
    public OrdenBuilder setServicio(Servicio servicio) {
        this.servicio = servicio;
        return this;
    }

    /**
     * Establece el transporte de la orden.
     * @param transporte
     * @return
     */
    public OrdenBuilder setTransporte(Transporte transporte) {
        this.transporte = transporte;
        return this;
    }

    /**
     * Establece la distancia de la orden.
     * @param distancia
     * @return
     */
    public OrdenBuilder setDistancia(double distancia) {
        this.distancia = distancia;
        return this;
    }

    /**
     * Construye y devuelve una instancia de Orden.
     * @return
     */
    public Orden build() {
        return new Orden(paquete, servicio, transporte, distancia);
    }
}
