package ar.edu.unlp.objetos.uno.figurasYCuerpos;

public class Cuadrado implements Cara {
	private double lado;
	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	public double getArea() {
		return this.lado * this.lado;
	}
	public double getPerimetro() {
		return this.lado * 4;
	}

}
