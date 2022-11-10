import java.util.Scanner;

public class Ejercicio_Relación_Prof4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Problema de Viaje

        // Queremos viajar de Málaga a Madrid y vamos a realizar una aplicación que nos
        // calcule el precio por el que nos saldrá el viaje.

        // Tenemos varias opciones, coche, avión y tren.

        // Los que viajamos podemos ser 2, 3 o 4 personas
        // Si viajamos en coche debemos saber que el precio de la gasolina es de 1.75€
        // el litro, que madrid está a unos 550 kms y que nuestro coche gasta de media 8
        // litros a los 100 km.
        // Si viajamos en avión el precio del billete es de 95€ pero hay un suplemento
        // de 20€ si llevamos equipaje (o todos llevan o ninguno)
        // Si viajamos en tren el billete normal son 80€ pero si somos 4 personas
        // podemos sacar tarifa reducida que nos quita un 25% del total y si somos 3 nos
        // quita un 10%.
        final double GASOLINA = 1.75;
        final int bAvion = 95;
        final int bTren = 80;
        final int equipaje = 20;
        double total = 0;
        System.out.println("Elige opcion de transporte [coche, avión , tren]");
        String opciontr = sc.nextLine();
        boolean transporteValido = (opciontr.trim().equalsIgnoreCase("coche")
                || opciontr.trim().equalsIgnoreCase("avion") || opciontr.trim().equalsIgnoreCase("tren"));
        sc.nextLine();
        System.out.println("Cuantos sois [2,3,4]");
        int persona;
        persona = sc.nextInt();
        sc.nextLine();
        boolean personaValida = (persona == 2 || persona == 3 || persona == 4);
        persona = (personaValida) ? persona : 0;
        double kilómetros = 0;

        switch (opciontr) {
            case "coche":
                total = (kilómetros * 8 / 100) * GASOLINA;
                System.out.println("Cuantos kilómetros ha realizado: ");
                kilómetros = sc.nextDouble();
                break;
            case "avion":
                System.out.println("Lleva equipaje?");
                opciontr = sc.nextLine();
                if (opciontr.equalsIgnoreCase("si")) {
                    total = equipaje + bAvion;
                } else {
                    total = bAvion;
                }
                break;
            case "tren":
                switch (persona) {
                    case 2:
                        total = bTren;
                        break;
                    case 3:
                        total = bTren - (bTren * 0.1);
                        break;
                    case 4:
                        total = bTren - (bTren * 0.25);
                        break;
                    default:
                        System.out.println("No sois el numero de personas que deben entrar");
                }
                break;

        }
        System.out.println((!(total == 0) || (!(persona == 0) && (personaValida)))
                ? "El total por viajar en : " + opciontr + " con " + persona + " personas sería " + total + " euros"
                : "No hay viaje");
    }
}
