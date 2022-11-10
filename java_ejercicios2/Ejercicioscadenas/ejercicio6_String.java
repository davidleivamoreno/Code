import java.util.Scanner;

public class ejercicio6_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "“En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”";
        System.out.println("Quien esta en casa de Juan");
        String cadenaBuscada = sc.nextLine();
        String textoEnMinúscula = cadena.toLowerCase();
        String cadenaBuscadaMin = cadenaBuscada.toLowerCase();
        boolean estaba = (textoEnMinúscula.indexOf(cadenaBuscadaMin) >= 0);
        System.out.println((estaba) ? cadenaBuscada + " si estaba" : cadenaBuscada + " no estaba");
        sc.close();
    }
}
