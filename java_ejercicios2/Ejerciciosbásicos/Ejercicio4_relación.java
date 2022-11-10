package Ejerciciosbásicos;

import java.util.Scanner;

public class Ejercicio4_relación {
    public static void main(String[] args) {
        // Ejercicio 4

        // Muestra las diferencias entre el Round, ceil y el floor

        Scanner sc = new Scanner(System.in);
        double num = 12.57;
        System.out.println(num);
        num = Math.round(num);
        double num2 = 13.57;
        num2 = Math.ceil(num2);
        System.out.println(num2);
        double num3 = 14.57;
        num3 = Math.ceil(num3);
        System.out.println(num3);
    }
}
