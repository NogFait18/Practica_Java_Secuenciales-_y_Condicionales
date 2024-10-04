package Practicas_java;

import javax.swing.*;

public class Ejercicio_5 {
    public static void main(String[]args){
        int distancia,consumo,precio,total;
        distancia= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia de su viaje en kilometros"));
        consumo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el consumo de combustible del vehiculo en litros por km"));
        precio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del combustible por litro"));

        total=(distancia*consumo)*precio;
        System.out.println("El precio total del viaje es de: "+total);

    }
}
