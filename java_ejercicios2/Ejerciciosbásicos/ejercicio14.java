package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        // Ejercicio 14
        // Dada la siguiente función: y = ax2 + bx + c

        // Crea un programa que pida los coeficientes a, b y c, asi como el valor de x y
        // calcule el valor resultante de y.
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, y;
        System.out.println("Intrduzca a: ");
        a = sc.nextDouble();
        System.out.println("Intrduzca b: ");
        b = sc.nextDouble();
        System.out.println("Intrduzca c: ");
        c = sc.nextDouble();
        System.out.println("Introduzca x: ");
        x = sc.nextDouble();
        y = (a * x * x) + (b * x) + c;
        System.out.println("y= " + y);
        sc.close();

    }
}
