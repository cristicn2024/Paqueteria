/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

/**
 *
 * @author crist
 */
public class Dolar implements Moneda{
      private double monto;

    public Dolar(double monto) {
        this.monto = monto;
    }

    @Override
    public Double obtenerMonto() {
        return monto;
    }
}
