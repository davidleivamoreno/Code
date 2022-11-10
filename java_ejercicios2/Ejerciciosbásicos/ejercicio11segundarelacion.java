package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio11segundarelacion {
    public static void main(String[] args) {
        // Ejercicio 11
        // Realiza un conversor de Kb a Mb.
        Scanner sc = new Scanner(System.in);
        double entrada_kbs;
        double Mgb;
        System.out.println("Introduzca los Kbs");
        entrada_kbs = sc.nextDouble();
        Mgb = entrada_kbs / 1000;
        System.out.println("Los Mgbs son : " + Mgb);
        sc.close();

    }
}
