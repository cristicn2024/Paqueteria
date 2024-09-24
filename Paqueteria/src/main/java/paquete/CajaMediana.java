/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author crist
 */
public class CajaMediana extends Paquete{
     private static final double costoAdicional = 20.0; 

    public CajaMediana(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calcularPrecio() {
        return precioBase + costoAdicional;
    }
}
