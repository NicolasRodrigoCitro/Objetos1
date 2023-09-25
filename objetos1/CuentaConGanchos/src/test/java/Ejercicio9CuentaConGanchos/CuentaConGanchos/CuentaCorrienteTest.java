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
	//terminar de controlar si extraigo un monto que sumera mi saldo
	//pero no del todo y extrae parte del saldo y parte del descubierto
	//preguntar si tengo que tener una copia del descubierto fijo, otorgado por el banco
	
	@Test
	public void TestExtraer() {
		assertTrue(cuenta.extraer(400));
		assertEquals(100,cuenta.getSaldo());
		assertTrue(cuenta.extraer(200));
		assertEquals(0,cuenta.getDescubierto());
		assertFalse(cuenta.extraer(10));
	}

}
