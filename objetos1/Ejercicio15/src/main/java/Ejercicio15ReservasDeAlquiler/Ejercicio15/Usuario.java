package Ejercicio15ReservasDeAlquiler.Ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String dni;
	private String nombre;
	private String direccion;
	private List<Propiedad> propieades;

	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propieades = new ArrayList<>();
	}

	public double calcularIngresos(LocalDate inicio, LocalDate fin) {
		return 0;
	}

	public List<Reserva> obtenerReservas() {
		
		return null;
	}

	/* no necesito saber si es de mi propieadad, porque un usuario cualquiera puerde
	 * reservar cualquier propieadad
	private boolean esDeMiPropiedad(Propiedad propiedad) {
		Propiedad unPropiedad = this.propieades.stream()
				.filter(p -> p.equals(propiedad))
				.findFirst()
				.orElse(null);
		if (unPropiedad != null)
			return true;
		else
			return false;

	}*/

	public Reserva hacerReserva(Propiedad propiedad, DateLapse periodo) {
		return propiedad.hacerReserva(periodo);
	}

	public Propiedad registrarPropiedad(Propiedad unPropiedad) {
		this.propieades.add(unPropiedad);
		return unPropiedad;
	}

	

}
