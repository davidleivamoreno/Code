package Ejerciciosbásicos;

import java.util.Scanner;

public class java_pregunta_alturaynombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        float altura;
        int edad;
        System.out.println("Cuál es tu nombre?");
        nombre = sc.nextLine();
        System.out.println("Cual es tu edad?");
        edad = sc.nextInt();
        double edad_Segundos = edad * 31.536000;
        System.out.println("Cual es tu altura?");
        altura = sc.nextFloat();
        float altura_Alturacm = altura * 100;
        System.out
                .println("Hola " + nombre + " tu edad es de : " + edad + " años y tu altura es: " + altura + " metros");
        System.out.println("Sabias que " + edad + " años son " + edad_Segundos + " segundos?");
        System.out.println("Y mides: \n" + altura_Alturacm + " centímetros");
        sc.close();
    }
}
