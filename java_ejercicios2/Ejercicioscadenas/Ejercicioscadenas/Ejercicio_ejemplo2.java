package Ejercicioscadenas;

import java.util.Scanner;

public class Ejercicio_ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuanto es el piso que quieres comprar");
        Double valorPiso = sc.nextDouble();// Yo lo he puesto aqui Double porque el precio de un piso suele tener
                                           // decimales
        System.out.println("Cuanto tienes ahorrado?");
        Double ahorrado = sc.nextDouble();// Aqui he hecho lo mismo
        System.out.println("Eres cliente del banco");
        String cliente = sc.nextLine();
        sc.nextLine();
        System.out.println("Tienes trabajo fijo");
        String trabajo = sc.nextLine();

        // String trabajominuscula = trabajo.toLowerCase();
        // String clienteminuscula = cliente.toLowerCase();
        // Esto no es necesario si utilizas compareToIgnoreCase();
        final double OPERACION = (valorPiso - (valorPiso * 0.2));// Aqui estabas poniendo esto:
        // final double OPERACION = ((valorPiso * 0.2)-valorPiso); --> Que siempre te
        // iba a dar un valor negativo así que la operación te daria
        // que siempre va a ser mayor la variable " ahorrado " que "OPERACION"
        final double OPERACION2 = (valorPiso - (valorPiso * 0.5));
        // final double OPERACION = ((valorPiso * 0.5)-valorPiso); --> Que siempre te
        // iba a dar un valor negativo así que la operación te daria
        // que siempre va a ser mayor la variable " ahorrado " que "OPERACION"
        // He puesto OPERACION y OPERACION2 como constantes porque pueden llegar a ser
        // usadas como tal en un futuro.
        System.out.println((cliente.equalsIgnoreCase("si")) && (cliente.equalsIgnoreCase("si"))
                || ((cliente.equalsIgnoreCase("si") && OPERACION <= ahorrado) || OPERACION2 <= ahorrado)
                        ? "Te damos el prestamo"
                        : " no te damos el prestamo");

        sc.close();// Yo suelo cerrar el scanner cuando ha terminado todo el problema por si voy a
                   // tener que volver que utilizarlo.
    }
}
