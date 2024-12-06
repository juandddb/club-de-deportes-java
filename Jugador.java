public class Jugador {
    private String nombre;
    private int partidosJugados;
    private int goles;

    public Jugador(String nombre, int partidosJugados, int goles) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public double calcularEfectividad() {
        if (partidosJugados == 0) {
            return 0.0;
        }
        return (double) goles / partidosJugados;
    }
}

