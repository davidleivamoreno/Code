import java.util.Scanner;

public class Ejercicio_Relacion_Bucle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 10
        // Escribe un programa que calcule la media de un conjunto de números positivos
        // introducidos por teclado. A priori, el programa no sabe cuántos números se
        // introducirán. El usuario indicará que ha terminado de introducir los datos
        // cuando meta un número negativo.
        int entrada = 0;
        int suma = 0;
        double media = 0;
        int contador = 0;
        do {
            System.out.println("Introduzca un numero");
            entrada = sc.nextInt();
            suma += entrada;
            contador++;
        } while (entrada >= 0);
        media = suma / contador;
        System.out.println("La media es:" + media);
    }
}
