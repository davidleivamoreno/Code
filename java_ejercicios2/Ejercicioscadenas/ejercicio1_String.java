import java.util.Scanner;

public class ejercicio1_String {
    public static void main(String[] args) {
        // Ejercicio 1
        // Lee de teclado un texto y devuelve por pantalla la cantidad de caracteres
        // tiene dicho texto.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto");
        String cadena = " ";
        int longitud;
        cadena = sc.nextLine();
        longitud = cadena.length();
        System.out.println("La longitud es " + longitud);
        sc.close();

    }
}
