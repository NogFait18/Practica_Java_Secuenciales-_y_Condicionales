package Practicas_java.Practicas_Condicionales;

import javax.swing.*;

public class Ejercicio_4 {
    public static void main(String[]args){
        float kilogramos,altura,IMC;
        kilogramos=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso en kilogramos"));
        altura=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su altura en metros"));
        IMC=kilogramos/(altura*altura);
        if (IMC <= 18.5){
            System.out.println("Usted esta en bajo peso");
            System.out.println("Recomendación: Es importante aumentar la ingesta calórica con alimentos nutritivos. Consulta a un profesional de la salud para descartar posibles problemas médicos y recibir orientación sobre una dieta adecuada.");
        }
        if (IMC > 18.5 && IMC <= 24.9){
            System.out.println("Usted esta en un peso normal");
            System.out.println("Recomendación: Mantén un estilo de vida saludable con una dieta equilibrada y ejercicio regular. Continúa con buenos hábitos alimenticios y actividad física para mantener tu peso.");
        }
        if (IMC >= 25 && IMC <= 29.9){
            System.out.println("Usted esta en sobrepeso");
            System.out.println("Recomendación: Intenta reducir el peso mediante una dieta balanceada y aumento de la actividad física. Considera consultar a un nutricionista para un plan personalizado y sostenible.");
        }
        if (IMC >= 30){
            System.out.println("Usted esta en obesidad");
            System.out.println("Recomendación: Es crucial buscar ayuda profesional para desarrollar un plan de pérdida de peso seguro y efectivo. Esto puede incluir cambios en la dieta, ejercicio regular y, en algunos casos, tratamiento médico.");
        }
        System.out.println("Su IMC es: "+IMC);
    }
}
