package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 4
        // Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
        // las horas extras. Escribe un programa que calcule el salario semanal de un
        // trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
        // trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
        // euros
        // la hora.
        System.out.println("Introduzca las horas que ha realizado");
        int horas = sc.nextInt();
        final int HORA_NORMAL = 12;
        final int HORA_EXTRA = 16;
        double salario;
        if (horas >= 0 && horas <= 40) {
            salario = horas * HORA_NORMAL;
            System.out.println("Has cobrado: " + salario + " euros");
        } else if (horas >= 41) {
            salario = horas * HORA_EXTRA;
            System.out.println("Has cobrado: " + salario + " euros");
        } else {
            System.out.println("No ha trabajado");
        }
        if (horas == 0) {
            System.out.println("No has trabajado");
        }
    }
}
