/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author crist
 */
public class TransporteFactory {
    
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
