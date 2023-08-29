package ar.edu.unlp.objetos.uno.Ejercicio2Balanza;

import java.time.LocalDate;

public class Ticket {

	private LocalDate fecha;
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;

	public Ticket(int cantidadDeProductos,double precioTotal,double pesoTotal) {
		this.fecha= LocalDate.now();
		this.cantidadDeProductos= cantidadDeProductos;
		this.pesoTotal=pesoTotal;
		this.precioTotal=precioTotal;
	}
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}

}
