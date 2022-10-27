package com.mycompany.ejercicio3ealvaro;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class TuEresMiDulceMejorado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //VARIABLES
        double costeManoObra;
        double materiaPrima;
        double precioVentaUnit;
        double costeProduccion;
        double unidadesBeneficio;
        String pedido;
        String opcion;
        String menu = """
                      **********************************
                        -> CALCULOS VIABILIDAD PRODUCTOS
                        -> TERMINAR
                      **********************************
                      """;
        String menuProduc = """
                      **********************************
                                    MENU
                        M1 -> Mantecados de Limón
                        P1 -> Polvorones
                        T1 -> Turrón de chocolate
                        T2 -> Turrón clásico
                        M2 -> Mazapanes
                            
                      **********************************
                        INTRODUZCA UN CODIGO:
                      **********************************
                      """;
//
        //
        //
        //
        //
        //
        //
        //

        //MENU PRIMARIO CON DOS POSIBILIDADES
        do {
            System.out.println(menu);
            opcion = teclado.nextLine();
            //* * * MARRANADA * * *
            if (opcion.equalsIgnoreCase("salir")) {
                break;
            }
            //* * * MARRANADA * * *

            //INDICAR MATERIA PRIMA
            do {
                System.out.println("INDIQUE EL PRECIO DE LA MATERIA PRIMA");
                materiaPrima = teclado.nextDouble();
                teclado.nextLine();//LIMPIAR BUFFER

                //MENU DE CODIGOS       NO SALE DE AQUÍ NS PQ
                do {

                    System.out.println(menuProduc);
                    pedido = teclado.nextLine();
                    //* * * MARRANADA * * *
                    if (pedido.equalsIgnoreCase("salir")) {
                        break;
                    }
                    //* * * MARRANADA * * *
                    
                    //COSTE MANO OBRA
                    do{
                        System.out.println("INDIQUE EL COSTE DE LA MANO DE OBRA PARA ESTE PRODUCTO");
                        costeManoObra=teclado.nextDouble();
                        
                        
                    }while(costeManoObra < 0.5 || costeManoObra > 0.9);
                    
                    
                    
                    
                } while (!pedido.equalsIgnoreCase("m1")
                        || !pedido.equalsIgnoreCase("p1")
                        || !pedido.equalsIgnoreCase("t1")
                        || !pedido.equalsIgnoreCase("t2")
                        || !pedido.equalsIgnoreCase("m2"));

            } while (materiaPrima < 0.1 || materiaPrima > 1);
        } while (opcion.equalsIgnoreCase("salir"));

        /*
        //MOSTRAR EL MENU
        pedido = (JOptionPane.showInputDialog(menuProduc));

        if (pedido.equals("M1") || pedido.equals("P1")
                || pedido.equals("T1") || pedido.equals("T2")
                || pedido.equals("M2")) {

            //SACAR MATERIA PRIMA PARA CALCULAR EL COSTE DE PRODUCCION
            materiaPrima = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál será el coste de la materia prima?"));

            if (materiaPrima > 0.1 && materiaPrima <= 1) {

                switch (pedido) {
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

            } else {
                JOptionPane.showMessageDialog(null,
                        "LA MATERIA DEBE ESTAR ENTRE 0.1 Y 1");
            }
        } else {

            JOptionPane.showMessageDialog(null,
                    "DEBE ESCRIBIR EL CÓDIGO IGUAL");

        }
         */
    }

}
