/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 * Clase factory de para crear los transportes
 * @author crist
 */
public class TransporteFactory {
    
    /**
     * Metodo que crea los transportes utilizando la interfaz Transporte
     * @param tipo
     * @return
     */
    public static Transporte crearTransporte(String tipo) {
        switch (tipo.toLowerCase()) {
            case "bicicleta":
                return new Bicicleta();
            case "dron":
                return new Dron();
            case "moto":
                return new Moto();
            case "auto":
                return new Auto();
            default:
                throw new IllegalArgumentException("Tipo de transporte no válido");
        }
    }
    
}
