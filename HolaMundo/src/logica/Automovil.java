package logica;

public class Automovil extends Vehiculo {
    public Automovil(double cilindraje, double peso, double tamanoTanque) {
        super(cilindraje, peso, tamanoTanque);
    }
    public double calcularAutonomia() {
        return (15 * Math.pow(10, 4)) / (cilindraje + peso) * tamanoTanque;
    }
}