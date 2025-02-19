package Consola;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import logica.Automovil;
import logica.Motocicleta;
import logica.Vehiculo;

public class Principal {
    private Scanner sc;
    private BufferedReader br;

    public Principal() {
        this.sc = new Scanner(System.in);
        this.br = new BufferedReader(new InputStreamReader(System.in));

        Vehiculo v;

        v = new Automovil(this.leerDatoScanner(), this.leerDatoScanner(), this.leerDatoScanner());
        System.out.println("LA Autonomía del automóvil: " + v.calcularAutonomia());
        v = new Motocicleta(this.leerDatoBufferedReader(), this.leerDatoBufferedReader(), this.leerDatoBufferedReader());
        System.out.println("LA Autonomía de la motocicleta: " + v.calcularAutonomia());
    }

    public double leerDatoScanner() {
        System.out.println("Ingrese un número con Scanner:");
        return this.sc.nextDouble();
    }

    public double leerDatoBufferedReader() {
        double dato = 0;
        try {
            System.out.println("Ingrese un número con BufferedReader:");
            String linea = this.br.readLine();
            dato = Double.parseDouble(linea);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dato;
    }

    public static void main(String[] args) {
        new Principal();
    }
}