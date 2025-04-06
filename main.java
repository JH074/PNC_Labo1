import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import model.Jugador;
import model.Partido;
import service.golesJugador;

public class main {
    public static void main(String[] args) {

        List<Jugador> equipoA = Arrays.asList(
                new Jugador(1, "Juan", 5, 2),
                new Jugador(2, "Luis", 3, 3),
                new Jugador(3, "Pedro", 4, 3),
                new Jugador(4, "Jonathan", 6, 3),
                new Jugador(5, "Federico", 1, 1));

        List<Jugador> equipoB = Arrays.asList(
                new Jugador(6, "Mario", 0, 2),
                new Jugador(7, "Roberto", 0, 3),
                new Jugador(8, "Juan", 1, 2),
                new Jugador(9, "Sebastian", 2, 3),
                new Jugador(9, "Paco", 2, 3)
        );

        Partido partido = new Partido(equipoA, equipoB, 2, 1);
        golesJugador.golesJugadores(partido);
    }

}
