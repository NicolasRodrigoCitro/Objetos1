package Ejercicio17LlamadasTelefonicas.Ejercicio17LlamadasTelefonicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	private Sistema sistema;
	private Cliente cliente;
	
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Sistema();
		this.sistema.getClientes().contains(sistema);
		this.cliente = new PersonaFisica("Pepe","1234","99999999");
	}

	
	@Test
	public void darDeAltaCliente() {
		Cliente cliente1 = new PersonaFisica("Nicolas","31Bis y 473","40915983");
		this.sistema.darAltaCliente(cliente1);
		assertTrue(this.sistema.getClientes().contains(cliente1));
		TipoPersonaJuridica tipo = new TipoPersonaJuridica("Empresa");
		Cliente cliente2 = new PersonaJuridica("Rocio","31Bis y 473","35888999","235888999",tipo);
		this.sistema.darAltaCliente(cliente2);
		assertTrue(this.sistema.getClientes().contains(cliente2));
	}
	
	@Test
	public void facturarTest() {
		Factura factura = this.sistema.generarFactura(this.cliente,LocalDate.of(2023,10, 1),LocalDate.of(2023, 10, 31));
		assertEquals(1000,factura.getMonto());
		assertEquals(LocalDate.of(2023,10, 1),factura.getInicioPeriodo());
		assertEquals(LocalDate.of(2023, 10, 31),factura.getFinPeriodo());
		assertEquals(LocalDate.now(),factura.getFechaYhora());
		assertTrue(this.cliente.getFacturas().contains(factura));
	}
	
	
}
