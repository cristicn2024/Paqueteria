/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 * Subclase caja grande de la super clase Paquete
 * @author crist
 */
public class CajaGrande extends Paquete{
     private static final double costoAdicional = 50.0; 

    /**
     * Constructor de la caja grande con el precio base del paquete
     * @param precioBase
     */
    public CajaGrande(double precioBase) {
        super(precioBase);
    }

    @Override
    public double calcularPrecio() {
        return precioBase + costoAdicional;
    }
}
