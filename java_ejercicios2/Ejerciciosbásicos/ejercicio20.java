package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        // Se quiere realizar un programa que calcule la nota media de un alumno según
        // la nota de cada uno de los trimestres.Además indicará si tienes derecho a
        // beca o no según esta premisa: La nota media es mayor o igual a 8 y su renta
        // es menor a 20.000 o su nota es mayor o igual a 5 y su renta es menor a 4000€
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, notamedia;
        float renta;
        boolean tienesBeca;
        System.out.println("Introduzca nota1");
        nota1 = sc.nextDouble();
        System.out.println("Introduzca nota2");
        nota2 = sc.nextDouble();
        System.out.println("Introduzca nota3");
        nota3 = sc.nextDouble();
        System.out.println("Cual es tu renta?");
        renta = sc.nextFloat();
        String tieneBeca = "Tiene beca";
        String noTieneBeca = "No tienes beca";
        notamedia = (nota1 + nota2 + nota3) / 3;
        System.out
                .println((notamedia >= 8 && renta < 20000 || notamedia >= 5 && renta < 4000) ? tieneBeca : noTieneBeca);
        sc.close();

    }
}
