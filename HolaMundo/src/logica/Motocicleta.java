package logica;

public class Motocicleta extends Vehiculo {
    public Motocicleta(double cilindraje, double peso, double tamanoTanque) {
        super(cilindraje, peso, tamanoTanque);
    }

    @Override
    public double calcularAutonomia() {
        return (8 * Math.pow(10, 4)) / (cilindraje + 2 * peso) * tamanoTanque;
    }
}