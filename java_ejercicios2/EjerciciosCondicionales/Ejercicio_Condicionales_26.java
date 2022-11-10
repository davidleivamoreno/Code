import java.util.Scanner;

public class Ejercicio_Condicionales_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 26
        // Realiza un programa que calcule el precio de unas entradas de cine en función
        // del número de personas y del día de la semana. El precio base de una entrada
        // son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros.
        // Los
        // jueves son el día de la pareja, por lo que la entrada para dos cuesta 11
        // euros.
        // Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
        // grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
        // que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
        // 1 individual que son 41 euros (33 + 8).

        // Ejemplo 1:
        // Venta de entradas CineCampa
        // Número de entradas: 4

        // Sentencia condicional (if y switch) 50
        // Día de la semana: martes
        // ¿Tiene tarjeta CineCampa? (s/n): n
        // Aquí tiene sus entradas. Gracias por su compra.
        // Entradas individuales 4
        // Precio por entrada individual 8.00 €
        // Total 32.00 €
        // Descuento 0.00 €
        // A pagar 32.00 €
        // Ejemplo 2:
        // Venta de entradas CineCampa
        // Número de entradas: 4
        // Día de la semana: viernes
        // ¿Tiene tarjeta CineCampa? (s/n): s
        // Aquí tiene sus entradas. Gracias por su compra.
        // Entradas individuales 4
        // Precio por entrada individual 8.00 €
        // Total 32.00 €
        // Descuento 3.20 €
        // A pagar 28.80 €
        // Ejemplo 3:
        // Venta de entradas CineCampa
        // Número de entradas: 4
        // Día de la semana: jueves
        // ¿Tiene tarjeta CineCampa? (s/n): n
        // Aquí tiene sus entradas. Gracias por su compra.
        // Entradas de parejas 2
        // Precio por entrada de pareja 11.00 €
        // Total 22.00 €
        // Descuento 0.00 €
        // A pagar 22.00 €
        // Ejemplo 4:
        // Venta de entradas CineCampa
        // Número de entradas: 5
        // Día de la semana: jueves
        // ¿Tiene tarjeta CineCampa? (s/n): s
        // Aquí tiene sus entradas. Gracias por su compra.
        // Entradas parejas 2

        // Sentencia condicional (if y switch) 51
        // Precio por entrada de pareja 11.00 €
        // Entradas individuales 1
        // Precio por entrada individual 8.00 €
        // Total 30.00 €
        // Descuento 3.00 €
        // A pagar 27.00 €
        // Ejemplo 5:
        // Venta de entradas CineCampa
        // Número de entradas: 5
        // Día de la semana: miercoles
        // ¿Tiene tarjeta CineCampa? (s/n): s
        // Aquí tiene sus entradas. Gracias por su compra.
        // Entradas individuales 5
        // Precio por entrada individual 5.00 €
        // Total 25.00 €
        // Descuento 2.50 €
        // A pagar 22.50 €
        final double PRECIO_BASE = 8.00;
        final double PRECIO_BASE_MIERCOLES = 5.00;
        final double PRECIO_PAREJA_JUEVES = 5.5;
        final double PRECIO_INDIVIDUAL_JUEVES = PRECIO_BASE;
        final double TARJETA = 0.1;

        double precio;
        System.out.println(" Día de la semana: ");
        String entrada_dia = sc.nextLine();
        sc.nextLine();
        System.out.println("¿Tiene tarjeta CineCampa? (s/n): ");
        String CineCampa = sc.nextLine();
        boolean tieneTarjeta = false;
        if (CineCampa.equalsIgnoreCase("s")) {
            tieneTarjeta = true;
        }

        System.out.println("Número de entradas: ");
        int num_entrada = sc.nextInt();
        boolean num_par = false;
        boolean masqueUno = false;
        if (num_entrada % 2 == 0) {
            num_par = true;
        }
        if (num_entrada > 1) {
            masqueUno = true;
        }
        boolean esJueves;
        esJueves = false;
        double precio_pareja;

        switch (entrada_dia.toLowerCase().trim()) {
            case "lunes":
            case "martes":
            case "viernes":
                if (tieneTarjeta) {
                    precio = PRECIO_BASE;
                    precio = precio * num_entrada;
                } else {

                    precio = PRECIO_BASE * num_entrada;
                }

                break;
            case "miercoles":

                precio = PRECIO_BASE_MIERCOLES;
                precio = precio * num_entrada;

                break;
            case "jueves":
                esJueves = true;
                if (num_par) {
                    precio = PRECIO_PAREJA_JUEVES * num_entrada;
                } else if (!num_par && !masqueUno) {
                    precio = PRECIO_BASE;
                } else if (!num_par && masqueUno) {
                    precio = PRECIO_PAREJA_JUEVES * num_entrada % 2 + PRECIO_INDIVIDUAL_JUEVES;
                }
                break;
            // precio_pareja = PRECIO_PAREJA_JUEVES * num_entrada % 2;

            // }
            // if (tieneTarjeta) {
            // precio = precio - (precio * TARJETA);
            // }
            // System.out.println(" Aquí tiene sus entradas. Gracias por su compra.");
            // System.out.println("Precio por entrada de pareja 11€");

            // 10%
        }
    }
}