package ar.edu.unlp.objetos.uno.Ejercicio2Balanza;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;

	public double getPrecio() {
		return (this.getPeso() * this.getPrecioPorKilo());
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public double getPeso() {
		return this.peso;
	}

	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}

	public void setPeso(double peso) {
		this.peso = peso;

	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;

	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;

	}

}
