package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio7_pizarra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float MANZANA = 2.35f;
        final float PERAS = 1.77f;
        float Manzanav;
        float Perasv;
        float luz;
        float gasolina = 0.60f;
        float TotalI;
        float TotalG;
        float Beneficio;
        System.out.println("Cuántos kilos de manzanas has vendido?");
        Manzanav = sc.nextFloat();
        System.out.println("Cuántos kilos de peras has vendido?");
        Perasv = sc.nextFloat();
        System.out.println("Cuántos euros de luz ha pagado?");
        luz = sc.nextFloat();
        TotalI = (MANZANA * Manzanav) + (PERAS * Perasv);
        TotalG = (gasolina * (Manzanav + Perasv) + luz);
        Beneficio = TotalI - TotalG;

        System.out.println("El total de Ingresos ha sido: " + TotalG + " euros");
        System.out.println("El total de gastos ha sido: " + TotalI + " euros");
        System.out.println("Los beneficios son: " + Beneficio + " euros");
        sc.close();
    }
}
