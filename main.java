import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Jugador;
import model.Partido;
import service.filtroJugadores;
import service.golesJugador;

public class main {
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {

            List<Jugador> equipoA = Arrays.asList(
                    new Jugador(1, "Juan", 5, 2),
                    new Jugador(2, "Luis", 3, 3),
                    new Jugador(3, "Pedro", 4, 3),
                    new Jugador(4, "Jonathan", 6, 3),
                    new Jugador(5, "Federico", 1, 1));

            List<Jugador> equipoB = Arrays.asList(
                    new Jugador(6, "Mario", 7, 4),
                    new Jugador(7, "Roberto", 0, 3),
                    new Jugador(8, "Juan", 1, 2),
                    new Jugador(9, "Sebastian", 2, 3),
                    new Jugador(9, "Paco", 2, 3));

            System.out.println("1. Jugador con más goles");
            System.out.println("2. Jugador con más de 5 goles");
            System.out.println("3. Estadísticas de goles de un jugador");
            System.out.print("Ingrese la opción: ");

            int option = leer.nextInt();

            switch (option) {
                case 1:

                    Partido partido = new Partido(equipoA, equipoB, 2, 1);
                    golesJugador.golesJugadores(partido);

                    break;
                case 2:
                    Partido filtro = new Partido(equipoA, equipoB, 2, 1);
                    filtroJugadores.filtroJugadores(filtro);
                    break;
                case 3:

                    break;

                default:
                    break;
            }
        }

    }

}
