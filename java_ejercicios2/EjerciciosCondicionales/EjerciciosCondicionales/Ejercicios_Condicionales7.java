
import java.util.Scanner;

public class Ejercicios_Condicionales7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 7
        // Realiza un programa que calcule la media de tres notas.
        System.out.println("Introduzca nota1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca nota2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Introduzca nota3 :");
        double nota3 = sc.nextDouble();
        double nota_media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Tu nota media es:" + nota_media);
    }
}
