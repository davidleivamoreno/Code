import java.util.Scanner;

public class Ejercicio_Relacion_Bucle5 {
    // Ejercicio 12
    // Escribe un programa que muestre los n primeros términos de la serie de
    // Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
    // el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
    // términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
    // debe
    // introducir por teclado.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int suma = 0;
        int contador = 0;
        System.out.println("Introduzca un numero");
        int num = sc.nextInt();
        // for (int i = 0; i <= num; i++) {
        // System.out.print(suma + ",");
        // suma = num1 + num2;
        // num1 = num2;
        // num2 = suma;
        // }
        while (num > 0 && contador < num) {
            System.out.print(suma + ",");
            contador++;
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }

    }
}
