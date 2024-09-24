/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

/**
 * Adaptador que convierte montos en dolares a pesos.
 * Implementa la interfaz Moneda para proporcionar el monto en pesos.
 * @author crist
 */
public class DolarAPesoAdapter implements Moneda{
    private Dolar dolar;
    private static final double tasaCambio = 20.0;

    /**
     * Constructor que recibe un objeto Dolar.
     * @param dolar
     */
    public DolarAPesoAdapter(Dolar dolar) {
        this.dolar = dolar;
    }

    /**
     * Obtiene el monto a pesos
     * @return
     */
    @Override
    public Double obtenerMonto() {
        return dolar.obtenerMonto() * tasaCambio;
    }

}
