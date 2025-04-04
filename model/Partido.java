package model;
import java.util.List;

public class Partido {

    private List<String> equipoA;
    private List<String> equipoB;
    private int golesEquipoA;
    private int golesEquipoB;

    //Constructor
    public Partido(List<String> equipoA, List<String> equipoB, int golesEquipoA, int golesEquipoB){
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.golesEquipoA = 0;
        this.golesEquipoB = 0;
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
