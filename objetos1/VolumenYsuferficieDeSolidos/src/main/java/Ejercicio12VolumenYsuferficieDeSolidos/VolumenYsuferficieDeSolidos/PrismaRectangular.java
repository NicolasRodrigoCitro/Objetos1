package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	
	
	
	public PrismaRectangular(int ladoMayor, int ladoMenor, int altura, String color, String material) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	public int getLadoMayor() {
		return ladoMayor;
	}
	public int getLadoMenor() {
		return ladoMenor;
	}
	public int getAltura() {
		return altura;
	}
	
	/*
	 Volumen del prisma: ladoMayor * ladoMenor * altura
	Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)
	 */
	
	@Override
	public double getVolumen() {
		return this.getLadoMayor() * this.getLadoMenor() * this.getAltura();
	}
	@Override
	public double getSuperficie() {
		return 2 * (this.getLadoMayor() * this.getLadoMenor() +
				this.getLadoMayor() * this.getAltura() + 
				this.getLadoMenor() * this.getAltura()) ; 
	}
	
	
	
	
	
	
}
