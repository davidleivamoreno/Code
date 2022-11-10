package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        // Ejercicio 3:
        // Diseñar un programa que pida al usuario su fecha de nacimiento (solo el año)
        // y calcule su edad a 1 de Enero.

        Scanner sc = new Scanner(System.in);
        int año_Nacimiento;
        System.out.println("Digame su año de nacimiento");
        año_Nacimiento = sc.nextInt();
        int edad_enero = 2022 - año_Nacimiento;
        System.out.println("Su edad en enero es: " + edad_enero);
        sc.close();
    }
}
