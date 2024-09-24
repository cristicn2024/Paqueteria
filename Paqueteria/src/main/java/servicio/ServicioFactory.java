/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author crist
 */
public class ServicioFactory {
    
    public static Servicio crearServicio(String tipo) {
        switch (tipo.toLowerCase()) {
            case "estándar":
                return new ServicioEstandar();
            case "express":
                return new ServicioExpress();
            default:
                throw new IllegalArgumentException("Tipo de servicio no válido");
        }
        
    }
}
