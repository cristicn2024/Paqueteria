/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author crist
 */
public abstract class Paquete {
    protected Double precioBase;
    
    public Paquete(double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecio();
}
