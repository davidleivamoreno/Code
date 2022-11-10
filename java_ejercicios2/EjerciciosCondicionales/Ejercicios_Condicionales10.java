import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicios_Condicionales10 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
        // que se imparten en el curso. Cada pregunta acertada sumará un punto. El
        // programa mostrará al final la calificación obtenida. Pásale el
        // minicuestionario a
        // tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
        // en las diferentes asignaturas del curso.
        double contador = 0;
        int acierto = 0;
        int fallos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio1:t,f");
        String p1 = sc.nextLine();
        sc.nextLine();
        if (p1.equalsIgnoreCase("t")) {
            contador = contador + 2;
            acierto = acierto + 1;
        } else {
            fallos = fallos + 1;
            contador = contador - 0.5;
        }
        System.out.println("Ejercicio2:t,f");
        String p2 = sc.nextLine();
        sc.nextLine();
        if (p2.equalsIgnoreCase("t")) {
            contador = contador + 2.5;
            acierto = acierto + 1;
        } else {
            contador = contador - 0.5;
            fallos = fallos + 1;
        }
        System.out.println("Ejercicio3:t,f");
        String p3 = sc.nextLine();
        sc.nextLine();
        if (p3.equalsIgnoreCase("t")) {
            contador = contador + 2;
            acierto = acierto + 1;
        } else {
            fallos = fallos + 1;
            contador = contador - 0.5;
        }
        System.out.println("Ejercicio4:t,f");
        String p4 = sc.nextLine();
        sc.nextLine();
        if (p4.equalsIgnoreCase("t")) {
            contador = contador + 2.1;
            acierto = acierto + 1;
        } else {
            fallos = fallos + 1;
            contador = contador - 0.5;
        }
        System.out.println("Ejercicio5:t,f");
        String p5 = sc.nextLine();
        sc.nextLine();
        if (p5.equalsIgnoreCase("t")) {
            contador = contador + 2.4;
            acierto = acierto + 1;
        } else {
            fallos = fallos + 1;
            contador = contador - 0.5;
        }
        System.out.println("Has sacado un " + contador);
        if (contador >= 0 && contador < 5) {
            System.out.println("insuficiente");
        } else if (contador == 5) {
            System.out.println("suficiente");
        } else if (contador == 6) {
            System.out.println("bien");
        } else if (contador > 6 && contador < 9) {
            System.out.println("notable");
        } else if (contador >= 9 && contador <= 10) {
            System.out.println("Sobresaliente");
        } else if (contador < 0) {
            contador = 0;
            System.out.println("Tienes menos de un cero");
        } else {
            contador = 11;
            System.out.println("Tienes matricula de honor.ENHORABUENA AMIGO/A!!");
        }
    }
}
