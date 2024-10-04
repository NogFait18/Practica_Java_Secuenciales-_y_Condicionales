package Practicas_java;
import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, califica los siguientes factores de felicidad en una escala del 1 al 10:");

        System.out.print("Nivel de satisfacción con la vida (1 para muy bajo, 10 para muy alto): ");
        int satisfaccionVida = (scanner.nextInt());

        System.out.print("Nivel de estrés (1 para muy bajo, 10 para muy alto): ");
        int nivelEstres = (scanner.nextInt());

        System.out.print("Nivel de salud (1 para muy bajo, 10 para muy alto): ");
        int nivelSalud = (scanner.nextInt());

        System.out.print("Nivel de relaciones personales (1 para muy bajo, 10 para muy alto): ");
        int relacionesPersonales = (scanner.nextInt());

        System.out.print("Nivel de bienestar financiero (1 para muy bajo, 10 para muy alto): ");
        int bienestarFinanciero = (scanner.nextInt());

        double indiceFelicidad = (satisfaccionVida + (10 - nivelEstres) + nivelSalud + relacionesPersonales + bienestarFinanciero) / 5.0;

        System.out.println("\nTu índice de felicidad es: " + indiceFelicidad + " / 10");

        if (indiceFelicidad >= 8) {
            System.out.println("¡Parece que estás muy feliz!");
        } else if (indiceFelicidad >= 5) {
            System.out.println("Estás moderadamente feliz, pero hay áreas que puedes mejorar.");
        } else {
            System.out.println("Tu nivel de felicidad es bajo. Podrías beneficiarte al enfocarte en mejorar algunos aspectos.");
        }

        scanner.close();
    }

}