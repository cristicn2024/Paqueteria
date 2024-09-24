/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

/**
 *
 * @author crist
 */
public class Peso implements Moneda{
    private double monto;

    public Peso(double monto) {
        this.monto = monto;
    }

    @Override
    public Double obtenerMonto() {
        return monto;
    }
}
