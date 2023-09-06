package ar.edu.unlp.objetos.uno.Ejercicio3;

public class Item {

	private String detalle;
	private int cantidad;
	private double costoUnitario;

	public Item(String detalle, double costoUnitario, int cantidad) {
		this.detalle=detalle;
		this.costoUnitario=costoUnitario;
		this.cantidad=cantidad;
	}

	public double costo() {
		return (this.cantidad * this.costoUnitario);
	}

}
