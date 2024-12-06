public class Main {
    public static void main(String[] args) {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Juan Pérez", 20, 10);
        Jugador jugador2 = new Jugador("Carlos García", 15, 7);
        Jugador jugador3 = new Jugador("Lucas Fernández", 25, 12);

        // Crear entrenador
        Entrenador entrenador = new Entrenador("Pedro Martínez", 30000);

        // Crear club y agregar jugadores
        Club club = new Club("Club Deportivo", entrenador, 3);
        club.agregarJugador(jugador1, 0);
        club.agregarJugador(jugador2, 1);
        club.agregarJugador(jugador3, 2);

        // Calcular efectividad del equipo y sueldo del entrenador
        double efectividadEquipo = club.calcularEfectividadEquipo();
        double sueldoEntrenador = club.calcularSueldoEntrenador();

        System.out.println("Efectividad del equipo: " + efectividadEquipo);
        System.out.println("Sueldo del entrenador: $" + sueldoEntrenador);
    }
}

