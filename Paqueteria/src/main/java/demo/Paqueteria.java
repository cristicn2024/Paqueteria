/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package demo;

import java.util.Scanner;
import moneda.Moneda;
import moneda.Peso;
import moneda.PesoADolarAdapter;
import orden.Orden;
import orden.OrdenBuilder;
import paquete.CajaGrande;
import paquete.CajaMediana;
import paquete.CajaPequeña;
import paquete.Paquete;
import paquete.Sobre;
import servicio.Servicio;
import servicio.ServicioEstandar;
import servicio.ServicioExpress;
import transporte.Auto;
import transporte.Bicicleta;
import transporte.Dron;
import transporte.Moto;
import transporte.Transporte;
import transporte.TransporteFactory;

/**
 * Clase que genera la demostracion para correr el programa
 * @author crist
 */
public class Paqueteria {

    /**
     * Metodo que inicia el programa y recibe los parametros del usuario
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("Ingrese el tipo de paquete (sobre, caja pequena, caja mediana, caja grande): ");
                String tipoPaquete = scanner.nextLine().toLowerCase().trim();

                System.out.println("Ingrese el tipo de servicio (estandar, express): ");
                String tipoServicio = scanner.nextLine().toLowerCase().trim();

                System.out.println("Ingrese la distancia en kilómetros: ");
                double distancia = scanner.nextDouble();

                System.out.println("¿Desea el resultado en dólares americanos? (sí/no): ");
                boolean enDolares = scanner.next().equalsIgnoreCase("si");

                Paquete paquete = crearPaquete(tipoPaquete);
                Servicio servicio = crearServicio(tipoServicio);
                Transporte transporte = determinarTransporte(tipoPaquete, tipoServicio, distancia);

                Orden orden = new OrdenBuilder()
                        .setPaquete(paquete)
                        .setServicio(servicio)
                        .setTransporte(transporte)
                        .setDistancia(distancia)
                        .build();

                double costoTotal = orden.calcularCostoTotal();
           
                double tiempoEstimado = calcularTiempoEstimado(transporte, distancia);

                if (enDolares) {
                    Moneda dolarAdaptado = new PesoADolarAdapter(new Peso(costoTotal));
                    costoTotal = dolarAdaptado.obtenerMonto();
                    System.out.printf("El costo total de la orden es: %.2f USD, se entregará en %s y se tardará aproximadamente %.2f minutos.%n", 
                            costoTotal, transporte.getClass().getSimpleName(), tiempoEstimado);
                } else {
                    System.out.printf("El costo total de la orden es: %.2f pesos, se entregará en %s y se tardará aproximadamente %.2f minutos.%n", 
                            costoTotal, transporte.getClass().getSimpleName(), tiempoEstimado);
                }

                continuar = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        scanner.close();
    }

    private static Paquete crearPaquete(String tipoPaquete) {
        switch (tipoPaquete) {
            case "sobre":
                return new Sobre(0);
            case "caja pequena":
                return new CajaPequeña(0);
            case "caja mediana":
                return new CajaMediana(0);
            case "caja grande":
                return new CajaGrande(0);
            default:
                throw new IllegalArgumentException("Tipo de paquete no válido");
        }
    }

    private static Servicio crearServicio(String tipoServicio) {
        switch (tipoServicio) {
            case "estandar":
                return new ServicioEstandar();
            case "express":
                return new ServicioExpress();
            default:
                throw new IllegalArgumentException("Tipo de servicio no válido");
        }
    }

    private static Transporte determinarTransporte(String tipoPaquete, String tipoServicio, double distancia) {
        if ((tipoPaquete.equals("sobre") || tipoPaquete.equals("caja pequena")) && distancia <= 1) {
            return TransporteFactory.crearTransporte(tipoServicio.equals("express") ? "dron" : "bicicleta");
        } else if ((tipoPaquete.equals("sobre") || tipoPaquete.equals("caja pequena")) && distancia > 1) {
            return TransporteFactory.crearTransporte(tipoServicio.equals("express") ? "moto" : "bicicleta");
        } else if (tipoPaquete.equals("caja mediana") && distancia <= 5) {
            return TransporteFactory.crearTransporte(tipoServicio.equals("express") ? "moto" : "bicicleta");
        } else if (tipoPaquete.equals("caja mediana") && distancia > 5) {
            return TransporteFactory.crearTransporte("moto");
        } else if (tipoPaquete.equals("caja grande")) {
            return TransporteFactory.crearTransporte("auto");
        } else {
            throw new IllegalArgumentException("Combinación de paquete, servicio y distancia no válida");
        }
    }

    private static double calcularTiempoEstimado(Transporte transporte, double distancia) {
        double velocidadPromedio = obtenerVelocidadPromedio(transporte);
        return (distancia / velocidadPromedio) * 60; // Convertir horas a minutos
    }

    private static double obtenerVelocidadPromedio(Transporte transporte) {
        if (transporte instanceof Bicicleta) {
            return 20.0;
        } else if (transporte instanceof Dron) {
            return 60.0;
        } else if (transporte instanceof Moto) {
            return 45.0;
        } else if (transporte instanceof Auto) {
            return 40.0;
        } else {
            throw new IllegalArgumentException("Tipo de transporte no válido");
        }
    }
}
