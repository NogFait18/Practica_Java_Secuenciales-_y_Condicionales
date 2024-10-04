package Practicas_java.Practicas_Condicionales;

import java.util.Scanner;
    public class Ejercicio_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("¿Cuántas horas al día duermes? ");
            int horasDormir = scanner.nextInt();

            System.out.print("¿Cuántas horas al día haces ejercicio? ");
            int horasEjercicio = scanner.nextInt();

            System.out.print("¿Cuántas comidas saludables consumes al día? ");
            int comidasSaludables = scanner.nextInt();

            String evaluacion = evaluarHabitos(horasDormir, horasEjercicio, comidasSaludables);
            System.out.println(evaluacion);
        }

        public static String evaluarHabitos(int dormir, int ejercicio, int comidas) {
            if (dormir >= 7 && dormir <= 9 && ejercicio >= 1 && comidas >= 3) {
                return "Tus hábitos son muy saludables.";
            } else if ((dormir >= 7 && dormir <= 9) || ejercicio >= 1 || comidas >= 3) {
                return "Tus hábitos son moderadamente saludables.";
            } else {
                return "Deberías mejorar tus hábitos para una vida más saludable.";
            }
        }
    }

