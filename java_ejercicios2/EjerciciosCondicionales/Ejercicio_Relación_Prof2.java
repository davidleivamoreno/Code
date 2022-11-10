import java.util.Scanner;

public class Ejercicio_Relación_Prof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 2 - Granja
        // En una granja se compra diariamente una cantidad (comidaDiaria) de comida
        // para los animales. El número de animales que alimentar es numAnimales y
        // sabemos que cada animal como una media de kilosPorAnimal

        // Diseña un programa que solicite al usuario los valores anteriores y determine
        // si disponemos de alimento suficiente para cada animal. En caso negativo, ha
        // de calcular cual es la ración que corresponde a cada uno de los animales y
        // cuanto tendríamos que comprar para llegar a la ración diaria indicada
        // Nota: Evitar la división por 0.

        System.out.println("Cual es el animal de tu granja");
        String animal = sc.nextLine();
        sc.nextLine();
        System.out.println("Procederemos a hacer el calculo de comida para los " + animal + " que hay en tu granja");
        System.out.println("Cuanta comida has comprado:");
        double comidaDiaria = sc.nextDouble();
        System.out.println("Cuantos animales tiene:");
        int numanimales = sc.nextInt();
        System.out.println("Cuanto come cada animal");
        double comidaNecesariaporAnimal = sc.nextDouble();
        double comidaNecesaria = numanimales * comidaNecesariaporAnimal;
        boolean hayComida = (comidaDiaria > 0);
        boolean hayAnimales = (numanimales > 0);
        double kilosPorAnimal = (hayComida && hayAnimales) ? comidaDiaria / numanimales : 0;
        if (comidaNecesaria > comidaDiaria) {
            System.out.println("Hace falta comprar " + (kilosPorAnimal + comidaDiaria)
                    + "para abastecer a los animales de la granja");
        } else if (kilosPorAnimal == 0 && !hayComida) {
            System.out.println("No has comprado comida");
        } else if (kilosPorAnimal == 0 && !hayAnimales) {
            System.out.println("No hay animales en tu granja");
        }

    }
}
