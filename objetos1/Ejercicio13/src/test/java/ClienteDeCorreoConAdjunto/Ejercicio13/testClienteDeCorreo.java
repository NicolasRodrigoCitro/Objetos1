package ClienteDeCorreoConAdjunto.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testClienteDeCorreo {


	private ClienteDeCorreo clienteCorreoSinEmail;
	private ClienteDeCorreo clienteConCarpetas;
	private Email email,email2;
	private Carpeta carpeta;
	
	@BeforeEach
	public void setUp() {
		this.clienteConCarpetas = new ClienteDeCorreo();
		this.clienteCorreoSinEmail = new ClienteDeCorreo();
		
		this.email = new Email("Habia un vez","Hola mundo");
		this.email2 = new Email("Dia Soleado","En un mes de octubre");

		
		this.carpeta = new Carpeta("Documents");
		this.clienteConCarpetas.agregarCarpeta(this.carpeta);
		this.clienteConCarpetas.recibir(email);
		this.clienteConCarpetas.recibir(email2);
		
		
	}
	
	@Test
	public void testGetCarpeta() {
		assertEquals(this.carpeta, this.clienteConCarpetas.getCarpeta("Documents"));
		assertNull(this.clienteConCarpetas.getCarpeta(""));
	}
	
	@Test
	public void testMover() {
		//Me traigo las carpetas
		Carpeta origen = this.clienteConCarpetas.getCarpeta("inBox");
		Carpeta destino = this.clienteConCarpetas.getCarpeta("Documents");
		//muevo el email
		this.clienteConCarpetas.mover(email, origen, destino);
		
		assertEquals(email, destino.buscar(email.getCuerpo()));
		assertNotEquals(email, origen.buscar(email.getCuerpo()));
	}
	
	@Test
	public void testBuscarEmailExistente() {
		assertEquals(email, this.clienteConCarpetas.buscar(email.getTitulo()));
		assertEquals(email, this.clienteConCarpetas.buscar(email.getCuerpo()));
	}
	@Test
	public void testBuscarEmailInexistente() {
		assertNull(this.clienteConCarpetas.buscar(""));
	}

	@Test
	public void testEspacioOcupado() {
		assertEquals(67,this.clienteConCarpetas.espacioOcupado());
		assertEquals(5,this.clienteCorreoSinEmail.espacioOcupado());
	}
}
