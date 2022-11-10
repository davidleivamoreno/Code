package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        // Ejercicio 7
        // Realiza el programa que calcule la longitud y el área de una circunferencia
        // utilizando el valor de su radio introducido por el usuario.
        // (Debes de usar una constante para guardar el valor de pi)
        // Longitud = 2pi * radio
        // Área = pi * radio2
        Scanner sc = new Scanner(System.in);
        final double pi = Math.PI;
        System.out.println("Introduzca el radio de su circunferencia: ");
        double radio = sc.nextDouble();
        double Longitud = 2 * pi * radio;
        System.out.println("La longitud es: " + Longitud);
        sc.close();

    }
}
