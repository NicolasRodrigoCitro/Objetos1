package ar.edu.unlp.objetos.uno.figurasYCuerpos;

public class Cuerpo3D {

	private double altura;
	private Cara caraBasal;
	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Cara unCara) {
		this.caraBasal=unCara;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.getAltura();
	}
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.getAltura();
	}
	
	
}
