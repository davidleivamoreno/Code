package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        // Ejercicio 15
        // Un Biólogo necesita calcular el número de patas de distintas especies que
        // esta estudiando y capturando:
        // Hormiga -> 6 patas
        // Arañas -> 8 patas
        // Cochinitas -> 14 patas
        // La aplicación debe preguntar por el número capturado de cada una de ellas y
        // devolver el número total de patas

        final int HORMIGA = 6;
        final int ARAÑAS = 8;
        final int COCHINITAS = 14;
        int numh, numa, numc, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas hormigas has capturado: ");
        numh = sc.nextInt();
        System.out.println("Cuantas arañas has capturado: ");
        numa = sc.nextInt();
        System.out.println("Cuantas cochinillas has capturado: ");
        numc = sc.nextInt();
        resultado = ((HORMIGA * numh) + (ARAÑAS * numa) + (COCHINITAS * numc));
        System.out.println("En total son: " + resultado + "patas");
        sc.close();

    }
}
