package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 1
        // Escribe un programa que pida por teclado un día de la semana y que diga qué
        // asignatura toca a primera hora ese día.
        String opcion;
        System.out.println("Introduzca un dia de la semana: ");
        opcion = sc.nextLine();
        switch (opcion) {
            case "Lunes":
                System.out.println(" programación");
                break;
            case "Martes":
                System.out.println("Base de Datos");
                break;
            case "Miércoles":
                System.out.println("F.O.L");
                break;
            case "Jueves":
                System.out.println("S.I");
                break;
            case "Viernes":
                System.out.println("Base de Datos");
                break;
            case "Sábado":
                System.out.println("Nada ,vete a casa");
                break;
            case "Domingo":
                System.out.println("Nada ,vete a casa");
                break;
            default:
                System.out.println("No existe esa opción escriba bien el dia o introduzca otro dia");

        }

    }

}
