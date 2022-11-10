package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double ADULTOS = 20;
        final double INFANTIL = 15.50;
        double resultado;
        int numa, numi;
        // Ejercicio 16
        // Empresa de un parque de atracciones quiere una aplicación que les ayude al
        // cobro de entradas a las familias que sacan las entradas.
        // Existen las entradas infantiles a 15,50€ y de adultos a 20€. En caso de que
        // el importe sea mayor a 100€ se aplicará un descuento del 5%
        System.out.println("Cuantos adultos son: ");
        numa = sc.nextInt();

        System.out.println("Cuantos niños son: ");
        numi = sc.nextInt();
        resultado = (numa * ADULTOS) + (numi * INFANTIL);
        if (resultado >= 100) {
            resultado = resultado - resultado * 0.05;
        } else {
            resultado = resultado;
        }
        System.out.println("Serian: " + resultado + " euros");

    }
}
