/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author crist
 */
public class Sobre  extends Paquete{
    private static final double costoAdicional = 5.0; 

    public Sobre(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calcularPrecio() {
        return precioBase + costoAdicional;
    }
}
