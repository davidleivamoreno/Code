import java.util.Scanner;

public class ejercicio9_String {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 9

        // Dado el texto: “En la casa de Juan estaban Pedro, Luis y Mario, todos jugando
        // al Formite”

        // Realiza un programa que pregunte ¿Quién más estaba en casa de Juan? y el
        // texto que indique el usuario, debe de irse añadiendo antes de “y Mario”,
        // mostrando el resultado final de la frase.

        String cadena = "“En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”";
        System.out.println("Quien esta en casa de Juan");
        String cadenaBuscada = sc.nextLine();
        String textoEnMinúscula = cadena.toLowerCase();
        String cadenaBuscadaMin = cadenaBuscada.toLowerCase();
        boolean estaba = (textoEnMinúscula.indexOf(cadenaBuscadaMin) >= 0);
        System.out.println((estaba) ? cadenaBuscada + " si estaba" : cadenaBuscada + " no estaba");
        System.out.println("Quién habia mas");
        String cadenaBuscada2 = sc.nextLine();
        String cadenaBuscada2Min = cadenaBuscada2.toLowerCase();
        int posicion = textoEnMinúscula.indexOf(cadenaBuscadaMin);
        boolean estabatambién = (textoEnMinúscula.indexOf(cadenaBuscada2Min) >= 0);
        System.out.println(
                (estabatambién) ? cadenaBuscada2 + " si estaba y " + cadena.substring(31) + "también"
                        : "Estaba Pedro,Luis  " + cadenaBuscada2 + cadena.substring(31) + "también");
        sc.close();
    }
}
