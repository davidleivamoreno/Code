package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio_Prof_Bucle_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int resultado = 0;
        int media = 0;
        // for (int i = 1; i <= 10; i++) {

        // System.out.println("Dime un numero");
        // n = sc.nextInt();
        // resultado += n;
        // media = resultado / i;
        // }
        // System.out.println("La media es:" + media);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t " + i + "x" + j + "=" + j * i + "\t ");
            }
        }
    }
}
