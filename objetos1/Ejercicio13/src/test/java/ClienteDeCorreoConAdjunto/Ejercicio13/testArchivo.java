package ClienteDeCorreoConAdjunto.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testArchivo {

	private Archivo archivo;
	private Archivo archivoVacio;
	
	@BeforeEach
	public void setUp() {
		String nombre = "Nicolas";
		String nombreVacio = "";
		this.archivo = new Archivo(nombre);
		this.archivoVacio = new Archivo(nombreVacio);
	}
	
	@Test
	public void testConNombre() {
		assertEquals(7,this.archivo.tamaño());
	}
	@Test
	public void testSinNombre() {
		assertEquals(0,this.archivoVacio.tamaño());
	}
	
}
