package Practicas_java.Practicas_Condicionales;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        String actividad = recomendarActividad(estadoAnimo);
        System.out.println("Te recomendamos: " + actividad);
    }

    public static String recomendarActividad(String estadoAnimo) {
        return switch (estadoAnimo) {
            case "feliz" -> "Salir a caminar y disfrutar del aire libre.";
            case "triste" -> "Ver una película que te guste o hablar con un amigo.";
            case "enérgico" -> "Hacer ejercicio o practicar un deporte.";
            case "relajado" -> "Leer un libro o meditar.";
            default -> "Probar algo nuevo y divertido.";
        };
    }
}