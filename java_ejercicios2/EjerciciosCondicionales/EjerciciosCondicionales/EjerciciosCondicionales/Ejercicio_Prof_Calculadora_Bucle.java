package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio_Prof_Calculadora_Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int num1 = 0;
        int num2 = 0;
        double resultado = 0;
        boolean myd = (num1 <= 0 || num2 <= 0);
        String opcion = "";
        do {
            System.out.println("Introduzca el primer número");
            num1 = sc.nextInt();
            System.out.println("Introduzca el segundo número");
            num2 = sc.nextInt();
            System.out
                    .println(
                            "Elija que calculo quiere hacer: \n [suma] \n [resta] \n [multiplicación] \n [división] \n[salir]");
            sc.nextLine();
            opcion = sc.nextLine();
            switch (opcion.toLowerCase().trim()) {
                case "suma":
                    resultado = num1 + num2;
                    System.out.println(resultado);
                    break;
                case "resta":
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;
                case "multiplicacion":
                    if (myd) {
                        System.out.println("La solución es cero");
                        resultado = 0;
                    } else {
                        resultado = num1 * num2;
                    }

                    System.out.println(resultado);

                    break;
                case "division":
                    if (myd) {
                        System.out.println("No hay solución");
                    } else {
                        resultado = num1 / num2;

                    }
                    System.out.println(resultado);

                    break;
                case "salir":
                    System.out.println("Saliendo");
                    salir = true;
                    break;
                default:
                    System.out.println("No es una opción valida");

            }
        } while (salir = false);

    }
}
