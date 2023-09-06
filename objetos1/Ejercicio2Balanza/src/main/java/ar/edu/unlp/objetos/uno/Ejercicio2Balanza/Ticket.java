package ar.edu.unlp.objetos.uno.Ejercicio2Balanza;

import java.time.LocalDate;
import java.util.List;

public class Ticket {

	private LocalDate fecha;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;

	public Ticket(int cantidadDeProductos,double precioTotal,double pesoTotal, List<Producto> productos) {
		this.fecha= LocalDate.now();
		this.pesoTotal=pesoTotal;
		this.precioTotal=precioTotal;
		this.productos=productos;
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
		return this.productos.size();
	}
	public LocalDate getFecha() {
		return this.fecha;
	}

}
