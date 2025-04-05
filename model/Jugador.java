package model;

public class Jugador {

    private String nombre;
    private int golesMarcados;
    private int partidosJugados;

    // Constructor
    public Jugador(String nombre, int golesMarcados, int partidosJugados) {
        this.nombre = nombre;
        this.golesMarcados = golesMarcados;
        this.partidosJugados = partidosJugados;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    // toString override
    @Override
    public String toString() {
        return "Jugador{" +
                "Nombre: " + nombre +
                ", Goles marcados: " + golesMarcados +
                ", Partidos jugados: " + partidosJugados +
                '}';
    }
}

