package com.mycompany.ejercicio3ealvaro;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class Ejercicio3EAlvaro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //VARIABLES
        String opcion;
        final double COSTEMANOBRAM1T1 = 0.15;
        final double COSTEMANOBRAM2T2P1 = 0.22;
        double costeProduccion;
        double materiaPrima;
        double precioVentaUnit;
        double unidadesBeneficio;
        String menu = """
                      **********************************
                        -> CALCULOS VIABILIDAD PRODUCTOS
                        -> SALIR
                      **********************************
                      """;
        String menuProductos = """
                      **********************************
                                  PRODUCTOS
                                
                        M1 -> Mantecados de Limón
                        P1 -> Polvorones
                        T1 -> Turrón de chocolate
                        T2 -> Turrón clásico
                        M2 -> Mazapanes

                      **********************************
                      """;

        //PRIMER BUCLE CON TODO EL PROGRAMA
        do {
            System.out.println(menu);
            opcion = teclado.nextLine();
            if (opcion.equalsIgnoreCase("salir")){
                break;
            }

            //BUCLE PARA VER LOS PRODUCTOS
            do {
                System.out.println(menuProductos);
                opcion = teclado.nextLine();

                //BUCLE PARA CONTROLAR LA MATERIA PRIMA
                do {
                    System.out.println("Indique el precio de la materia prima");
                    materiaPrima = teclado.nextDouble();

                    switch (opcion) {
                        case "M1" -> {

                            costeProduccion = materiaPrima + COSTEMANOBRAM1T1;
                            precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                            System.out.println("Precio venta por unidad: " + precioVentaUnit);
                            System.out.println("Coste de producción: " + costeProduccion);

                            //CALCULO PARA LLEGAR A LOS 2500
                            unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                            System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                        }
                        case "P1" -> {
                            costeProduccion = materiaPrima + COSTEMANOBRAM2T2P1;
                            precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                            System.out.println("Precio venta por unidad: " + precioVentaUnit);
                            System.out.println("Coste de producción: " + costeProduccion);
                            //CALCULO PARA LLEGAR A LOS 2500
                            unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                            System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                        }
                        case "T1" -> {
                            costeProduccion = materiaPrima + COSTEMANOBRAM1T1;
                            precioVentaUnit = costeProduccion + (costeProduccion * 0.65);
                            System.out.println("Precio venta por unidad: " + precioVentaUnit);
                            System.out.println("Coste de producción: " + costeProduccion);
                            //CALCULO PARA LLEGAR A LOS 2500
                            unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                            System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                        }
                        case "T2" -> {
                            costeProduccion = materiaPrima + COSTEMANOBRAM2T2P1;
                            precioVentaUnit = costeProduccion + (costeProduccion * 0.65);
                            System.out.println("Precio venta por unidad: " + precioVentaUnit);
                            System.out.println("Coste de producción: " + costeProduccion);
                            //CALCULO PARA LLEGAR A LOS 2500
                            unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                            System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                        }
                        case "M2" -> {
                            costeProduccion = materiaPrima + COSTEMANOBRAM2T2P1;
                            precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                            System.out.println("Precio venta por unidad: " + precioVentaUnit);
                            System.out.println("Coste de producción: " + costeProduccion);
                            //CALCULO PARA LLEGAR A LOS 2500
                            unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                            System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                        }

                    }
                } while (!opcion.equalsIgnoreCase("salir"));

            } while (materiaPrima > 0.1 || materiaPrima < 1);

        } while (!opcion.equalsIgnoreCase("salir"));

    }
}
