/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 * Clase del servicio express que implementa la interfaz Servicio
 * @author crist
 */
public class ServicioExpress implements Servicio{
     private static final double precioBase = 50.0;

    /**
     * Constructor del servicio express
     */
    public ServicioExpress() {
    }

    /**
     * Metodo que regresa el precio base del servicio express
     * @return
     */
    @Override
    public Double obtenerPrecioBase() {
        return precioBase;
    }

    
}
