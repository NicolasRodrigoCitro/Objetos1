package Ejercicio15ReservasDeAlquiler.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {

	private Reserva reserva;

	@BeforeEach
	public void setUp() {
		DateLapse lapso = new DateLapse(LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 5));
		this.reserva = new Reserva(lapso, 1000);
	}
	
	
	
	
	@Test 
	public void getEstaReservadoTest() {
		assertTrue(this.reserva.getEstaReservado(LocalDate.of(2023, 10, 1)));
		assertTrue(this.reserva.getEstaReservado(LocalDate.of(2023, 10, 3)));
		assertTrue(this.reserva.getEstaReservado(LocalDate.of(2023, 10, 5)));
		
		assertFalse(this.reserva.getEstaReservado(LocalDate.of(2023, 9, 30)));
		assertFalse(this.reserva.getEstaReservado(LocalDate.of(2023, 10, 6)));
	}
	
	
	

}
