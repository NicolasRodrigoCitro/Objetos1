package Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {

	private LocalDate fecha;
	private double consumoDeEnergiaActiva;
	private double consumoDeEnergiaReactiva;

	public Consumo(LocalDate fecha, double consumoDeEnergiaActiva, double consumoDeEnergiaReactiva) {
		this.fecha=fecha;
		this.consumoDeEnergiaActiva=consumoDeEnergiaActiva;
		this.consumoDeEnergiaReactiva=consumoDeEnergiaReactiva;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setConsumoDeEnergiaActiva(double consumoDeEnergiaActiva) {
		this.consumoDeEnergiaActiva=consumoDeEnergiaActiva;
	}

	public void setConsumoDeEnergiaReactiva(double consumoDeEnergiaReactiva) {
		this.consumoDeEnergiaReactiva=consumoDeEnergiaReactiva;
	}

	public double getConsumoDeEnergiaActiva() {
		return this.consumoDeEnergiaActiva;
	}
	public double getConsumoDeEnergiaReactiva() {
		return this.consumoDeEnergiaReactiva;
	}

	public double costoEnBaseA(double precioKWh) {
		return precioKWh * this.consumoDeEnergiaActiva;
	}

	public double factorDePotencia() {
		return this.consumoDeEnergiaActiva
		/ Math.sqrt(Math.pow(this.consumoDeEnergiaActiva, 2) +
		Math.pow(this.consumoDeEnergiaReactiva, 2));
	}

}
