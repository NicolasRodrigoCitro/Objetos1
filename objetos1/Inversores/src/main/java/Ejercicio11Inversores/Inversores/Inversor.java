package Ejercicio11Inversores.Inversores;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	/*Consultas ¿El MapToDouble devuelve un optional, si la coleccion está vacia?*/

	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre=nombre;
		this.inversiones = new ArrayList<>();
	}
	public String getNombre() {
		return this.nombre;
	}
	public void agregarInversion(Inversion unInversion) {
		this.inversiones.add(unInversion);
	}
	public List<Inversion>getInversiones(){
		return new ArrayList<Inversion>(this.inversiones);
	}

	public double valorActual() {
		return this.inversiones.stream()
				.mapToDouble( i-> i.valorActual())
				.sum();
	}
}
