package Ejercicio15ReservasDeAlquiler.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {

	
	private Sistema sistema;
	private Usuario usuario;
	
	private Propiedad propiedadNoDisponible;
	private Propiedad propiedadDisponible;
	
	
	
	//private Reserva reserva;
	 //this.propiedadNoDisponible = new Propiedad("San Carlos","En el monte","1234",1000);
	 //this.propiedadDisponible = new Propiedad("La Luicia","En Los pinos","1515",5000);
	//this.reserva = new Reserva (lapso,1000);
	@BeforeEach
	public void setUp() {
		 this.sistema = new Sistema();
		 
		 this.usuario = new Usuario("Nicolas","31Bis y 473","40915983");
		 
		 this.propiedadNoDisponible =this.sistema.registrarPropiedad("San Carlos","En el monte","1234",1000, usuario);
		 this.propiedadDisponible=this.sistema.registrarPropiedad("La Luicia","En Los pinos","1515",5000, usuario);
		
		 DateLapse lapso = new DateLapse(LocalDate.of(2023, 10, 1),LocalDate.of(2023, 10, 5));
		 
		 this.usuario.hacerReserva(propiedadNoDisponible, lapso);
		 
		 
	
	}
	
	@Test
	public void buscarPropeidadesDisponiblesTest() {
		DateLapse afueraRango = new DateLapse(LocalDate.of(2023, 10, 6),LocalDate.of(2023, 10, 8));
		DateLapse adentroRango = new DateLapse(LocalDate.of(2023, 10, 1),LocalDate.of(2023, 10, 5));
		DateLapse extremoIzquierdoDentro = new DateLapse(LocalDate.of(2023, 10, 1),LocalDate.of(2023, 10, 6));
		DateLapse extremoDerechoDentro = new DateLapse(LocalDate.of(2023, 9, 29),LocalDate.of(2023, 10, 5));
		//a fuera del rango
		assertTrue(this.sistema.buscarPropiedadesDisponibles(afueraRango)
				.contains(propiedadNoDisponible));
		
		//dentro del rango
		// todo el rango adentro
		assertFalse(this.sistema.buscarPropiedadesDisponibles(adentroRango)
				.contains(propiedadNoDisponible));
		//con el extremo derecho adentro
		assertFalse(this.sistema.buscarPropiedadesDisponibles(extremoDerechoDentro)
				.contains(propiedadNoDisponible));
		// con el extremo izquierdo adentro
		assertFalse(this.sistema.buscarPropiedadesDisponibles(extremoIzquierdoDentro)
				.contains(propiedadNoDisponible));
		
	}
	
	
	
	
}
