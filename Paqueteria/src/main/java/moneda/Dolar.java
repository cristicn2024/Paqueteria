/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

/**
 * Clase entidad del dolar que implementa la interfaz Moneda
 * @author crist
 */
public class Dolar implements Moneda{
      private double monto;

    /**
     * Constructor del dolar
     * @param monto
     */
    public Dolar(double monto) {
        this.monto = monto;
    }

    /**
     * Metodo que obtiene el monto
     * @return
     */
    @Override
    public Double obtenerMonto() {
        return monto;
    }
}
