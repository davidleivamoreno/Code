import java.util.Scanner;

public class Ejercicio_Relación_Prof1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 1 - Concierto
        // Escribir un programa que calcule el dinero recaudado en un concierto.

        // La aplicación solicitará el aforo máximo del local, el precio de las entradas
        // y el numero de entradas vendidas.
        // Hay que tener en cuenta que si el número de entradas vendidas no supera el
        // 20% del aforo del local, el concierto se cancela.
        // Si el número de entradas vendidas no supera el 50% del aforo, se realiza una
        // rebaja del 25% del precio de la entrada
        System.out.println("Cual es el aforo maximo del local");
        int maxaforo = sc.nextInt();
        System.out.println("Cuanto vale la entrada");
        double precioentrada = sc.nextDouble();
        System.out.println("Cuantas entradas fueron venididas");
        int num_entrada = sc.nextInt();
        if (num_entrada < (maxaforo * 0.2)) {
            System.out.println("Se cancela el concierto");
        } else if (num_entrada >= (maxaforo * 0.2) && num_entrada <= (maxaforo * 0.5)) {
            precioentrada = precioentrada - (precioentrada * 0.25);
            System.out.println("Se da el concierto y además el precio de la entrada es:" + precioentrada);
        } else if (num_entrada > (maxaforo * 0.5)) {
            System.out.println("Se da el concierto con el precio de la entrada a :" + precioentrada);
        }

    }
}
