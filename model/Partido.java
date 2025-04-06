package model;
import java.util.List;

public class Partido {

    private List<Jugador> equipoA;
    private List<Jugador> equipoB;
    private int golesEquipoA;
    private int golesEquipoB;

    //Constructor
    public Partido(List<Jugador> equipoA, List<Jugador> equipoB, int golesEquipoA, int golesEquipoB){
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.golesEquipoA = golesEquipoA;
        this.golesEquipoB = golesEquipoB;
    }

    public int getGolesEquipoA() {
        return golesEquipoA;
    }

    public void setGolesEquipoA(int golesEquipoA) {
        this.golesEquipoA = golesEquipoA;
    }

    public int getGolesEquipoB() {
        return golesEquipoB;
    }

    public void setGolesEquipoB(int golesEquipoB) {
        this.golesEquipoB = golesEquipoB;
    }

    public List<Jugador> getEquipoA() {
        return equipoA;
    }

    public List<Jugador> getEquipoB() {
        return equipoB;
    }

    //Registro goles
    public void registrarGoles(int golesA, int golesB) {
        this.golesEquipoA = golesA;
        this.golesEquipoB = golesB;
    }

    //Determinar equipo ganador
    public String Ganador(){
        if(golesEquipoA > golesEquipoB){
            return "Equipo A";
        } else {
            return "Equipo B";
        }
    }

    //Mostrar detalles del partido
    public void Detalles(){
        System.out.println("Equipo A: "+equipoA);
        System.out.println("Equipo B: "+equipoB);
        System.out.println("Goles equipo A: "+ golesEquipoA);
        System.out.println("Goles equipo A: "+golesEquipoB);
        System.out.println("Ganador: " + Ganador());
    }

}
