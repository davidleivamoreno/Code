package Ejerciciosbásicos;

import java.util.Scanner;

public class Ejercicio1_relación {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 1

        // Realiza un programa que dado un número decimal escriba su valor absoluto.
        System.out.println("Introduzca su número");
        int entrada;
        entrada = sc.nextInt();
        boolean mayorque0 = (entrada >= 0);
        entrada = (mayorque0) ? entrada : entrada * -1;
        System.out.println("Su valor absoluto es:" + entrada);
        sc.close();

    }
}
