import java.util.Scanner;

public class Ejercicio_Prof2_Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int entrada = 0;
        int ganada = 0;
        int contador_partdia = 0;
        int intentos = 1100;
        boolean salir = false;
        String rendirse = "";
        String otra_vez = "si";
        // salir = true;
        while (otra_vez.equalsIgnoreCase("si")) {
            contador_partdia++;

            int num_secreto = (int) (Math.random() * 100 + 1);
            boolean acertaste = false;
            while (entrada >= 0 && entrada != -1 && acertaste == false) {
                System.out.println("Introduce un número");
                entrada = sc.nextInt();
                if (entrada > num_secreto) {
                    System.out.println("Casi casi..Es más pequeño");
                    contador += 1;
                } else if (entrada < num_secreto) {
                    System.out.println("Casi casi..Es más grande");
                    contador += 1;
                } else if (entrada == num_secreto) {
                    System.out.println("Acertaste!!");
                    ganada = ganada + 1;
                    acertaste = true;
                }
                if (entrada != num_secreto) {
                    System.out.println("Te rindes? ");
                    sc.nextLine();
                    rendirse = sc.nextLine();
                    if (rendirse.equalsIgnoreCase("si")) {
                        acertaste = true;
                    }
                }
                if (contador_partdia > 0) {
                    System.out.println("Quieres volver a jugar?");
                    otra_vez = sc.nextLine();
                    if (otra_vez.equalsIgnoreCase("si")) {

                        contador_partdia++;

                        num_secreto = (int) (Math.random() * 100 + 1);
                        acertaste = false;
                        while (entrada >= 0 && entrada != -1 && acertaste == false) {
                            System.out.println("Introduce un número");
                            entrada = sc.nextInt();
                            if (entrada > num_secreto) {
                                System.out.println("Casi casi..Es más pequeño");
                                contador += 1;
                            } else if (entrada < num_secreto) {
                                System.out.println("Casi casi..Es más grande");
                                contador += 1;
                            } else if (entrada == num_secreto) {
                                System.out.println("Acertaste!!");
                                ganada = ganada + 1;
                                acertaste = true;
                            }
                            if (entrada != num_secreto) {
                                System.out.println("Te rindes? ");
                                sc.nextLine();
                                rendirse = sc.nextLine();
                                if (rendirse.equalsIgnoreCase("si")) {
                                    acertaste = true;
                                }
                            }
                        }
                    } else {
                        salir = true;
                    }

                }

                if (contador < intentos) {
                    intentos = contador;
                }

                System.out.println();
                System.out.println("Has ganado " + ganada + "partidas");

            }
        }
    }
}
