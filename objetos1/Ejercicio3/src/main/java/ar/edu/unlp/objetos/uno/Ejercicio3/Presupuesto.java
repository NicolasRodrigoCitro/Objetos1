package ar.edu.unlp.objetos.uno.Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;

	public Presupuesto() {
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}

	public void agregarItem(Item unItem) {
		this.items.add(unItem);
	}

	public double calcularTotal() {
		double total=0;
		for (Item elemento: this.items) {
			total=elemento.costo();
		}
		return total;
	}

}
