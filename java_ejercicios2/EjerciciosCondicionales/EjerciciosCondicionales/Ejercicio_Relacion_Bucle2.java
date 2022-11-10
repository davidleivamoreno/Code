import java.util.Scanner;

public class Ejercicio_Relacion_Bucle2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 7
        // Realiza el control de acceso a una caja fuerte. La combinación será un
        // número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
        // acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
        // y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
        // Tendremos cuatro oportunidades para abrir la caja fuerte.
        final int CODIGO = 1234;
        int entrada = 0;
        int contador = 0;
        do {
            System.out.println("Introduzca la clave:");
            entrada = sc.nextInt();
            contador = contador++;
        } while (entrada != CODIGO && contador < 4);
        if (contador == 4) {
            System.out.println("Has superado el numero de intentos ,no es la contraseña");
        } else if (CODIGO == entrada) {
            System.out.println("Esa era la contraseña");
        }
    }
}
