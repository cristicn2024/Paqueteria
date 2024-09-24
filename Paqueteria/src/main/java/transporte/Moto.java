/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 * Clase entidad de moto que implementa la interfaz Transporte
 * @author crist
 */
public class Moto implements Transporte{
     private Double velocidad = 45.0, costoAdicional = 15.0;

    /**
     * Consturctor de la moto
     */
    public Moto() {
    }

    
    @Override
    public double calcularCosto(Double distancia) {
        return distancia / velocidad + costoAdicional;
          
    }
}
