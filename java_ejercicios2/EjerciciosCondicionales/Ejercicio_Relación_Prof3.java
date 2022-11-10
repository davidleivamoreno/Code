import java.util.Scanner;

public class Ejercicio_Relación_Prof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 3 - Cálculos mentales
        // Realiza un programa que muestre dos números aleatorios (1 a 99) y una
        // operación al azar (suma, resta, multiplicación).

        // EL usuario debe introducir el resultado y la aplicación indicar si el
        // resultado ha sido correcto o no.
        int num1 = (int) (Math.random() * 99 + 1);
        int num2 = (int) (Math.random() * 99 + 1);
        int operación = (int) (Math.random() * 3 + 1);
        int entrada, resultado;
        switch (operación) {
            case 1:
                System.out.println("Suma:" + num1 + "+" + num2);
                entrada = sc.nextInt();
                resultado = num1 + num2;
                if (entrada == resultado) {
                    System.out.println("Acertaste");
                } else {
                    System.out.println("Has fallado");
                }
                break;
            case 2:
                System.out.println("Resta:" + num1 + "-" + num2);
                entrada = sc.nextInt();
                resultado = num1 - num2;
                if (entrada == resultado) {
                    System.out.println("Acertaste");
                } else {
                    System.out.println("Has fallado");
                }
                break;
            case 3:
                System.out.println("Multiplica" + num1 + "x" + num2);
                entrada = sc.nextInt();
                resultado = num1 * num2;
                if (entrada == resultado) {
                    System.out.println("Acertaste");
                } else {
                    System.out.println("Has fallado");
                }
                break;
        }
    }
}
