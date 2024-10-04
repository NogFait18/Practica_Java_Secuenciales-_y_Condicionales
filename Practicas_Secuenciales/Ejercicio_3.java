package Practicas_java;
import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[]args){
        int rutina;
        rutina=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cual es su nivel de condición fisica\n1-principiante\n2-intermedio\n3-avanzado"));
        switch(rutina){
            case 1:
                System.out.println("Usted a elegido la rutina de principiantes");
                System.out.println("Principiante (3-4 días a la semana, 30-45 min por sesión)\n" +
                        "Objetivo: Mejorar la movilidad, fuerza general y resistencia cardiovascular.\n" +
                        "\n" +
                        "Día 1 – Full Body + Cardio (45 min)\n" +
                        "\n" +
                        "Calentamiento: 5 min de marcha en el sitio o trote suave.\n" +
                        "Circuito de fuerza (3 rondas, 12 repeticiones cada ejercicio):\n" +
                        "Sentadillas con peso corporal\n" +
                        "Flexiones de rodillas\n" +
                        "Plancha de 20 segundos\n" +
                        "Peso muerto con mancuernas ligeras\n" +
                        "Remo con banda elástica\n" +
                        "Cardio: 10 min de caminata rápida o trote suave.\n" +
                        "Enfriamiento y estiramientos: 5 min.\n" +
                        "Día 2 – Cardio ligero + Core (30-40 min)\n" +
                        "\n" +
                        "Calentamiento: 5 min de marcha o bicicleta estática suave.\n" +
                        "Cardio: 20 min de caminata rápida o bicicleta.\n" +
                        "Ejercicios de core (2 rondas):\n" +
                        "Plancha 20-30 segundos\n" +
                        "Crunches: 12 repeticiones\n" +
                        "Elevación de piernas: 12 repeticiones\n" +
                        "Superman: 12 repeticiones\n" +
                        "Enfriamiento y estiramientos: 5 min.\n" +
                        "Día 3 – Cuerpo superior (40 min)\n" +
                        "\n" +
                        "Calentamiento: 5 min de movilidad articular (hombros, codos, muñecas).\n" +
                        "Circuito de fuerza (3 rondas, 12 repeticiones cada ejercicio):\n" +
                        "Flexiones asistidas (de rodillas)\n" +
                        "Press de hombro con mancuernas\n" +
                        "Remo con banda elástica\n" +
                        "Elevaciones laterales con mancuernas\n" +
                        "Curls de bíceps con mancuernas\n" +
                        "Enfriamiento: Estiramientos de brazos y hombros.\n" +
                        "Día 4 – Descanso o actividad ligera (yoga, caminar)\n" +
                        "\n");
                        break;
            case 2:
                System.out.println("Usted a elegido la rutina de intermedios");
                System.out.println("\n" +
                        "Aquí te dejo una rutina de ejercicios semanal para tres niveles diferentes: principiante, intermedio y avanzado. Cada nivel tiene una mezcla de entrenamiento de fuerza, cardiovascular, flexibilidad y descanso para optimizar el progreso físico. También incluye duraciones recomendadas para cada tipo de ejercicio.\n" +
                        "\n" +
                        "Principiante (3-4 días a la semana, 30-45 min por sesión)\n" +
                        "Objetivo: Mejorar la movilidad, fuerza general y resistencia cardiovascular.\n" +
                        "\n" +
                        "Día 1 – Full Body + Cardio (45 min)\n" +
                        "\n" +
                        "Calentamiento: 5 min de marcha en el sitio o trote suave.\n" +
                        "Circuito de fuerza (3 rondas, 12 repeticiones cada ejercicio):\n" +
                        "Sentadillas con peso corporal\n" +
                        "Flexiones de rodillas\n" +
                        "Plancha de 20 segundos\n" +
                        "Peso muerto con mancuernas ligeras\n" +
                        "Remo con banda elástica\n" +
                        "Cardio: 10 min de caminata rápida o trote suave.\n" +
                        "Enfriamiento y estiramientos: 5 min.\n" +
                        "Día 2 – Cardio ligero + Core (30-40 min)\n" +
                        "\n" +
                        "Calentamiento: 5 min de marcha o bicicleta estática suave.\n" +
                        "Cardio: 20 min de caminata rápida o bicicleta.\n" +
                        "Ejercicios de core (2 rondas):\n" +
                        "Plancha 20-30 segundos\n" +
                        "Crunches: 12 repeticiones\n" +
                        "Elevación de piernas: 12 repeticiones\n" +
                        "Superman: 12 repeticiones\n" +
                        "Enfriamiento y estiramientos: 5 min.\n" +
                        "Día 3 – Cuerpo superior (40 min)\n" +
                        "\n" +
                        "Calentamiento: 5 min de movilidad articular (hombros, codos, muñecas).\n" +
                        "Circuito de fuerza (3 rondas, 12 repeticiones cada ejercicio):\n" +
                        "Flexiones asistidas (de rodillas)\n" +
                        "Press de hombro con mancuernas\n" +
                        "Remo con banda elástica\n" +
                        "Elevaciones laterales con mancuernas\n" +
                        "Curls de bíceps con mancuernas\n" +
                        "Enfriamiento: Estiramientos de brazos y hombros.\n" +
                        "Día 4 – Descanso o actividad ligera (yoga, caminar)\n" +
                        "\n" +
                        "Intermedio (4-5 días a la semana, 45-60 min por sesión)\n" +
                        "Objetivo: Desarrollar fuerza, resistencia cardiovascular y mejorar la composición corporal.\n" +
                        "\n" +
                        "Día 1 – Full Body (60 min)\n" +
                        "\n" +
                        "Calentamiento: 5-10 min de saltos de tijera y movilidad articular.\n" +
                        "Circuito de fuerza (4 rondas, 12-15 repeticiones):\n" +
                        "Sentadillas con peso\n" +
                        "Flexiones normales\n" +
                        "Peso muerto con mancuernas\n" +
                        "Remo con mancuernas\n" +
                        "Planchas laterales de 30 segundos\n" +
                        "Cardio: 10 min de trote o bicicleta a intensidad moderada.\n" +
                        "Enfriamiento: Estiramientos estáticos.\n" +
                        "Día 2 – HIIT (45 min)\n" +
                        "\n" +
                        "Calentamiento: 5-10 min de trote suave.\n" +
                        "HIIT (4 rondas, 30 segundos de esfuerzo / 30 segundos de descanso):\n" +
                        "Saltos de tijera\n" +
                        "Burpees\n" +
                        "Mountain climbers\n" +
                        "Sentadillas con salto\n" +
                        "Enfriamiento: 5-10 min de caminata suave y estiramientos.\n" +
                        "Día 3 – Cuerpo inferior (60 min)\n" +
                        "\n" +
                        "Calentamiento: 10 min de movilidad de cadera y rodillas.\n" +
                        "Circuito de fuerza (4 rondas, 12 repeticiones):\n" +
                        "Sentadillas con barra o mancuernas\n" +
                        "Estocadas caminando con peso\n" +
                        "Hip thrust\n" +
                        "Elevaciones de talones para pantorrillas\n" +
                        "Planchas con elevación de pierna\n" +
                        "Enfriamiento: Estiramientos de piernas y glúteos.\n" +
                        "Día 4 – Cardio moderado (45-60 min)\n" +
                        "\n" +
                        "Cardio: 45-60 min de correr, andar en bicicleta o nadar.\n" +
                        "Enfriamiento: Estiramientos dinámicos.\n" +
                        "Día 5 – Cuerpo superior + Core (60 min)\n" +
                        "\n" +
                        "Calentamiento: 5-10 min de movilidad de hombros y brazos.\n" +
                        "Circuito de fuerza (4 rondas, 12 repeticiones):\n" +
                        "Press de banca o flexiones\n" +
                        "Remo con barra o mancuernas\n" +
                        "Press de hombros\n" +
                        "Curl de bíceps y press francés (tríceps)\n" +
                        "Plancha con toques de hombros\n" +
                        "Enfriamiento: Estiramientos de espalda y brazos.\n" +
                        "Día 6 – Descanso activo o estiramientos/yoga");
                        break;
            case 3:
                System.out.println("Usted a elegido la rutina avanzada");
                System.out.println("Avanzado (5-6 días a la semana, 60-75 min por sesión)\n" +
                        "Objetivo: Ganancia muscular, alta resistencia cardiovascular y definición muscular.\n" +
                        "\n" +
                        "Día 1 – Full Body + Cardio (75 min)\n" +
                        "\n" +
                        "Calentamiento: 10 min de trote o bicicleta.\n" +
                        "Circuito de fuerza (5 rondas, 10-12 repeticiones):\n" +
                        "Sentadilla profunda con barra\n" +
                        "Peso muerto convencional\n" +
                        "Press de banca\n" +
                        "Dominadas o remo con barra\n" +
                        "Burpees\n" +
                        "Cardio: 20 min de intervalos (sprints de 30 segundos con 1 min de descanso).\n" +
                        "Enfriamiento: Estiramientos profundos.\n" +
                        "Día 2 – HIIT + Core (60 min)\n" +
                        "\n" +
                        "Calentamiento: 10 min de saltos, trote y movilidad.\n" +
                        "HIIT (6 rondas, 40 segundos de trabajo / 20 segundos de descanso):\n" +
                        "Burpees\n" +
                        "Saltos de caja\n" +
                        "Mountain climbers\n" +
                        "Saltos con cuerda\n" +
                        "Planchas laterales con levantamiento de pierna\n" +
                        "Core: Plancha lateral, abdominales y elevación de piernas.\n" +
                        "Enfriamiento: Estiramientos de abdomen y cadera.\n" +
                        "Día 3 – Cuerpo inferior (60 min)\n" +
                        "\n" +
                        "Calentamiento: 10 min de movilidad de cadera y piernas.\n" +
                        "Entrenamiento de fuerza (5 rondas, 8-10 repeticiones):\n" +
                        "Sentadillas frontales\n" +
                        "Peso muerto rumano\n" +
                        "Estocadas búlgaras\n" +
                        "Hip thrust pesado\n" +
                        "Elevación de pantorrillas\n" +
                        "Enfriamiento: Estiramientos de glúteos y cuádriceps.\n" +
                        "Día 4 – Cardio largo (60-75 min)\n" +
                        "\n" +
                        "Cardio: 60-75 min de carrera o ciclismo a ritmo constante.\n" +
                        "Enfriamiento: Caminata suave + estiramientos de piernas.\n" +
                        "Día 5 – Cuerpo superior (75 min)\n" +
                        "\n" +
                        "Calentamiento: 10 min de movilidad de hombros y espalda.\n" +
                        "Circuito de fuerza (5 rondas, 10-12 repeticiones):\n" +
                        "Press militar\n" +
                        "Dominadas con peso\n" +
                        "Press de banca inclinado\n" +
                        "Curl de bíceps con barra\n" +
                        "Extensiones de tríceps\n" +
                        "Core: Plancha con rotaciones y rueda abdominal.\n" +
                        "Enfriamiento: Estiramientos de espalda y hombros.\n" +
                        "Día 6 – HIIT + Core (60 min)\n" +
                        "\n" +
                        "Calentamiento: 10 min de movilidad general.\n" +
                        "HIIT (6 rondas, 40 segundos de trabajo / 20 segundos de descanso):\n" +
                        "Sprints\n" +
                        "Sentadillas con salto\n" +
                        "Mountain climbers\n" +
                        "Zancadas explosivas\n" +
                        "Core: Crunches, bicicleta y elevaciones de piernas.\n" +
                        "Enfriamiento: Estiramientos de abdomen y flexores de cadera.\n" +
                        "Día 7 – Descanso activo o yoga");
                        break;
            default:
                System.out.println("Esa opción no es valida");
                break;
        }
    }
}
