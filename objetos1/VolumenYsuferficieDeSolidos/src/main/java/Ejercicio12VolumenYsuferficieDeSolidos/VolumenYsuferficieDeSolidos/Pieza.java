package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String material,String color) {
		this.color=color;
		this.material=material;
	}
	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}
	
	
	
	protected abstract double getVolumen();
	protected abstract double getSuperficie();
	
	
}
