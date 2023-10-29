package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsferaTest {

	private Esfera esferaOne;
	
	@BeforeEach
	public void setUp() {
		this.esferaOne = new Esfera(2,"Rojo","Madera");
	}
	@Test
	public void inicializacionTest() {
		Esfera esferaTwo = new Esfera(8,"Verde","Aluminio");
		assertEquals(8,esferaTwo.getRadio());
		assertEquals("Verde",esferaTwo.getColor());
		assertEquals("Aluminio",esferaTwo.getMaterial());
	} 
	
	/**
	 Volumen de una esfera: ⁴⁄₃ * π * radio ³.
	Superficie de una esfera: 4 * π * radio 2
	 */
	@Test
	public void volumenTest() {
		assertEquals(34,this.esferaOne.getVolumen());
	}
	@Test
	public void superficieTest() {
		assertEquals(50,this.esferaOne.getSuperficie());
	}
	
}
