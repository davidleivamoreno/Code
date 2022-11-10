package EjerciciosDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio1_Date {
    public static void main(String[] args) {
        // Ejercicio 1

        // Realiza un programa que pregunte la fecha y hora del examen de Programación.
        // Dada dicha fecha:
        // Muéstrala en el formato: "El examen será el LUNES, 15 de MAYO del 23"
        // Indica cuantos horas quedan hasta ese día
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia del examen:");
        int dia = sc.nextInt();
        System.out.println("Introduce mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduce año: ");
        int ano = sc.nextInt();
        System.out.println("Introduzca la hora del examen");
        int hora = sc.nextInt();
        System.out.println("Introduzca los minutos cuando empieza el examen: ");
        int minutos = sc.nextInt();
        System.out.println("Introduzca los segundos en el que empieza el examen: ");
        int segundos = sc.nextInt();
        DateTimeFormatter formatomio = DateTimeFormatter.ofPattern("EEEE 'de' MMMM 'del' yy ");
        LocalDateTime fechaExamen = LocalDateTime.of(ano, mes, dia, hora, minutos, segundos);
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("El examen será el " + fechaExamen.format(formatomio));
        System.out.println("Te quedan " + ChronoUnit.HOURS.between(fechaExamen, ahora) + " horas");
        sc.close();

    }
}
