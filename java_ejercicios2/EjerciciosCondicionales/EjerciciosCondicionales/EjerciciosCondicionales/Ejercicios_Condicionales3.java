package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 3

        // Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
        // diente nombre del día de la semana.
        int numero = (int) ((Math.random() * 7) + 1);
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

    }
}
