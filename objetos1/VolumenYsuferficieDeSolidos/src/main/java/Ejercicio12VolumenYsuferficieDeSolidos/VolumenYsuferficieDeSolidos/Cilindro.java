package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

public class Cilindro extends Pieza{

	private int radio;
	private int altura;
	
	
	
	
	
	public Cilindro(int radio, int altura, String color, String material) {
		super(color, material);
		this.radio = radio;
		this.altura = altura;
	}
	public int getRadio() {
		return radio;
	}
	public int getAltura() {
		return altura;
	}
	
	
	/*
	 Volumen de un cilindro: π * radio ^2 * h.
	Superficie de un cilindro: 2 * π * radio  * h + 2 * π * radio ^2 
*/
	
	@Override
	public double getVolumen() {
		return Math.round(Math.PI * Math.pow(this.getRadio(), 2) * this.getAltura()) ;
	}
	@Override
	public double getSuperficie() {
		return  Math.round(2 * Math.PI * this.getRadio() * this.getAltura() + 2 * Math.PI * Math.pow(this.getRadio(), 2));
	}
	
	
	
	
}
