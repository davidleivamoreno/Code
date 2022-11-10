package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio9_segundarelacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 9
        // Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/
        // 3πr2h.
        double radio;
        double altura;
        final double pi = Math.PI;
        double volumen;
        System.out.println("Introduzca el radio del cono");
        radio = sc.nextDouble();
        System.out.println("Introduzca la altura");
        altura = sc.nextDouble();
        volumen = 0.33 * pi * radio * radio * altura;
        System.out.println("El volumen es: " + volumen);
        sc.close();

    }
}
