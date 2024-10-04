package Practicas_java.Practicas_Condicionales;

import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String[]args){
        String categoria;
        float precio;
        precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del su producto"));
        categoria=JOptionPane.showInputDialog("Ingrese la categoria de cliente al que pertenece:\nestudiante\nadulto\njubilado");
        if (categoria.equals("estudiante")){
            System.out.println("Usted recibe un descuento del 10% por lo que su producto valdria: "+ (precio * 0.10));
        }
        if (categoria.equals("adulto")){
            System.out.println("Usted recibe un descuento del 5% por lo que su producto valdria: "+ (precio * 0.5)+"$");
        }
        if (categoria.equals("jubilado")){
            System.out.println("Usted recibe un descuento del 15% por lo que su producto valdria: "+ (precio * 0.15));
        }
    }
}
