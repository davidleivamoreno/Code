
import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca altura");
        int altura = sc.nextInt();
        System.out.println("Introduzca anchura");
        int ancho = sc.nextInt();
        // for (int i = 0; i < altura; i++) {
        // System.out.println("");
        // for (int j = 0; j < ancho; j++) {
        // System.out.print("*");
        // }
        // }
        // Medio rectangulo
        // for (int i = 0; i < altura; i++) {
        // System.out.println("");
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print("*");
        // }
        // }

        // Triangulo
        for (int m = 0; m < altura; m++) {
            System.out.println("");
            for (int k = altura - 1; k > m; k--) {
                System.out.print("-");
            }
        }
        for (int m = 0; m < altura; m++) {
            System.out.println("");
            for (int k = m + 1; k > 0; k--) {
                System.out.print("*");
            }
        }

        // for (int i = 0; i < altura; i++) {
        // System.out.println("");
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print("*");
        // }
        // }
    }
}
