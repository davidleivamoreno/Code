import java.util.Scanner;

public class Ejercicio_ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final Double DESCUENTO = 0.2;// Esto puede ser double o float.
        final Double VALOR_TOPE = 2500.0;
        // Se necesita aplicar un 20% de descuento en la venta de un coche que valga más
        // de 2500€,pide al usuario el coste del coche y si este vale mas de 2500 aplica
        // el descuento .
        System.out.println("Introduzca el valor de su coche: ");
        double entrada = sc.nextDouble();
        // Se puede hacer con if ,pero si lo quieres hacer con ternaria seria asi:
        boolean entradaMayor = (entrada > VALOR_TOPE);
        entrada = (entradaMayor) ? 2500 - (2500 * DESCUENTO) : entrada;
        System.out.println(entrada);

    }
}
