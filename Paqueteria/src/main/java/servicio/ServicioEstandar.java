/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 * Clase para el tipo de servicio estandar que implementa la interfaz Servicio
 * @author crist
 */
public class ServicioEstandar implements Servicio{
    private static final double precioBase = 30.0;

    /**
     * Constructor del servicio estandar
     */
    public ServicioEstandar() {
    }

    /**
     * Metodo que regresa el precio base del servicio estandar
     * @return
     */
    @Override
    public Double obtenerPrecioBase() {
      return precioBase;
    }

    
    
}
