package Ejercicio11Inversores.Inversores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccionTest {
	
	private Accion accion;
	
	@BeforeEach
	public void setUp() {
		accion = new Accion("Google",3,500);
	}
	@Test
	public void testInicializacion() {
		Accion accionOne = new Accion("YouTube",2,1000);
		assertEquals(2,accionOne.getCantidad());
		assertEquals("YouTube",accionOne.getNombre());
		assertEquals(1000,accionOne.getValorUnitario());
	}
	
	@Test
	public void testValorActual() {
		//valorUnitario * cantidad
		assertEquals(1500,this.accion.valorActual());
	}

}
