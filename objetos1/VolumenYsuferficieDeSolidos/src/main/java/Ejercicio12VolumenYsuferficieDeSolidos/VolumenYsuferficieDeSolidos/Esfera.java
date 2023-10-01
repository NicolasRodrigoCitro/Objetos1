package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

public class Esfera extends Pieza{
	private int radio;
	
	

	public Esfera(int radio, String color, String material) {
		super(material, color);
		this.radio = radio;
	}



	public int getRadio() {
		return radio;
	}

/**
 Volumen de una esfera: ⁴⁄₃ * π * radio ³.
Superficie de una esfera: 4 * π * radio 2
 */

	@Override
	public double getVolumen() {
		return 4/3 * Math.PI * Math.pow(this.getRadio(), 3);
	}

	@Override
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	
	
}
