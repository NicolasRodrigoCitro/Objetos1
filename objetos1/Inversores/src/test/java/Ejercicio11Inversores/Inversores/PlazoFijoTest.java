package Ejercicio11Inversores.Inversores;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	
private PlazoFijo plazo;
	
	@BeforeEach
	public void setUp() {
		plazo = new PlazoFijo(LocalDate.now(),3000,10);
	}
	@Test
	public void testInicializacion() {
		PlazoFijo plazoOne = new PlazoFijo(LocalDate.now(),500,10);
		assertEquals(LocalDate.now(),plazoOne.getFechaDeConstitucion());
		assertEquals(500,plazoOne.getMontoDepositado());
		assertEquals(10,plazoOne.getPorcentajeDeInteresDiario());
	}
	
	@Test
	public void testValorActual() {
		//cantidadDias * ((montoDepositado * porcentajeDeInteresDiario / 100) + montoDepositado)
		PlazoFijo plazoOne = new PlazoFijo(LocalDate.of(2023, 9, 1),500,10);
		assertEquals(15950, plazoOne.valorActual());
	}
	

}
