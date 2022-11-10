package EjerciciosDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class Manejo_fechas {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // Te da la fecha actual.
                LocalDate fecha_actual = LocalDate.now();
                // Te da la hora actual.
                LocalTime hora_actual = LocalTime.now();
                // Te da la fecha y hora actual
                LocalDateTime hora_fecha_actual = LocalDateTime.now();
                System.out.println("La fecha actual es: " + fecha_actual);
                System.out.println("La hora actual es: " + hora_actual);
                System.out.println("Lafecha y la hora actuales son: " + hora_fecha_actual);
                // Crear fecha
                LocalDate fechaCumple = LocalDate.of(2002, 12, 23);
                LocalDateTime diayhora_concierto = LocalDateTime.of(2022, 12, 15, 17, 30, 0);
                // Instante
                Instant instancia = Instant.now();
                System.out.println("El dia de mi cumpleaños es: " + fechaCumple);
                System.out.println("El concierto empieza el dia: " + diayhora_concierto.getDayOfMonth() + " en el mes "
                                + diayhora_concierto.getMonthValue());
                System.out.println("Estamos en el instante: " + instancia);
                // Añadir o quitar tiempo
                System.out.println("Fecha hace 2 semanas" + fecha_actual.plusWeeks(2));
                System.out.println("Hora actual: " + hora_actual);
                System.out.println("Hora actual-12 horas: " + hora_actual.minusHours(12));
                // Ajustes temporales
                System.out.println(
                                "Primer dia del mes: " + (LocalDate.now().with(TemporalAdjusters.firstDayOfMonth())
                                                .getDayOfWeek()));
                // Dar formato a una fecha
                DateTimeFormatter formatomio = DateTimeFormatter.ofPattern("dd /MMMM/ yy");
                System.out.println(hora_fecha_actual.format(formatomio.withLocale(new Locale("es", "ES"))));
                // Diferencia de fecha
                // Period y ChronoUnit
                System.out.println("Introduce dia: ");
                int dia = sc.nextInt();
                System.out.println("Introduce mes: ");
                int mes = sc.nextInt();
                System.out.println("Introduce año: ");
                int año = sc.nextInt();
                LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
                System.out.println("Mi edad es de " + ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now())
                                + " años");
                LocalDate FinAño = LocalDate.of(2022, 12, 31);
                LocalDate SiguienteCumple = LocalDate.of(LocalDate.now().getYear() + 1, mes, dia);
                LocalDate CumpleActual = LocalDate.of(SiguienteCumple.getYear() - 1, mes, dia);
                // Pedir fecha de Nacimiento
                // Mostrar en pantalla -> dias -mesConletras --yy
                // mostrar la edad
                // mostrar cuanto queda para tu proximo cumpleaños

                Period HastaCumple = SiguienteCumple.until(CumpleActual);
                System.out.println(
                                fechaNacimiento.format(formatomio));
                System.out.println("Quedan " + HastaCumple.getMonths() + "meses y " + HastaCumple.getDays() + " dias");

        }
}
