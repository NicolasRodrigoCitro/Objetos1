package ar.edu.unlp.info.oo1.ej8_distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Consumo;
import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Distribuidora;
import Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica.Usuario;

public class DistribuidoraTestVersionPropia {

	
	private Distribuidora distribuidora, redCompleta;
	private Usuario mercedes,pablo,frida;
	private Consumo alto,medio,bajo;
	@BeforeEach
	public void setUp() {
		this.distribuidora = new Distribuidora(50d);
		
		
		this.redCompleta = new Distribuidora(10d);

		mercedes = new Usuario("Mercedes", "Calle Sosa 99, San Miguel de Tucuman");
		pablo = new Usuario("Pablo", "Calle Picasso 23, Paris");
		frida = new Usuario("Frida", "Calle Kahlo 54, Mexico DF");

		alto = new Consumo(LocalDate.of(2023, 9,27),100,50);//0,894
		bajo = new Consumo(LocalDate.of(2023, 9, 26),100,100);//0,707
		medio = new Consumo(LocalDate.of(2023, 9, 25),100,75);//0,8

		redCompleta.agregarUsuario(mercedes);
		redCompleta.agregarUsuario(pablo);
		redCompleta.agregarUsuario(frida);
	}
	
	
	@Test
	public void testConstructor() {
		assertEquals(50d, this.distribuidora.getPrecioKW());
		assertEquals(0d, this.distribuidora.consumoTotalActiva());
		assertTrue(this.distribuidora.facturar().isEmpty());
		assertTrue(this.distribuidora.getUsuarios().isEmpty());
	}
	
	@Test
	public void testAgregarUsuario() {
		Usuario delfor = new Usuario("Delfor","Avenida siempre viva 1234");
		this.distribuidora.agregarUsuario(delfor);
		assertTrue(this.distribuidora.getUsuarios().contains(delfor));
		assertEquals(1, this.distribuidora.getUsuarios().size());
	}
	
	@Test 
	public void testConsumoTotalDeLaRed() {
		assertEquals(0,this.redCompleta.consumoTotalActiva());
		this.frida.agregarMedicion(medio);
		this.pablo.agregarMedicion(bajo);
		this.mercedes.agregarMedicion(alto);
		assertEquals(300,this.redCompleta.consumoTotalActiva());
	}
	
}
