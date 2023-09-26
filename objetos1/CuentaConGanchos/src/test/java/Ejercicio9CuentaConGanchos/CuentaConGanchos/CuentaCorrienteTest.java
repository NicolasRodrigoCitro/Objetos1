package Ejercicio9CuentaConGanchos.CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	
	private CuentaCorriente cuenta;
	@BeforeEach
	public void setUp() {
		cuenta = new CuentaCorriente();
		cuenta.depositar(500);
		cuenta.setDescubierto(200);
	}
	@Test
	public void TestDepositar() {
		cuenta.depositar(50);
		assertEquals(550,cuenta.getSaldo());
	}
	
	
	@Test
	public void TestExtraer() {
		assertTrue(cuenta.extraer(400));
		assertEquals(100,cuenta.getSaldo());
		assertTrue(cuenta.extraer(200));
		assertEquals(-100,cuenta.getSaldo());
		assertFalse(cuenta.extraer(200));
	}

}
