package EjerciciosDate;

import java.util.Scanner;

public class Ejercicio2_Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 2

        // Vamos a simular un 1 contra 1 en baloncesto para ello necesitamos saber:

        // Nombre del jugador atacante y del jugador defensor
        // El % de acierto de 2 y de 3 del jugador atacante.
        // El numero de veces que el jugador defensor logra hacer que su atacante falle
        // (número de 0 a 10)
        // Y si el jugador atacante decide tirar de 2 o de 3.

        // Para saber si mete canasta utilizaremos esta fórmula:

        // (numeroAlAzarAtaque * %AciertoTipoSeleccionado) > (numeroAlAzarDefensa *
        // EficaciaDefensa * 10)

        // Debes mostrar al finalizar el siguiente mensaje según

        // Ejemplo de salida:

        // El jugador "XXXXXXX" ha encestado de 2 sobre el jugador "YYYYYY" (xxx > yyyy)

        // El jugardor "XXXXXX" NO ha encestado contra el jugador "YYYYY" (xxxx< yyyyy)

        System.out.println("Introduzca el nombre del atacante");
        String atacante = sc.nextLine();
        sc.nextLine();
        System.out.println("Introduzca el nombre del defensor");
        String defensor = sc.nextLine();
        sc.nextLine();
        System.out.println("De que vas a tirar?[2/3]");
        int opcion = sc.nextInt();
        System.out.println("Que porcentaje tienes");
        int porcentaje = sc.nextInt();
        boolean porc2 = (opcion == 2);
        System.out.println("Cuantas veces ha fallado el defensor " + defensor + " ?");
        int fallos = sc.nextInt();
        Double rdm1 = Math.random();
        Double rdm2 = Math.random();

        boolean esCanasta = (rdm1 * porcentaje) > (rdm2 * fallos * 10);
        System.out.println((esCanasta && porc2)
                ? "El jugador " + atacante + " ha encestado de " + opcion + "sobre el jugador " + defensor + "("
                        + Math.round(rdm1) + ">" + Math.round(rdm2) + ")"
                : "EL jugador" + atacante + "NO ha encestado contra el jugador" + defensor + "(" + Math.round(rdm1)
                        + ">" + Math.round(rdm2) + ")");
    }
}
