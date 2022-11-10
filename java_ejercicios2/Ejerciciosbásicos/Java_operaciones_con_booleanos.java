package Ejerciciosbásicos;

import java.util.Scanner;

public class Java_operaciones_con_booleanos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean mayorEdad;
        boolean carnetConducir;
        String entrada;
        int entradaprof;
        int edad;

        // En comentario la versión del profe.
        final int EdadPermitida = 18;
        System.out.println("Que edad tiene?");
        edad = sc.nextInt();
        sc.nextLine();
        // boolean mayorEdadprof = (edad >= EdadPermitida);
        // System.out.println(mayorEdadprof);
        System.out.println("Tiene carnet de conducir?");
        entrada = sc.nextLine();
        // System.out.println("Tiene carnet de conducir?[1]Si tiene;[2]No tiene");
        // entradaprof = sc.nextInt();
        // boolean carnetConducirprof = (entradaprof == 1);
        // System.out.println(carnetConducirprof);

        if (edad >= EdadPermitida && entrada.equalsIgnoreCase("si")) {
            carnetConducir = true;
            mayorEdad = true;
            System.out.println("Tiene carnet: " + carnetConducir);
            System.out.println("Mayor de edad: " + mayorEdad);
            System.out.println("Usted dispone  de carnet de conducir y es mayor de 18 años");

        } else if (edad >= EdadPermitida && entrada.equalsIgnoreCase("no")) {
            carnetConducir = false;
            mayorEdad = false;
            System.out.println("Usted es may or de 18 años ,pero no dispone de carnet para conducir");

        } else if (edad < EdadPermitida || entrada.equalsIgnoreCase("no")) {
            System.out.println("Usted es menor de edad y por lo tanto no puede conducir");
        }

        // boolean ValorTrue = true;
        // boolean ValorFalse = false;
        // boolean resultadoVandV0 = ValorTrue && ValorTrue;
        // boolean resultadoVandV1 = ValorTrue && ValorFalse;
        // boolean resultadoVandV2 = ValorFalse && ValorTrue;
        // boolean resultadoVandV3 = ValorFalse && ValorFalse;
        // boolean resultadoVandV4 = ValorTrue || ValorTrue;
        // boolean resultadoVandV5 = ValorTrue || ValorFalse;
        // boolean resultadoVandV6 = ValorFalse || ValorTrue;
        // boolean resultadoVandV7 = ValorFalse || ValorFalse;

        // System.out.println("v and v " + resultadoVandV0);
        // System.out.println("v and f " + resultadoVandV1);
        // System.out.println("f and v " + resultadoVandV2);
        // System.out.println("f and f "+ resultadoVandV3);
        // System.out.println("v or v " + resultadoVandV4);
        // System.out.println("v or f " + resultadoVandV5);
        // System.out.println("f or v " + resultadoVandV6);
        sc.close();

    }
}
