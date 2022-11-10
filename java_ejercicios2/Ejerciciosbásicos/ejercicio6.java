package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        // Ejercicio 6
        // Realiza el programa que calcule la potencia al cubo de un número que el
        // usuario introduzca: X3

        Scanner sc = new Scanner(System.in);
        double entrada;
        double cubo;
        System.out.println("Introduzca un número y calculare el cubo del número introducido: ");
        entrada = sc.nextDouble();
        cubo = entrada * entrada * entrada;
        System.out.println("El número" + entrada + " al cubo es: " + cubo);
        sc.close();
    }
}
