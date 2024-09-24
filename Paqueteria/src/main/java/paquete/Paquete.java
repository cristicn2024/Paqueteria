/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 * Clase padre abstracta del paquete
 * @author crist
 */
public abstract class Paquete {

    /**
     * atributo precio base
     */
    protected Double precioBase;
    
    /**
     * Constructor del paquete
     * @param precioBase
     */
    public Paquete(double precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * Metodo que obtendar todas sus clases hijas
     * @return
     */
    public abstract double calcularPrecio();
}
