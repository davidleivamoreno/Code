package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        // Ejercicio 4:
        // Modifica el programa anterior para que calcule la edad del usuario en una
        // fecha que el usuario debe de introducir. (Solo con los años)

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su año de nacimiento: ");
        int añoNacimiento = sc.nextInt();
        System.out.println("Indique año supesto en el que esta: ");
        int año_Supuesto = sc.nextInt();
        int edad = año_Supuesto - añoNacimiento;
        System.out.println("Su edad es: " + edad);
        sc.close();
    }
}
