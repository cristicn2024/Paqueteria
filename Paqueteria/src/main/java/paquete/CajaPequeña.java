/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 * Subclase caja pequeña de la super clase Paquete
 * @author crist
 */
public class CajaPequeña extends Paquete{
     private static final double costoAdicional = 10.0; 

    /**
     * Constructor de la caja pequeña con el precio base del paquete
     * @param precioBase
     */
    public CajaPequeña(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calcularPrecio() {
        return precioBase + costoAdicional;
    }
}
