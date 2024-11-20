package ejercicioTres;

public class Apartamento extends Vivienda {

    @Override
    public void calcularArriendo() {
        double total = numeroHabitaciones + valorServicios;
    }
}
