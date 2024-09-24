/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

/**
 *
 * @author crist
 */
public class PesoADolarAdapter implements Moneda{
    private Peso peso;
    private static final double tasaCambio = 1 / 20.0;

    public PesoADolarAdapter(Peso peso) {
        this.peso = peso;
    }

    @Override
    public Double obtenerMonto() {
        return peso.obtenerMonto() * tasaCambio;
    }
}
