package ar.edu.unlp.objetos.uno.Ejercicio3;

public class Item {

	private String detalle;
	private int cantidad;
	private double costoUnitario;

	public Item() {

	}

	public double costo() {
		return this.cantidad * this.costoUnitario;
	}

}
