package Practicas_java.Practicas_Condicionales;

import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[]args){
        String genero_libro;
        genero_libro=JOptionPane.showInputDialog("Ingrese su genero de libro favorito:\nfantasia\nmisterio\nromance\nciencia ficcion");
        if (genero_libro.equals("Fantasia")){
            System.out.println("""
                    1. Fantasía: "El nombre del viento" – Patrick Rothfuss

                    Género: Fantasía épica
                    Temas principales: Magia, aventuras, crecimiento personal
                    Motivos para leerlo:
                    Narrativa rica y detallada
                    Personaje principal carismático y complejo
                    Ambientación mágica con un sistema de magia bien desarrollado
                    Parte de la saga "Crónica del asesino de reyes"
                    """);
        }
        if (genero_libro.equals("misterio")){
            System.out.println("""
                    2. Misterio: "El código Da Vinci" – Dan Brown

                    Género: Misterio, thriller
                    Temas principales: Secretos, conspiraciones, simbología religiosa
                    Motivos para leerlo:
                    Ritmo rápido y emocionante
                    Intrigas sobre arte y religión
                    Un misterio que te mantiene enganchado desde el principio
                    Combinación de hechos históricos y ficción""");
        }
        if (genero_libro.equals("romance")){
            System.out.println("""
                    3. Romance: "Orgullo y prejuicio" – Jane Austen

                    Género: Romance, clásico
                    Temas principales: Amor, clases sociales, orgullo
                    Motivos para leerlo:
                    Un romance atemporal lleno de ingenio y encanto
                    Personajes memorables como Elizabeth Bennet y Mr. Darcy
                    Crítica social de la época georgiana
                    Prosa elegante y diálogos agudos
                    """);
        }
        if (genero_libro.equals("ciencia ficcion")){
            System.out.println("""
                    4. Ciencia Ficción: "Dune" – Frank Herbert

                    Género: Ciencia ficción, space opera
                    Temas principales: Política, ecología, religión, poder
                    Motivos para leerlo:
                    Complejo universo con una profunda construcción del mundo
                    Reflexiones sobre el poder y la ecología
                    Trama intrigante y personajes fascinantes
                    Uno de los pilares de la ciencia ficción moderna
                    """);
        }
    }
}
