package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales5 {

    // Ejercicio 5
    // Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b
    // =
    // 0).
    // Ejemplo 1:
    // Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
    // Por favor, introduzca el valor de a: 2
    // Ahora introduzca el valor de b: 1
    // x = -0.5
    // Ejemplo 2:
    // Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
    // Por favor, introduzca el valor de a: 0
    // Ahora introduzca el valor de b: 7
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a:");
        double a = sc.nextDouble();
        System.out.println("Ahora introduzca el valor de b:");
        double b = sc.nextDouble();
        double x = (b * -1 / a);

        if (b == 0 || a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + x);
        }
    }

}
