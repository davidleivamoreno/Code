package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio8_segundarelacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int salarioh = 12;
        int salariodia;
        int salario_semanal;
        salariodia = 12 * 24;
        salario_semanal = salariodia * 7;
        System.out.println("Si usted gana: " + salarioh + " euros por hora usted ganará: " + salario_semanal
                + " euros a la semana.");
        sc.close();
    }
}
