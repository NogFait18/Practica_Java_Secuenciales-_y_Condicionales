package Practicas_java;

import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String[]args){
        //Ejercicio 2: Calculadora de Calorias Quemadas
        int peso,ejercicio,tiempo;//ejercicio 2
        peso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso en kg"));
        ejercicio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ejercicio que realizo\n1-correr\n 2-nadar\n 3-andar en bicicleta"));
        tiempo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración del ejercicio en minutos"));
        switch (ejercicio){
            case 1:
                System.out.println("Usted ha quemado: "+(tiempo * 11)+" calorias corriendo con una intensidad moderada");
                break;
            case 2:
                System.out.println("Usted ha quemado: "+(tiempo * 8)+" calorias nadando con una intensidad moderada");
                break;
            case 3:
                System.out.println("Usted ha quemado: "+(tiempo * 10)+" calorias andando en bicicleta con una intensidad moderada");
                break;
            default:
                System.out.println("Opcion que eligio no exixste");
                break;
        }
    }
}
