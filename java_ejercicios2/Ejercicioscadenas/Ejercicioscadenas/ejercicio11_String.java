package Ejercicioscadenas;

import java.util.Scanner;

public class ejercicio11_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 11

        // Realiza un programa que lea un dígito del 0 al 9 y muestre por pantalla el
        // carácter que ocupa dicha posición en una cadena interna.

        // Debes comprobar que se ha introducido un dígito, que no estamos buscando en
        // una posición más grande que la longitud de la cadena y si estoy mostrando un
        // espacio entonces mostrar la cadena

        System.out.println("Introduzca un dígito");
        char entrada = sc.nextLine().charAt(0);
        boolean esDigito = (Character.isDigit(entrada));
        int numero = (esDigito) ? Character.getNumericValue(entrada) : -1;
        boolean entre0y9 = (numero >= 0 && numero < 10);
        numero = (entre0y9) ? numero : -1;
        System.out.println(numero);
        sc.nextLine();
        System.out.println("Introduzca una cadena");
        String cadena = sc.nextLine();
        boolean MayorCadena = (numero >= cadena.length());
        numero = (!(MayorCadena)) ? numero : -1;
        System.out.println(numero);

        char cadenaachar = cadena.charAt(numero);
        boolean esEspacio = Character.isSpaceChar(cadenaachar);
        System.out.println((!(numero == -1) && !(esEspacio)) ? "La letra era: " + cadena.charAt(numero) : "Espacio");
        sc.close();
    }
}
