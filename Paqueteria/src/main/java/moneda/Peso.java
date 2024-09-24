/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneda;

/**
 * Clase entidad del peso que implementa la interfaz Moneda
 * @author crist
 */
public class Peso implements Moneda{
    private double monto;

    /**
     * Constructor del peso
     * @param monto
     */
    public Peso(double monto) {
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
