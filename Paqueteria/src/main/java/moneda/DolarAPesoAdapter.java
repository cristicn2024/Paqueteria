/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

/**
 *
 * @author crist
 */
public class DolarAPesoAdapter implements Moneda{
    private Dolar dolar;
    private static final double tasaCambio = 20.0;

    public DolarAPesoAdapter(Dolar dolar) {
        this.dolar = dolar;
    }

    @Override
    public Double obtenerMonto() {
        return dolar.obtenerMonto() * tasaCambio;
    }

}
