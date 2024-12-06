public class Club {
    private String nombre;
    private Jugador[] jugadores;
    private Entrenador entrenador;

    public Club(String nombre, Entrenador entrenador, int cantidadJugadores) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new Jugador[cantidadJugadores];
    }

    public void agregarJugador(Jugador jugador, int indice) {
        if (indice >= 0 && indice < jugadores.length) {
            jugadores[indice] = jugador;
        }
    }

    public double calcularEfectividadEquipo() {
        double totalEfectividad = 0;
        for (Jugador jugador : jugadores) {
            if (jugador != null) {
                totalEfectividad += jugador.calcularEfectividad();
            }
        }
        return totalEfectividad / jugadores.length;
    }

    public double calcularSueldoEntrenador() {
        double efectividadEquipo = calcularEfectividadEquipo();
        return entrenador.calcularSueldo(efectividadEquipo);
    }
}

