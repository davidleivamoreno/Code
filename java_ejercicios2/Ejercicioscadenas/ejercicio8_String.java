import java.util.Scanner;

public class ejercicio8_String {
    public static void main(String[] args) {

        // Ejercicio 8
        // Realiza el ejercicio 7 pero utilizando los códigos ASCII de los caracteres.
        Scanner sc = new Scanner(System.in);
        char caracter = sc.nextLine().charAt(0);
        int numero = caracter;
        System.out.println(numero);
        boolean esletra = (numero >= 65 && numero <= 90 || numero >= 97 && numero <= 122);
        System.out.println((esletra) ? "si,es una letra" : "no, es otro tipo de caracter");
        sc.close();

    }
}
