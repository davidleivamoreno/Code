import java.util.Scanner;

public class Ejercicio_Relacion_Bucle3 {

    // Realiza un programa que nos diga cuántos dígitos tiene un número introducido
    // por teclado. Este ejercicio es equivalente a otro realizado anteriormente,
    // con
    // la salvedad de que el anterior estaba limitado a números de 5 dígitos como
    // máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
    // esta manera, la única limitación en el número de dígitos la establece el tipo
    // de
    // dato que se utilice (int o long).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = sc.nextInt();
        int aux;
        aux = num;
        int contador = 0;
        while (num > 0) {
            num = num / 10;
            contador++;
        }
        System.out.println("El numero " + aux + " tiene " + contador + " digitos");

    }
}
