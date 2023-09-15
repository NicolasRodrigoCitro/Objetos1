package ar.edu.unlp.objetos.uno.figurasYCuerpos;

public class Circulo implements Cara{

	private double radio;

	public double getDiametro() {
		return this.radio * 2;
	}

	public void setDiametro(double unDimetro) {
		this.setRadio(unDimetro/2);
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}

	public double getArea() {
		return Math.PI * (this.getRadio() * this.getRadio());
	}

}
