/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 * Subclase sobre de la  super clase Paquete
 * @author crist
 */
public class Sobre  extends Paquete{
    private static final double costoAdicional = 5.0; 

    /**
     * Contructor del sobre con el precio base del paquete
     * @param precioBase
     */
    public Sobre(double precioBase) {
        super(precioBase);
    }

    /**
     * Metodo para caluclar el precio del tipo de paquete
     * @return
     */
    @Override
    public double calcularPrecio() {
        return precioBase + costoAdicional;
    }
}
