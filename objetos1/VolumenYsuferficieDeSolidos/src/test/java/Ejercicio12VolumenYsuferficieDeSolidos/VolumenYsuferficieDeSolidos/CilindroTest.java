package Ejercicio12VolumenYsuferficieDeSolidos.VolumenYsuferficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {
	
	
private Cilindro cilindroOne;
	
	@BeforeEach
	public void setUp() {
		this.cilindroOne = new Cilindro(2, 10,"Rojo","Madera");
	}
	@Test
	public void inicializacionTest() {
		Cilindro cilindroTwo = new Cilindro(5, 20,"Verde","Aluminio");
		assertEquals(5,cilindroTwo.getRadio());
		assertEquals(20,cilindroTwo.getAltura());
		assertEquals("Verde",cilindroTwo.getColor());
		assertEquals("Aluminio",cilindroTwo.getMaterial());
	} 
	
	/*
	 Volumen de un cilindro: π * radio ^2 * h.
	Superficie de un cilindro: 2 * π * radio  * h + 2 * π * radio ^2 
*/
	@Test
	public void volumenTest() {
		assertEquals(126,this.cilindroOne.getVolumen());
	}
	@Test
	public void superficieTest() {
		assertEquals(151,this.cilindroOne.getSuperficie());
	}

}
