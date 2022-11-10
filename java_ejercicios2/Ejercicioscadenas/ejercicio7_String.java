import java.util.Scanner;

public class ejercicio7_String {
    public static void main(String[] args) {

        // Ejercicio 7
        // Lee de teclado un carácter e indica si es un dígito, si es un espacio en
        // blanco y si es un carácter en mayúscula. Realiza este ejercicio utilizando la
        // clase Character
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un caracter o un dígito");
        char entrada = sc.nextLine().charAt(0);
        boolean EsDigito = (Character.isDigit(entrada));
        boolean Esespacio = (Character.isSpaceChar(entrada));
        boolean EsMayuscula = !(Character.isLowerCase(entrada));
        System.out.println((EsDigito) ? "Es dígito" : "No es digito");
        System.out.println((Esespacio) ? "Es un espacio" : "No es un espacio");
        System.out.println((EsMayuscula) ? "Es mayúscula" : "No mayúscula");
        sc.close();

    }
}
