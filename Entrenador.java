public class Entrenador {
    private String nombre;
    private double sueldoBase;

    public Entrenador(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double calcularSueldo(double efectividadEquipo) {
        return sueldoBase + (efectividadEquipo * 5000);
    }
}

