package Ejerciciosbásicos;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 8
        // Realiza un programa que resuelva la pregunta de si el próximo año vas a ir de
        // vacaciones y donde será: Si tienes dinero entonces puedes ir de vacaciones,
        // la otra opción para poder ir de vacaciones es tener reserva y tener pasaporte
        // en regla.
        // Para saber donde irás de vacaciones es sencillo: Puedes ir a la playa o la
        // montaña y siempre iréis a la playa a no ser que tus 3 hijos quieran ir a la
        // montaña.
        boolean tengo_Dinero;
        boolean tienes_Reserva;
        boolean tienes_Pasporte;
        boolean irPlaya;
        boolean irMontaña;
        boolean hijo1;
        boolean hijo2;
        boolean hijo3;
        int entrada;
        System.out.println("Tienes dinero? [1]Si;[2]No");
        entrada = sc.nextInt();
        tengo_Dinero = (entrada == 1);
        System.out.println("Tienes reserva? [1]Si;[2]No");
        entrada = sc.nextInt();
        tienes_Reserva = (entrada == 1);
        System.out.println("Quieres ir a la playa?[1]Si;[2]No ");
        entrada = sc.nextInt();
        System.out.println("Si quieres ir a la playa necesitas preguntarle primero a tu familia");
        System.out.println("Quiere ir hijo1? [1]Si;[2]No ");
        entrada = sc.nextInt();
        sc.nextLine();
        hijo1 = (entrada == 1);
        System.out.println("Quiere ir hijo2? [1]Si;[2]No ");
        entrada = sc.nextInt();
        hijo2 = (entrada == 1);
        sc.nextLine();
        System.out.println("Quiere ir hijo3? [1]Si;[2]No ");
        entrada = sc.nextInt();
        sc.nextLine();
        hijo3 = (entrada == 1);
        irPlaya = (hijo1 == true && hijo2 == true && hijo3 == true);
        irMontaña = !irPlaya;
        System.out.println("Tienes pasaporte? [1]Si;[2]No ");
        entrada = sc.nextInt();
        tienes_Pasporte = (entrada == 1);
        System.out.println("Tienes dinero: " + tengo_Dinero);
        System.out.println("Tengo pasaporte: " + tienes_Pasporte);
        System.out.println("Tienes reserva? : " + tienes_Reserva);
        System.out.println("Vamos a la playa? : " + irPlaya);
        System.out.println("Vamos al monte?: " + irMontaña);
        sc.close();

    }
}
