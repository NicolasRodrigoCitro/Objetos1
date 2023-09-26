package ar.edu.unlp.info.oo1.ej8_distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Consumo;
import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Distribuidora;
import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Usuario;

public class DistribuidoraTest {

	private Distribuidora distribuidora, redCompleta;
	private Usuario mercedes, pablo, frida;
	private Consumo alto, medio, bajo;

	@BeforeEach
	public void setUp() {
		this.distribuidora = new Distribuidora(50d);
		this.redCompleta = new Distribuidora(10d);

		mercedes = new Usuario("Mercedes", "Calle Sosa 99, San Miguel de Tucuman");
		pablo = new Usuario("Pablo", "Calle Picasso 23, Paris");
		frida = new Usuario("Frida", "Calle Kahlo 54, Mexico DF");

		alto = new Consumo(LocalDate.of(2021, 6, 8), 5000, 2500);
		bajo = new Consumo(LocalDate.of(2021, 6, 10), 300, 300);
		medio = new Consumo(LocalDate.of(2021, 6, 15), 100, 800);

		redCompleta.agregarUsuario(mercedes);
		redCompleta.agregarUsuario(pablo);
		redCompleta.agregarUsuario(frida);
	}

	/**
	 * Pedido en las tareas del ejercicio, puede verse como iniciar el sistema.
	 */
	@Test
	public void testConstructor() {
		assertEquals(50d, this.distribuidora.getPrecioKW());
		assertEquals(0d, this.distribuidora.consumoTotalActiva());
		assertTrue(this.distribuidora.getUsuarios().isEmpty());
	}

	/**
	 * Pedido en las tareas del ejercicio.
	 */
	@Test
	public void testAgregarUsuario() {
		Usuario usuario = new Usuario("Nombre", "Calle 88, La Plata");
		this.distribuidora.agregarUsuario(usuario);
		assertEquals(1, this.distribuidora.getUsuarios().size());
		assertTrue(this.distribuidora.getUsuarios().contains(usuario));
	}

	/**
	 * Pedido en las tareas del ejercicio.
	 */
	@Test
	public void testConsumoTotalDeLaRed() {
		this.mercedes.agregarMedicion(medio);
		this.pablo.agregarMedicion(bajo);
		this.frida.agregarMedicion(alto);
		assertEquals(5400, this.redCompleta.consumoTotalActiva(), 0.001d);
		Consumo otro = new Consumo(LocalDate.of(2021, 7, 15), 100, 800);
		this.frida.agregarMedicion(otro);
		assertEquals(500, this.redCompleta.consumoTotalActiva(), 0.001d);
	}

	@Test
	public void testFacturar() {
		assertEquals(3, this.redCompleta.facturar().size());
		assertTrue(this.distribuidora.facturar().isEmpty());
	}

	@Test
	public void testSetPrecioKW() {
		this.distribuidora.setPrecioKW(200d);
		assertEquals(200d, this.distribuidora.getPrecioKW());
	}
}