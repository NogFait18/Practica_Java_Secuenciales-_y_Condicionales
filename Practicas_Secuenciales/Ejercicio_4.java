package Practicas_java;

import javax.swing.*;

public class Ejercicio_4 {
    public static void main(String[]args){
        String estado_animo;
        estado_animo= JOptionPane.showInputDialog("Ingrese su estado de animo\nfeliz\ntriste\nenérgetico\nrelajado");
        if (estado_animo.equals("feliz")) {
            System.out.println("""
                    Feliz (Canciones alegres y optimistas):
                    Pharrell Williams – "Happy"
                    Katrina and the Waves – "Walking on Sunshine"
                    Justin Timberlake – "Can't Stop the Feeling"
                    Jason Mraz – "I'm Yours"
                    Shakira – "Waka Waka (This Time for Africa)\"""");
        }
        if (estado_animo.equals("triste")) {
            System.out.println("""
                    Triste (Canciones melancólicas o emotivas):
                    Adele – "Someone Like You"
                    Sam Smith – "Too Good at Goodbyes"
                    Billie Eilish – "When the Party's Over"
                    James Blunt – "Goodbye My Lover"
                    Radiohead – "Creep\"""");
        }
        if (estado_animo.equals("relajado")) {
            System.out.println("""
                    Relajado (Canciones suaves y tranquilas):
                    Norah Jones – "Come Away with Me"
                    Bon Iver – "Holocene"
                    Coldplay – "Sparks"
                    Fleetwood Mac – "Landslide"
                    The xx – "Intro\"""");
        }
        if (estado_animo.equals("energetico")){

            System.out.println("""
                    Energético (Canciones para llenarse de energía):
                    Queen – "Don't Stop Me Now"
                    Daft Punk – "Harder, Better, Faster, Stronger"
                    David Guetta – "Titanium" ft. Sia
                    Imagine Dragons – "Believer"
                    AC/DC – "Thunderstruck\"""");
            }
        }
    }
