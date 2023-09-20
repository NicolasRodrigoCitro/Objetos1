package Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica;



import java.time.LocalDate;

public class Consumo {
	
	private LocalDate fecha;
	private double consumoDeEnergiaActiva;
	private double consumoDeEnergiaReactiva;
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getConsumoDeEnergiaActiva() {
		return this.consumoDeEnergiaActiva;
	}
	public double costoEnBaseA(double precioKWh) {
		return precioKWh * this.consumoDeEnergiaActiva;
	}
	
	public double factorDePotencia() {
		return this.consumoDeEnergiaActiva /Math.sqrt
				(Math.pow(this.consumoDeEnergiaActiva,2) +
				 Math.pow(this.consumoDeEnergiaReactiva,2));
	}
	

}
