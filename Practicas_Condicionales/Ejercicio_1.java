package Practicas_java.Practicas_Condicionales;

import javax.swing.*;

public class Ejercicio_1 {
    public static void main(String[]args){
    String genero;
        genero=JOptionPane.showInputDialog("Ingrese su genero de pelicula favorito\nacción\ncomedia\ndrama\nciencia ficción");
        if (genero.equals("accion")){
            System.out.println("""
                    1. Acción: "Mad Max: Fury Road"

                    Director: George Miller
                    Año: 2015
                    Género: Acción, ciencia ficción
                    Temas principales: Supervivencia, caos, revolución
                    Motivos para verla:
                    Intensa acción y secuencias de persecuciones
                    Ambientación postapocalíptica impactante
                    Personajes icónicos como Imperator Furiosa y Max""");
        }
        if (genero.equals("comedia")) {
            System.out.println("""
                    2. Comedia: "The Grand Budapest Hotel"

                    Director: Wes Anderson
                    Año: 2014
                    Género: Comedia, drama
                    Temas principales: Lealtad, amistad, aventuras
                    Motivos para verla:
                    Humor excéntrico y visualmente estilizado
                    Personajes extravagantes y encantadores
                    Historia divertida y entrañable con un toque melancólico""");
        }
            if (genero.equals("drama")) {
                System.out.println("""
                        3. Drama: "The Pursuit of Happyness" (En busca de la felicidad)

                        Director: Gabriele Muccino
                        Año: 2006
                        Género: Drama, biográfico
                        Temas principales: Perseverancia, sacrificio, superación personal
                        Motivos para verla:
                        Actuación emocional de Will Smith
                        Inspiradora historia basada en hechos reales
                        Un viaje sobre la lucha por el éxito y la felicidad""");
            }
        if (genero.equals("ciencia ficcion")) {
            System.out.println("""
                    4. Ciencia Ficción: "Blade Runner 2049"

                    Director: Denis Villeneuve
                    Año: 2017
                    Género: Ciencia ficción, acción, drama
                    Temas principales: Identidad, inteligencia artificial, futuro de la humanidad
                    Motivos para verla:
                    Impresionante estética visual
                    Trama profunda y filosófica
                    Secuela de la icónica "Blade Runner\"""");
        }
    }
}