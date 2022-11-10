package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // Ejercicio 2:
        // Diseñar un programa que pida al usuario su edad y muestre la que tendrá el
        // pŕoximo año.

        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Cual es tu edad actual?");
        edad = sc.nextInt();
        edad = edad + 1;
        System.out.println("Tu edad el año que viene será: " + edad);
        sc.close();
    }
}
