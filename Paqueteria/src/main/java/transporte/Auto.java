/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 * Clase entidad de auto que implementa la interfaz Transporte
 * @author crist
 */
public class Auto implements Transporte{
     private Double velocidad = 40.0, costoAdicional = 30.0;

    /**
     * Constructor del auto
     */
    public Auto() {
    }

    
    @Override
    public double calcularCosto(Double distancia) {
        return distancia / velocidad + costoAdicional;
          
    }
}
