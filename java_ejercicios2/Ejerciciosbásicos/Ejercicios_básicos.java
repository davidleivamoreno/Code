package Ejerciciosbásicos;

import java.util.Scanner;

public class Ejercicios_básicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int opcion;
            double num1, num2, resultado;
            System.out.println("Elige una opción");
            System.out.println("[1]Suma;[2]Resta;[3]Multiplicación;[4]División,[5]Resto");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Suma: ");
                    System.out.println("num1: ");
                    num1 = sc.nextDouble();
                    System.out.println("num2: ");
                    num2 = sc.nextDouble();
                    resultado = suma(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.println("num1: ");
                    num1 = sc.nextDouble();
                    System.out.println("num2: ");
                    num2 = sc.nextDouble();
                    resultado = resta(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Multiplicación: ");
                    System.out.println("num1: ");
                    num1 = sc.nextDouble();
                    System.out.println("num2: ");
                    num2 = sc.nextDouble();
                    resultado = Multiplicación(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("División ");
                    System.out.println("num1: ");
                    num1 = sc.nextDouble();
                    System.out.println("num2: ");
                    num2 = sc.nextDouble();
                    resultado = División(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Resto ");
                    System.out.println("num1: ");
                    num1 = sc.nextDouble();
                    System.out.println("num2: ");
                    num2 = sc.nextDouble();
                    resultado = Resto(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Lo sentimos no disponemos de esa función en esta calculadora");

            }

        } catch (Exception e) {
            System.out.println("Introduzca una opcion válida");
        }
        sc.close();

    }

    static double suma(double num1, double num2) {

        double resultado = num1 + num2;
        return resultado;
    }

    static double resta(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    static double Multiplicación(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    static double División(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }

    static double Resto(double num1, double num2) {
        double resultado = num1 % num2;
        return resultado;
    }

}
