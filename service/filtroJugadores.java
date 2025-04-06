package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Jugador;
import model.Partido;

public class filtroJugadores {
    public static void filtroJugadores(Partido partido){
        
        //Lista de jugadores
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.addAll(partido.getEquipoA());
        jugadores.addAll(partido.getEquipoB());

        //Jugador con más de 5 goles
        System.out.println("Jugadores con más de 5 goles en temporada");
        List<Jugador> masDeCinco = jugadores.stream()
            .filter(jugador -> jugador.getGolesMarcados() > 5)
            .collect(Collectors.toList());
        masDeCinco.forEach(jugador -> System.out.println(jugador));

    }
}