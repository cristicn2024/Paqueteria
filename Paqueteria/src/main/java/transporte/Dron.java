/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 * Clase de la entidad dron que utiliza la interfaz transporte
 * @author crist
 */
public class Dron implements Transporte{
     private Double velocidad = 60.0, costoAdicional = 20.0;

    /**
     * Contructor del dron
     */
    public Dron() {
    }

    
    @Override
    public double calcularCosto(Double distancia) {
        return distancia / velocidad + costoAdicional;
          
    }
}
