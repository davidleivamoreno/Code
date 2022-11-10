package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        // Ejercicio 9
        // Realiza un programa que devuelva si un número entero introducido es par o
        // impar.
        Scanner sc = new Scanner(System.in);
        int entrada;
        System.out.println("Introduzca un numero");
        entrada = sc.nextInt();
        boolean esPar = (entrada % 2 == 0);
        // Usando operador ternario.
        String mensaje = (esPar) ? "par" : "impar";
        System.out.println("El número " + entrada + " es " + mensaje);
        sc.close();
    }
}
