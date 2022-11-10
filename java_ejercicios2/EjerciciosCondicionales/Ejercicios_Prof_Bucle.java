import java.util.Scanner;

public class Ejercicios_Prof_Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumno = 0;
        int contadormayor = 0;
        int contador = 0;
        double suma = 0;
        double media = 0;

        // lectura inicial

        while (alumno >= 0) {

            System.out.println("Introduzca un alumno: ");
            alumno = sc.nextInt();
            if (alumno > -1) {
                contador = contador + 1;

                suma += alumno;

                media = suma / contador;

                if (alumno >= 18) {
                    contadormayor = contadormayor + 1;
                }

                // actualiszacion de condicion
                // lectura de edad de nuevo
            }
        }

        System.out.println("La suma de las edades es:" + suma);
        System.out.println("El numero de alumnos es:" + contador);
        System.out.println("La media de alumnos tiene de edad:" + media + " años");
        System.out.println("El numero de alumnos de mas de 18 años es:" + contadormayor);

    }
}
