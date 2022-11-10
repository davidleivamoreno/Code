package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio1
        // Diseñar un programa que pida al usuario su nombre, un número entero, un
        // número decimal
        // la hora actual (15.34) y los muestre por pantalla.

        // Ejemplo Salida:
        // Tu nombre es “Pepe”
        // El numero introducido es ‘55’
        // Y la hora introducida era las “12:34”

        String nombre;
        int num1;
        double num2;
        float Hora;

        System.out.println("Introduzca su nombre");
        nombre = sc.nextLine();
        System.out.println("Tu nombre es " + (char) 34 + nombre + (char) 34);
        System.out.println("Introduzca un número entero");
        num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca un número decimal");
        num2 = sc.nextDouble();
        System.out.println("Introduzca la hora");
        Hora = sc.nextFloat();
        System.out.println("Hora: " + Hora + "h");
        sc.close();
    }
}
