package Ejerciciosbásicos;

import java.util.Scanner;

public class Ejercicio3_relación {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 3

        // Genera un número aleatorio e indica si está más cerca de 1 o de 0;
        double numero = Math.random();
        boolean estaMascercaCero = (numero < 0.5);
        System.out.println((estaMascercaCero) ? "Está mas cerca de cero" : "Está más cerca de uno");

    }
}
