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
	public double montoTotal() {
		return (this.getMontoEnergiaActiva() - (this.getMontoEnergiaActiva()*this.getDescuento()/100));
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	

}
