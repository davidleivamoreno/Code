import java.util.Scanner;

public class Ejercicio_Relacion_Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 3
        // Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
        int num1 = 5;
        int resultado = 0;
        int contador = 0;
        do {
            contador++;
            resultado = num1 * contador;
            System.out.println(num1 * contador);
        } while (resultado < 100);
    }
}
