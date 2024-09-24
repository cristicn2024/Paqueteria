/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package transporte;

/**
 * Interfaz con el metodo que usan todos los tipos de transportes creados y por crear
 * @author crist
 */
public interface Transporte {

    /**
     * Metodo que calcula el costo del transporte
     * @param distancia
     * @return
     */
    public double calcularCosto( Double distancia);
}
