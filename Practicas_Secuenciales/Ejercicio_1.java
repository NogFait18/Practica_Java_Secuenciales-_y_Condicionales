package Practicas_java;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la fecha de nacimiento
        System.out.print("Por favor, introduce tu fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        // Extraer el día y el mes de la fecha ingresada
        String[] fecha = fechaNacimiento.split("/");
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);

        // Determinar el signo zodiacal
        String signoZodiacal = obtenerSignoZodiacal(dia, mes);

        // Mostrar el signo zodiacal
        System.out.println("Tu signo del zodiaco es: " + signoZodiacal);

        // Mostrar un mensaje de horóscopo correspondiente
        imprimirHoroscopo(signoZodiacal);

        scanner.close();
    }

    // Método para determinar el signo zodiacal basado en el día y mes
    public static String obtenerSignoZodiacal(int dia, int mes) {
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else {
            return "Desconocido";
        }
    }

    // Método para imprimir un mensaje de horóscopo basado en el signo zodiacal
    public static void imprimirHoroscopo(String signo) {
        switch (signo) {
            case "Acuario":
                System.out.println("Hoy es un buen día para explorar nuevas ideas y ser creativo.");
                break;
            case "Piscis":
                System.out.println("La empatía será tu mayor fortaleza hoy. Ayuda a los demás.");
                break;
            case "Aries":
                System.out.println("La energía está de tu lado. Toma la iniciativa en tus proyectos.");
                break;
            case "Tauro":
                System.out.println("Es un buen día para concentrarte en tu estabilidad emocional y financiera.");
                break;
            case "Géminis":
                System.out.println("La comunicación será clave hoy. Escucha y expresa tus ideas con claridad.");
                break;
            case "Cáncer":
                System.out.println("Tu sensibilidad te permitirá conectar profundamente con los que te rodean.");
                break;
            case "Leo":
                System.out.println("Tu confianza y carisma están en su punto más alto. Aprovecha para liderar.");
                break;
            case "Virgo":
                System.out.println("Hoy es un buen día para organizar y mejorar tu entorno.");
                break;
            case "Libra":
                System.out.println("Busca el equilibrio en tus relaciones y toma decisiones justas.");
                break;
            case "Escorpio":
                System.out.println("Tu intensidad emocional te llevará a profundizar en tus relaciones.");
                break;
            case "Sagitario":
                System.out.println("La aventura y la curiosidad te abrirán nuevas puertas hoy.");
                break;
            case "Capricornio":
                System.out.println("La disciplina y el trabajo duro te llevarán al éxito. Mantén el enfoque.");
                break;
            default:
                System.out.println("No se pudo determinar tu signo zodiacal.");
                break;
        }
    }
}