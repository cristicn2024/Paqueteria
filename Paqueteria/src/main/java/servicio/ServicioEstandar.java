/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author crist
 */
public class ServicioEstandar implements Servicio{
    private static final double precioBase = 30.0;

    public ServicioEstandar() {
    }

    @Override
    public Double obtenerPrecioBase() {
      return precioBase;
    }

    
    
}
