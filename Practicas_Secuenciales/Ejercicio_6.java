package Practicas_java;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes estudiar? (Entre 1 y 6): ");
        int horasPorDia = scanner.nextInt();

        if (horasPorDia < 1 || horasPorDia > 6) {
            System.out.println("El número de horas debe estar entre 1 y 6.");
            return;
        }

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        String[] materias = {"Matemática", "Inglés", "Programación 1"};

        System.out.println("\nTu plan de estudio semanal:");
        for (String dia : diasSemana) {
            System.out.println("\n" + dia + ":");

            int horasRestantes = horasPorDia;

            for (String materia : materias) {
                int horasMateria = horasRestantes / materias.length;
                if (materia.equals("Programación 1")) {
                    // Asignar las horas restantes a la última materia
                    horasMateria = horasRestantes;
                }

                System.out.println("- " + materia + ": " + horasMateria + " horas");
                horasRestantes -= horasMateria;
            }
        }

        scanner.close();
    }
}


