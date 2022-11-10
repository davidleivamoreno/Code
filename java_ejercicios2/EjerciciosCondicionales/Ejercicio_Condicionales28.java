import java.util.Scanner;

public class Ejercicio_Condicionales28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("J1:Elige piedra papel tijera:");
        String j1 = sc.nextLine();
        String j2 = "";
        int jugadaPC = (int) (Math.random() * 3);
        switch (jugadaPC) {
            case 0:
                j2 = "piedra";
                break;
            case 1:
                j2 = "tijeras";
                break;
            case 2:
                j2 = "papel";
                break;
            default:
                j2 = "";
        }
        switch (j1.toLowerCase()) {
            case "piedra":
                if (j2.equalsIgnoreCase("piedra")) {
                    System.out.println("Empate");
                } else if (j2.equalsIgnoreCase("papel")) {
                    System.out.println("GANA J2");
                } else if (j2.equalsIgnoreCase("tijera")) {
                    System.out.println("Gana J1");
                }
                break;
            case "tijeras":
                if (j2.equalsIgnoreCase("piedra")) {
                    System.out.println("GANA J2");
                } else if (j2.equalsIgnoreCase("papel")) {
                    System.out.println("GANA J1");
                } else if (j2.equalsIgnoreCase("tijera")) {
                    System.out.println("Empate");
                }
                break;
            case "papel":
                if (j2.equalsIgnoreCase("piedra")) {
                    System.out.println("GANA J1");
                } else if (j2.equalsIgnoreCase("papel")) {
                    System.out.println("Empate");
                } else if (j2.equalsIgnoreCase("tijera")) {
                    System.out.println("GANA J2");
                }
                break;
            default:
                System.out.println("No se ha ugado todavia");
        }
    }
}
