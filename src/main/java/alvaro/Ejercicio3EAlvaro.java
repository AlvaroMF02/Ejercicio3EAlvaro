package alvaro;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class Ejercicio3EAlvaro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //DUDAS
        //AL ACABAR EL PROGRAMA ME SALEN LOS MENUS (ANTES DE METER EL SWITCH YA NS LO Q SALE)
        //AL TENER EL SWITCH NO PUEDO CONTROLAR Q SE ESCRIBA BIEN EL COD DE PRODUCTO A NO SER QUE HAGA DOS DE CADA "m1" Y "M1" CON LAS MISMAS OPERACIONES
        //NO HE COMPROBADO Q LOS CALCULOS SEAN CORRECTOS, CONFIO EN DIOS 

        //VARIABLES
        String opcion;
        String opcionProduct;

        double costeManoObra;
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

            if (!opcion.equalsIgnoreCase("salir")) {

                //BUCLE PARA VER LOS PRODUCTOS
                do {
                    System.out.println(menuProductos);
                    opcionProduct = teclado.nextLine();
                    if (opcionProduct.equalsIgnoreCase("m1")
                            || opcionProduct.equalsIgnoreCase("p1")
                            || opcionProduct.equalsIgnoreCase("t1")
                            || opcionProduct.equalsIgnoreCase("t2")
                            || opcionProduct.equalsIgnoreCase("m2")) {

                        //BUCLE PARA CONTROLAR LA MATERIA PRIMA
                        do {
                            System.out.println("INDIQUE EL PRECIO DE LA MATERIA PRIMA");
                            materiaPrima = teclado.nextDouble();

                            if (materiaPrima >= 0.1 && materiaPrima <= 1) {

                                //BUCLE COSTE MANO DE OBRA
                                do {
                                    System.out.println("INDIQUE EL COSTE DE LA MANO DE OBRA");
                                    costeManoObra = teclado.nextDouble();

                                    if (costeManoObra >= 0.5 && costeManoObra <= 0.9) {

                                        switch (opcion) {
                                            case "M1" -> {

                                                costeProduccion = materiaPrima + costeManoObra;
                                                precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                                                System.out.println("Precio venta por unidad: " + precioVentaUnit);
                                                System.out.println("Coste de producción: " + costeProduccion);

                                                //CALCULO PARA LLEGAR A LOS 2500
                                                unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                                                System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                                            }
                                            case "P1" -> {
                                                costeProduccion = materiaPrima + costeManoObra;
                                                precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                                                System.out.println("Precio venta por unidad: " + precioVentaUnit);
                                                System.out.println("Coste de producción: " + costeProduccion);
                                                //CALCULO PARA LLEGAR A LOS 2500
                                                unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                                                System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                                            }
                                            case "T1" -> {
                                                costeProduccion = materiaPrima + costeManoObra;
                                                precioVentaUnit = costeProduccion + (costeProduccion * 0.65);
                                                System.out.println("Precio venta por unidad: " + precioVentaUnit);
                                                System.out.println("Coste de producción: " + costeProduccion);
                                                //CALCULO PARA LLEGAR A LOS 2500
                                                unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                                                System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                                            }
                                            case "T2" -> {
                                                costeProduccion = materiaPrima + costeManoObra;
                                                precioVentaUnit = costeProduccion + (costeProduccion * 0.65);
                                                System.out.println("Precio venta por unidad: " + precioVentaUnit);
                                                System.out.println("Coste de producción: " + costeProduccion);
                                                //CALCULO PARA LLEGAR A LOS 2500
                                                unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                                                System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                                            }
                                            case "M2" -> {
                                                costeProduccion = materiaPrima + costeManoObra;
                                                precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                                                System.out.println("Precio venta por unidad: " + precioVentaUnit);
                                                System.out.println("Coste de producción: " + costeProduccion);
                                                //CALCULO PARA LLEGAR A LOS 2500
                                                unidadesBeneficio = 2500 / (precioVentaUnit - costeProduccion);
                                                System.out.println("Para llegar a 2500€ hay que vender" + unidadesBeneficio);

                                            }

                                        }

                                    } else {
                                        System.out.println("ESCRIBA UN VALOR ENTRE 0.5 Y 0.9\n");
                                    }
                                } while (costeManoObra < 0.5 || costeManoObra > 0.9);

                            } else {
                                System.out.println("LA MATERIA PRIMA DEBE ESTAR ENTRE 0.1 Y 1\n");
                            }

                        } while (materiaPrima < 0.1 || materiaPrima > 1);

                    } else {
                        System.out.println("ESCRIBA BIEN EL CODIGO\n");
                    }

                } while (!(opcionProduct.equalsIgnoreCase("m1")
                        || opcionProduct.equalsIgnoreCase("p1")
                        || opcionProduct.equalsIgnoreCase("t1")
                        || opcionProduct.equalsIgnoreCase("t2")
                        || opcionProduct.equalsIgnoreCase("m2")
                        || opcionProduct.equalsIgnoreCase("salir")));
            }
        } while (!opcion.equalsIgnoreCase("salir"));

    }
}
