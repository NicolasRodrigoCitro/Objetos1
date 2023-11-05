package Ejercicio15ReservasDeAlquiler.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {

	private Reserva reserva;

	private Propiedad propiedad;
	@BeforeEach
	public void setUp() {
		DateLapse lapso1 = new DateLapse(LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 5));
		DateLapse lapso2 = new DateLapse(LocalDate.of(2023, 11, 15), LocalDate.of(2023, 11, 20));
		this.reserva = new Reserva(lapso1, 1000);
		
		
		this.propiedad= new Propiedad("San Carlos","En el monte","1234",1000);
		this.propiedad.hacerReserva(lapso1);
		this.propiedad.hacerReserva(lapso2);
	}
	
	
	
	
	@Test 
	public void getEstaReservadoTest() {
		assertFalse(this.reserva.getEstaReservadoAntesDe(LocalDate.of(2023, 10, 1)));
		assertFalse(this.reserva.getEstaReservadoAntesDe(LocalDate.of(2023, 10, 3)));
		assertFalse(this.reserva.getEstaReservadoAntesDe(LocalDate.of(2023, 10, 5)));
		
		assertTrue(this.reserva.getEstaReservadoAntesDe(LocalDate.of(2023, 9, 30)));
		
		assertFalse(this.reserva.getEstaReservadoAntesDe(LocalDate.of(2023, 10, 6)));
	}
	@Test
	public void eliminarReservaTest() {
		// List<Reserva> unReservas = this.propiedad.obtenerReservas();
		 
		 Reserva reservaElimnar = this.propiedad.obtenerReservas().get(this.propiedad.obtenerReservas().size()-1);//lapso2
		 this.propiedad.eliminarReserva(reservaElimnar);
		 
		 assertFalse(this.propiedad.obtenerReservas().contains(reservaElimnar));
		 //contemplar que está hecho con localDate.now, y el dia de la fecha es 29/10/2023
		 // paso a eliminar un caso que no puedo
		 Reserva reservaElimnar2 = this.propiedad.obtenerReservas().get(this.propiedad.obtenerReservas().size()-1);//lapso2
		 this.propiedad.eliminarReserva(reservaElimnar2);
		 assertEquals(1,this.propiedad.obtenerReservas().size());
		 assertTrue(this.propiedad.obtenerReservas().contains(reservaElimnar2));
		 
	}
	
	
	

}
