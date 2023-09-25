package Ejercicio9CuentaConGanchos.CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {

	private CajaDeAhorro caja;
	
	@BeforeEach
	public void setUp() {
		caja = new CajaDeAhorro();
		caja.depositar(500);
	}
	@Test
	public void TestDepositar() {
		caja.depositar(50);
		assertEquals(550,caja.getSaldo());
	}
	
	
	@Test
	public void TestExtraer() {
		assertTrue(caja.extraer(400));
		assertEquals(92,caja.getSaldo());
		assertFalse(caja.extraer(100));
	}
	
	
}
