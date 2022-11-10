
import java.util.Scanner;

public class Ejercicios_Condicionales8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 8
        // Amplía el programa anterior para que diga la nota del boletín (insuficiente,
        // suficiente, bien, notable o sobresaliente).
        System.out.println("Introduzca nota1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca nota2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Introduzca nota3 :");
        double nota3 = sc.nextDouble();
        double nota_media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Tu nota media es:" + nota_media);
        if (nota_media >= 0 && nota_media < 5) {
            System.out.println("insuficiente");
        } else if (nota_media == 5) {
            System.out.println("suficiente");
        } else if (nota_media == 6) {
            System.out.println("bien");
        } else if (nota_media > 6 && nota_media < 9) {
            System.out.println("notable");
        } else if (nota_media >= 9 && nota_media <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Tu nota no existe");
        }

    }
}
