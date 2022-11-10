
import java.util.Scanner;

public class Ejercicios_Condicionales6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 6
        // Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
        // una altura h. Aplica la fórmula t =
        // √2h
        // g
        // siendo g = 9.81m/s
        final double g = 9.81;
        System.out.println("Introduzca la altura");
        double h = sc.nextInt();
        double aux = (2 * h) / g;
        double t = Math.pow(aux, 0.5);
        System.out.println("El tiempo será: " + t);

    }
}
