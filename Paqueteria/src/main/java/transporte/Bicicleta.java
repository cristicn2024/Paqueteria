/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 * Clase entidad de la bicicleta que implementa la interfaz Transporte
 * @author crist
 */
public class Bicicleta implements Transporte{
    private Double velocidad = 20.0, costoAdicional = 5.0;

    /**
     * Constructor de la bicicleta
     */
    public Bicicleta() {
    }

    
    @Override
    public double calcularCosto(Double distancia) {
        return distancia / velocidad + costoAdicional;
          
    }
    
}
