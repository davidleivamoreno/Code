package Ejerciciosbásicos;

import java.util.Scanner;

public class EjerciciodeEvaluacionbasica {
        // @autor David Leiva Moreno.
        public static void main(String[] args) {
                // Declaración de constantes
                final float SUELDO_BASE = 950.0f;
                final float SUELDO_ANO = 150.0f;
                final float BONHIJOMES = 10.0f;
                final float HORAS_EXTRAS = 21.4f;
                // DECLARACIÓN DE VARIABLES
                int num_meses, num_anos;
                int num_hijos;
                double nom_mensual, variable_aux, variable_aux2, horas, euroshora;
                String nombre;
                // Declaración de Scanner
                Scanner sc = new Scanner(System.in);
                // Inicio de programa:

                System.out.println("Introduzca su nombre por favor ...");
                nombre = sc.nextLine();

                System.out.println("Introduzca un nombre válido porfavor");

                System.out.println("Bienvenido a la empresa PCFacory S.A \n Señor/a " + (char) 34 + nombre
                                + (char) 34
                                + " vamos a realizar el calculo de sus ganacias: ");

                System.out.println("¿Cuantos meses llevas trabajando en la compañia?");
                num_meses = sc.nextInt();
                num_anos = num_meses / 12;
                nom_mensual = (num_anos > 0) ? SUELDO_BASE + num_anos * SUELDO_ANO : SUELDO_BASE;
                variable_aux = nom_mensual;
                System.out.println("¿Cuantos hijos/as  tiene?");
                num_hijos = sc.nextInt();
                // Parche al programa :Cuando tienes mas de 3 hijos se te suman 100€
                nom_mensual = (double) ((num_hijos >= 3) ? (num_hijos * BONHIJOMES + 100 + variable_aux)
                                : (num_hijos * BONHIJOMES + variable_aux));
                System.out.println("Cuantas horas extras ha realizado");
                horas = sc.nextDouble();
                variable_aux2 = nom_mensual;
                nom_mensual = (double) ((horas > 0) ? nom_mensual = (horas * HORAS_EXTRAS + variable_aux2)
                                : (nom_mensual = variable_aux2));
                euroshora = nom_mensual - variable_aux2;
                variable_aux2 = variable_aux2 - nom_mensual;
                nom_mensual = Math.round(nom_mensual - (nom_mensual * 0.05));
                final float PORC_FORMACION = (float) (nom_mensual * 0.05);

                System.out.println(
                                "El empleado/a" + (char) 34 + nombre + (char) 34
                                                + " recibirá en su nómina mensual " + (char) 34 + nom_mensual
                                                + " euros"
                                                + (char) 34);
                System.out.println("De los cuales: \n  - " + variable_aux +
                                " euros son del sueldo base + antigüedad+ bonificación por hijo \n  - "
                                + Math.round(euroshora)
                                + "  euros son de horas extras realizadas (" + (char) 34 + horas
                                + " horas realizadas"
                                + (char) 34 + ") \n  -" + (char) 34 + "-" + PORC_FORMACION + (char) 34
                                + " euros para formación");

                // Cierro el escaner.
                sc.close();
        }
}
