package service;

import java.util.ArrayList;
import java.util.List;

import model.Jugador;
import model.Partido;

public class estadisticasPartido {

    public static void estadisticasPartido(Partido partido) {

        // Lista de jugadores
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.addAll(partido.getEquipoA());
        jugadores.addAll(partido.getEquipoB());

        // Estadisticas
        System.out.println("Estadísticas actualizadas");
        jugadores.stream().forEach(jugador -> {
            int goles = obtenerGolesJugador(partido, jugador);
            jugador.setGolesMarcados(jugador.getGolesMarcados() + goles);
            jugador.setPartidosJugados(jugador.getPartidosJugados() + 1);
            System.out.println(jugador);
        });
    }

    private static int obtenerGolesJugador(Partido partido, Jugador jugador) {
        if (partido.getEquipoA().contains(jugador)) {
            return partido.getGolesEquipoA(); 
        } else if (partido.getEquipoB().contains(jugador)) {
            return partido.getGolesEquipoB(); 
        }
        return 0;
    }
}
