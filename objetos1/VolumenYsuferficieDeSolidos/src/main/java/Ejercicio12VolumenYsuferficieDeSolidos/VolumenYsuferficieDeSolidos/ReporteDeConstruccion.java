package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {

	private List<Pieza> piezas;
	
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>();
	}
	
	/*"Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro').
	  Retorna la suma de los volúmenes de todas las piezas hechas en ese material" */
	public double getVolumenDeMaterial(String nombreDeMaterial) {
		return this.piezas.stream()
				.mapToDouble(p -> p.getVolumen())
				.sum();
	}
	
	/*
	 "Recibe como parámetro un color (un string, por ejemplo 'Rojo').
	  Retorna la suma de las superficies externas de todas las piezas pintadas con ese color".*/
	public double getSuperficieDeColor(String unNombreDeColor) {
		return this.piezas.stream()
				.mapToDouble(s -> s.getSuperficie())
				.sum();
	}
}
