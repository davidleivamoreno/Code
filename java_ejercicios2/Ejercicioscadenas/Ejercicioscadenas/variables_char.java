package Ejercicioscadenas;

import java.util.Scanner;

public class variables_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = 's';
        int resultado;
        System.out.println("Indique un caracter");
        char opcion = sc.next().charAt(0);
        System.out.println("Dame un número");
        int num1 = sc.nextInt();
        System.out.println("Dame otro");
        int num2 = sc.nextInt();

        // if ((int) s == opcion) {
        // System.out.println(s);
        // } else {
        // resultado = num1 + num2;
        // System.out.println(resultado);

        //
        resultado = num1 + num2;
        String cadenares = resultado + "";
        String cadena = " " + (char) num1 + "-" + (char) num2;
        System.out.println((opcion == 's') ? "cadena" + cadena : cadenares);
        // float preciodescuento=(preciototal >100)?
        // preciodescuento=preciototal-(preciototal*descuento):preciodescuento=preciototal;
    }

}
