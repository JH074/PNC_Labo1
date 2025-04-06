package service;

import java.util.ArrayList;
import java.util.List;

import model.Jugador;
import model.Partido;

public class  golesJugador {

    public static void golesJugadores(Partido partido){
        
        //Lista de jugadores
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.addAll(partido.getEquipoA());
        jugadores.addAll(partido.getEquipoB());

        //Jugador con más goles
        Jugador masGoles = null;
        for(Jugador j : jugadores){
            if (masGoles == null || j.getGolesMarcados() > masGoles.getGolesMarcados()){
                masGoles = j;
            }
        }

        if (masGoles != null ) {
            System.out.println("Jugador con más goles: " + masGoles.getNombre() + " - " + masGoles.getGolesMarcados());
        }

    }

    
}


