package ClienteDeCorreoConAdjunto.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testEmail {
	
	private Archivo archivo;
	private Email email;
	@BeforeEach
	public void setUp() {
		this.archivo = new Archivo("Nicolas");
		String titulo= "Habia un vez";
		String cuerpo= "Hola mundo";
		this.email = new Email(titulo,cuerpo);
		this.email.agregarArchivo(archivo);
	}

	@Test
	public void testExisteTexto() {
		String texto1= "Habia un vez";
		String texto2= "Hola mundo";
		assertTrue(this.email.existeTexto(texto1));
		assertTrue(this.email.existeTexto(texto2));
	}
	@Test
	public void testNoExisteTexto() {
		String texto = "";
		assertFalse(this.email.existeTexto(texto));
	}
	@Test
	public void testTamaño() {
		assertEquals(29,this.email.tamaño());
	}
}
