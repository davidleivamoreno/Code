package Ejercicioscadenas;

public class Manejo_de_cadenas {
    public static void main(String[] args) {
        // Ejemplo de uso de los métodos de la clase String
        String cadena = "En un lugar de la Mancha";
        // charAt()
        char caracter = cadena.charAt(2);
        System.out.println(caracter);
        // Comparación
        String cadena1 = "hola";
        String cadena2 = "HOLA";
        System.out.println((cadena1 == cadena2) ? "Iguales" : "No iguales");
        System.out.println((cadena1 == "hola") ? "cadena1 dice hola" : "cadena1 no dice hola");
        // Método CompareTo()
        System.out.println(cadena1.compareTo(cadena2));
        System.out.println((cadena1.compareTo(cadena2) == 0) ? "iguales" : "no iguales");
        // CompareToIgnoreCase()
        System.out.println((cadena1.compareToIgnoreCase(cadena2) == 0) ? "iguales" : "no iguales");
        // Segundo ejemplo:
        String apellido1 = "Lopez";
        String apellido2 = "Garcia";
        System.out.println((apellido1.compareTo(apellido2) > 0) ? apellido1 + " va antes que " + apellido2
                : apellido2 + "va antes que " + apellido1);
        // Longitud de la cadena
        int longitud = cadena.length();
        System.out.println(longitud + "palabras");

        // Ultimo caracter
        char ultimo = cadena.charAt(longitud - 1);

        // Buscar un caracter
        int posicionD = cadena.indexOf('d');
        System.out.println("La letra D está en la posición " + posicionD);
        char letraA = 'a';
        int posicionA = cadena.indexOf(letraA);
        int posicionAA = cadena.indexOf(letraA, posicionA + 1);
        System.out.println("La primera letra A esta " + posicionA + "la segunda A en " + posicionAA);
        String lugar = "Mancha";
        String lugar2 = "Lugo";
        int posicionLugar = cadena.indexOf(lugar);
        System.out.println((posicionLugar >= 0) ? lugar + " si esta en la cadena" : lugar + " no está en la cadena");
        int posicionLugar1 = cadena.indexOf(lugar2);
        System.out.println((posicionLugar1 >= 0) ? lugar2 + " si esta en la cadena" : lugar2 + " no está en la cadena");

        // Convertir a mayúsculas o minúsculas
        String cadenaMayusc = cadena.toUpperCase();
        String cadenaMinusc = cadena.toLowerCase();
        String lugarMinusc = lugar.toLowerCase();
        String cadena2Mayusc = cadena.toUpperCase();
        posicionLugar = cadena2Mayusc.indexOf(cadena2Mayusc);
        System.out.println((posicionLugar >= 0) ? "Si" + lugar : "No" + lugar);

        // Remplazo
        String cadenaModificada = cadena.replace('a', 'x');
        System.out.println(cadenaModificada);
        cadenaModificada = cadena.replaceAll("un", "otro");
        System.out.println(cadenaModificada);
        cadenaModificada = cadena.replaceFirst("a", "x");
        cadenaModificada = cadena.replaceAll("e", "x");
        System.out.println(cadenaModificada);

        // Eliminar espacios delante y detras

        String saludo = "     Hola     ";
        System.out.println(saludo);
        System.out.println(saludo.trim());

        // Cortar una cadena
        String[] trozos = cadena.split("de");
        int cantidadTrozos = trozos.length;
        String trozo0 = trozos[0];
        String trozo1 = trozos[1];
        System.out.println("Trozo 0 = " + trozo0);
        System.out.println("Trozo 1 = " + trozo1);
        // Cortar cadenas SubString
        String cadenadesde5 = cadena.substring(5);
        System.out.println(cadenadesde5);
        int posicion = 5;
        cadenadesde5 = cadena.substring(posicion);
        System.out.println(cadenadesde5);
        String cadenade5a20 = cadena.substring(5, 20);
        System.out.println(cadenade5a20);
        // Concatenar
        String saludo1 = "hola";
        String saludo2 = "Pepe";
        String saludo_completo = saludo1.concat(saludo2);
        System.out.println(saludo_completo);

        float pi = 3.14f;
        String PI = String.valueOf(pi);
        // String Buffer
        StringBuffer Sb = new StringBuffer(cadena);
        // Cambia una letra según su posición.
        Sb.setCharAt(1, 'M');
        System.out.println(Sb);
        // Inserta en una posición
        Sb.insert(10, "Don Quijote");
        System.out.println(Sb);
        boolean EsDigito = Character.isDigit('3');
        boolean esEspacio = Character.isSpaceChar(' ');
        boolean esMayuscula = Character.isUpperCase('v');

    }
}
