/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

/**
 * Adaptador que convierte montos en pesos a dólares.
 * Implementa la interfaz Moneda para proporcionar el monto en dólares.
 * @author crist
 */
public class PesoADolarAdapter implements Moneda{
    private Peso peso;
    private static final double tasaCambio = 1 / 20.0;

    /**
     * Constructor que recibe un objeto Peso.
     * @param peso
     */
    public PesoADolarAdapter(Peso peso) {
        this.peso = peso;
    }

    /**
     * Obtiene el monto en dólares.
     * @return
     */
    @Override
    public Double obtenerMonto() {
        return peso.obtenerMonto() * tasaCambio;
    }
}
