package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        // Ejercicio 5
        // Realiza el programa que calcule la multiplicación de 2 números decimales.

        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.println("Introduce el primer número");
        num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número");
        num2 = sc.nextDouble();
        resultado = num1 * num2;

        System.out.println("El resultado es " + resultado);
        sc.close();
    }
}
