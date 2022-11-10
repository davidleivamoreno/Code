package EjerciciosDate;

import java.util.Scanner;

public class Ejercicio3_Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Utilizando el texto siguiente realiza lo siguiente:

        // Muchos años después,
        // frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de
        // recordar aquella tarde remota en que su padre lo llevó a conocer el
        // hielo. (Cien años de soledad. G. García Márquez).

        // : "Libro: Cien años de soledad. G. García Márquez"
        // Busca un número random entre 0 y el número total de caracters y muestralo por
        // pantalla. El caracter en la posicion X es:
        // Trocea el texto en palabras y devuelve la palabra que esté en la posición que
        // indique un número aleatorio entre 0 y el número de palabras. -> La palabra en
        // la posición x es: XXXX
        // Preguntar :¿Como se llamaba el coronel? y si responde su nombre o su apellido
        // o ambos, sin tener en cuenta las mayúsculas/minúsculas) indicar que se ha
        // acertado la pregunta, en caso contrario, decir que no es esa la persona
        String cadena = "Muchos años después," +
                " frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de" +
                " recordar aquella tarde remota en que su padre lo llevó a conocer el" +
                " hielo. (Cien años de soledad. G. García Márquez).";

        int longitud = cadena.length();
        int numaleatorio = (int) (Math.random() * longitud);
        System.out.println("El caracter en la posición: " + numaleatorio + "es: " + cadena.charAt(numaleatorio));
        int posicion_nombre_coma = cadena.indexOf(",");
        int posicion_nombre_coma_coma = cadena.indexOf(",", posicion_nombre_coma + 1);
        int posicion_nombre_term = cadena.indexOf("había");
        String nombre_coronel = cadena.substring(posicion_nombre_coma_coma, posicion_nombre_term);
        nombre_coronel = nombre_coronel.replaceAll(", el coronel", " ");
        nombre_coronel = nombre_coronel.trim();
        System.out.println(nombre_coronel);

        int posicion_apellido = nombre_coronel.indexOf(" ");
        int nombre_posicion = nombre_coronel.indexOf(0, posicion_apellido);

        String apellido = nombre_coronel.substring(posicion_apellido + 1);
        String nombre = nombre_coronel.substring(0, posicion_apellido);
        System.out.println(apellido);
        System.out.println(nombre);

        System.out.println("Como se llamaba el coronel");
        String entrada = sc.nextLine();
        if (entrada.equalsIgnoreCase(nombre) || entrada.equalsIgnoreCase(apellido)) {
            System.out.println("Has acertado");
        } else {
            System.out.println("No has acertado,no era esa la persona");
        }

    }
}
