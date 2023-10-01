package Ejercicio11Inversores.Inversores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	
	private Inversor inversor;
	
	@BeforeEach
	public void setUp() {
		inversor = new Inversor("Delfor");
	}
	@Test
	public void testInicializacion() {
		Inversor inversorOne = new Inversor("Juan");
		assertEquals("Juan",inversorOne.getNombre());
		assertTrue(inversorOne.getInversiones().isEmpty());
	}
	@Test
	public void testAgregarInversion() {
		Inversion invOne = new Accion("YouTube",2,1000);
		Inversion plazoOne = new PlazoFijo(LocalDate.of(2023, 9, 1),500,10);
		this.inversor.agregarInversion(plazoOne);
		assertTrue(this.inversor.getInversiones().contains(plazoOne));
		this.inversor.agregarInversion(invOne);
		assertTrue(this.inversor.getInversiones().contains(invOne));
	}
	
	@Test
	public void testValorActual() {
		Inversion invOne = new Accion("YouTube",2,1000);
		Inversion plazoOne = new PlazoFijo(LocalDate.of(2023, 9, 1),500,10);
		Inversion invTwo = new Accion("YouTube",3,100);
		Inversion plazoTwo = new PlazoFijo(LocalDate.of(2023, 9, 29),100,10);
		this.inversor.agregarInversion(invOne);
		assertEquals(2000,this.inversor.valorActual());
		this.inversor.agregarInversion(invTwo);
		assertEquals(2300,this.inversor.valorActual());
		this.inversor.agregarInversion(plazoOne);
		assertEquals(18250,this.inversor.valorActual());
		this.inversor.agregarInversion(plazoTwo);
		assertEquals(18360,this.inversor.valorActual());
		
	}
	

}
