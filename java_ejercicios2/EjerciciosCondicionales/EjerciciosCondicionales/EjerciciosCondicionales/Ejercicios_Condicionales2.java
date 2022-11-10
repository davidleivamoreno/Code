package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 2
        // Realiza un programa que pida una hora por teclado y que muestre luego buenos
        // días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
        // de
        // 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
        // horas, los minutos no se deben introducir por teclado.
        System.out.println("Introduzca la hora actual");
        int entrada = sc.nextInt();
        if (entrada >= 6 && entrada <= 12) {
            System.out.println("Buenos dias");
        } else if (entrada >= 13 && entrada <= 20) {
            System.out.println("Buenas tardes");
        } else if (entrada >= 21 && entrada <= 24 || entrada >= 1 && entrada <= 5) {
            System.out.println("Buenas noches");
        }
    }

}
