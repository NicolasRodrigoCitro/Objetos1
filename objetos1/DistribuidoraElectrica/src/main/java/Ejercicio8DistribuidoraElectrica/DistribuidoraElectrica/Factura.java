package Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.fecha = LocalDate.now();
		this.montoEnergiaActiva=montoEnergiaActiva;
		this.descuento=descuento;
		this.usuario= usuario;
	}
	
	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}
	
	public Usuario usuario() {
		return this.usuario;
	}
	
	public LocalDate fecha() {
		return this.fecha;
	}
	
	public double descuento() {
		return this.descuento;
	}
	
	

}
