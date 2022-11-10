package Ejerciciosbásicos;

import java.util.Scanner;

public class Java_ejercicios_factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int iva = 21;
        final double entrada;
        double total;
        System.out.println("Digame la base de compra en su factura: ");
        entrada = sc.nextDouble();
        total = entrada + (entrada / 100) * iva;
        System.out.println("El total en su compra es : " + total + " $");
        sc.close();

    }
}
