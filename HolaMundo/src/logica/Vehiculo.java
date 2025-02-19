package logica;

public abstract class Vehiculo {
    protected double cilindraje;
    protected double peso;
    protected double tamanoTanque;

    public Vehiculo(double cilindraje, double peso, double tamanoTanque) {
        this.cilindraje = cilindraje;
        this.peso = peso;
        this.tamanoTanque = tamanoTanque;
    }

    public abstract double calcularAutonomia();
}