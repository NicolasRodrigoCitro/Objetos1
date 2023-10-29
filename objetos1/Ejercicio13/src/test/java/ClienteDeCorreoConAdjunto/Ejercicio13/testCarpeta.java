package ClienteDeCorreoConAdjunto.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCarpeta {
	
	private Carpeta carpetaConEmail;
	private Carpeta carpetaSinEmail;
	private Email email;
	private Email email2;
	
	@BeforeEach
	public void setUp() {
		this.carpetaConEmail = new Carpeta("CarpetaConEmail");
		this.carpetaSinEmail = new Carpeta("CarpetaSinEmail");
		
		this.email = new Email("Habia un vez","Hola mundo");
		this.email2 = new Email("Dia Soleado","En un mes de octubre");
		
		this.carpetaConEmail.agregarEmail(email);
		this.carpetaConEmail.agregarEmail(email2);
	}
	
	
	@Test
	public void testBucarEmailExistente() {
		String titulo= "Habia un vez";
		String cuerpo= "Hola mundo";
		//Comprueba si existe un email con un titlo o cuerpo igual al pasado por paramentro
		assertEquals(this.email,this.carpetaConEmail.buscar(titulo));
		assertEquals(this.email,this.carpetaConEmail.buscar(cuerpo));
		String texto = "En un mes de octubre";
		assertEquals(this.email2,this.carpetaConEmail.buscar("mes"));
	}
	
	@Test
	public void testBuscarEmailInexistente() {
		String texto = "asd";
		assertNull(this.carpetaSinEmail.buscar(texto));
	}
	
	@Test
	public void testTamañoConEmail() {
		assertEquals(68,this.carpetaConEmail.tamaño());
	}
	@Test
	public void testTamañoSinEmail() {
		assertEquals(15,this.carpetaSinEmail.tamaño());
	}

}
