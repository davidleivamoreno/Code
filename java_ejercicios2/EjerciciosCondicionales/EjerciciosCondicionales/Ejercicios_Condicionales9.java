
import java.util.Scanner;

public class Ejercicios_Condicionales9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 9
        // Realiza un programa que resuelva una ecuación de segundo grado (del tipo
        // ax2 + bx + c = 0).
        double x1, x2;
        System.out.println("Introduzca a :");
        double a = sc.nextDouble();
        System.out.println("Introduzca b: ");
        double b = sc.nextDouble();
        System.out.println("Introduzca c: ");
        double c = sc.nextDouble();

        double parametro = Math.pow(b, 2) - 4 * a * c;
        double parametro2 = 2 * a;
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado");
        } else if (parametro < 0) {
            System.out.println("No existe solución real");
        } else {

            x1 = (-1 * b + Math.pow(parametro, 0.5)) / parametro2;
            x2 = (-1 * b - Math.pow(parametro, 0.5)) / parametro2;
            System.out.println("x1: " + x1 + "\nx2:" + x2);
        }
    }
}
