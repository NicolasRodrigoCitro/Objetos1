package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaRectangularTest {

	

	private PrismaRectangular prismaOne;
	
	@BeforeEach
	public void setUp() {
		this.prismaOne = new PrismaRectangular(4,2,6,"Rojo","Madera");
	}
	@Test
	public void inicializacionTest() {
		PrismaRectangular prismaTwo = new PrismaRectangular(4,5,8,"Verde","Aluminio");
		assertEquals(4,prismaTwo.getLadoMayor());
		assertEquals(5,prismaTwo.getLadoMenor());
		assertEquals(8,prismaTwo.getAltura());
		assertEquals("Verde",prismaTwo.getColor());
		assertEquals("Aluminio",prismaTwo.getMaterial());
	} 
	
	/*
	 Volumen del prisma: ladoMayor * ladoMenor * altura
	Superficie del prisma: 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura)
	 */
	@Test
	public void volumenTest() {
		assertEquals(48,this.prismaOne.getVolumen());
	}
	@Test
	public void superficieTest() {
		assertEquals(88,this.prismaOne.getSuperficie());
	}
	
}
