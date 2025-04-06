package model;

public class Jugador {

    private int id;
    private String nombre;
    private int golesMarcados;
    private int partidosJugados;

    // Constructor
    public Jugador(int id, String nombre, int golesMarcados, int partidosJugados) {
        this.id = id;
        this.nombre = nombre;
        this.golesMarcados = golesMarcados;
        this.partidosJugados = partidosJugados;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    // toString override
    @Override
    public String toString() {
        return "Jugador | " +
                "Nombre: " + nombre +
                ", Goles marcados: " + golesMarcados +
                ", Partidos jugados: " + partidosJugados +
                '|';
    }
}

