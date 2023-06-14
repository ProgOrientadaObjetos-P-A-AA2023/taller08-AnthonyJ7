/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;

        System.out.println("Ingrese nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese su id");
        String id = entrada.nextLine();

        do {

            System.out.println("Docente\n"
                    + "1) Docente nombramiento\n"
                    + "2) Docente Factura\n");

            int i = entrada.nextInt();

            if (i == 1) {

                entrada.nextLine();

                System.out.println("Ingrese Valor sueldo");
                double valorSueldo = entrada.nextDouble();
                System.out.println("Ingrese Valor horas extra");
                double valorHorasE = entrada.nextDouble();
                System.out.println("Ingrese numero de horas extra");
                int numHorasE = entrada.nextInt();

                DocenteNombramiento d1 = new DocenteNombramiento();

                d1.establecerNombre(nombres);
                d1.establecerCedula(id);
                d1.establecerHoraExtra(valorHorasE);
                d1.establecerValorSueldo(valorSueldo);
                d1.establecerNumeroHorasE(numHorasE);

                d1.calcularSueldo();

                System.out.printf("%s\n", d1);

            } else {

                if (i == 2) {

                    entrada.nextLine();

                    System.out.println("Ingrese Valor factura");
                    double valorF = entrada.nextDouble();
                    System.out.println("Ingrese Valor IVA");
                    double valorIVA = entrada.nextDouble();

                    DocenteFactura d2 = new DocenteFactura();

                    d2.establecerNombre(nombres);
                    d2.establecerCedula(id);
                    d2.establecerValorIVA(valorIVA);
                    d2.establecerValorF(valorF);

                    d2.calcularValorC();

                    System.out.printf("%s\n", d2);

                } else {

                    if (i != 1 || i != 2 || i != 3) {

                        System.out.println("Error, Opcion no valida");

                    }

                }

            }

            System.out.println("Desea ingresar un nuevo usuario?: ");

            String res = entrada.next();

            entrada.nextLine();

            if (res.equals("No")) {

                bandera = false;

            }

        } while (bandera == true);

    }
}
