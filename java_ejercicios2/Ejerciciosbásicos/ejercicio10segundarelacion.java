package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio10segundarelacion {
    public static void main(String[] args) {
        // Ejercicio 10
        // Realiza un conversor de Mb a Kb.
        double entrada_mb;
        double Kb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de Mbs");
        entrada_mb = sc.nextDouble();
        Kb = entrada_mb * 1000;
        System.out.println("Kbs:" + Kb);
        sc.close();

    }
}
