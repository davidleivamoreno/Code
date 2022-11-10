package Ejerciciosbásicos;

import java.util.Scanner;

public class Ejercicio2_relación {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 2

        // Realiza un programa que realice el exponencial de un número por otro número.
        // Ambos números deben ser introducidos por teclado.
        System.out.println("Introduzca un número");
        double numero1 = sc.nextInt();
        System.out.println("Introduzca su exponencial");
        double numero2 = sc.nextInt();
        float resultado = (float) Math.pow(numero1, numero2);
        System.out.println("Resultado: " + resultado);
    }
}
