package Ejercicio15ReservasDeAlquiler.Ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {

	
	private String nombre;
	private String descripcion;
	private String direccion;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	
	
	public Propiedad(String nombre,String descripcion,String direccion,double precioPorNoche) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.direccion=direccion;
		this.precioPorNoche=precioPorNoche;
		this.reservas = new ArrayList<>();
		
	}

	
	public boolean estoyDisponible(DateLapse periodo) {
		return this.reservas.stream()
				.allMatch(r -> r.noEstaDentroDelPeriodo(periodo) )
				|| this.reservas.isEmpty();
	}
	
	
	public List<Reserva> obtenerReservas(){
		return new ArrayList<>(this.reservas);
	}
	
	public void eliminarReserva(LocalDate fechaActual) {
		/*this.reservas.stream()
		.allMatch(r -> r.noEstaDentroDelPeriodo(periodo) );*/
	}
	public Reserva hacerReserva(DateLapse periodo) {
		if(this.estoyDisponible(periodo)) {
			Reserva unReserva = new Reserva(periodo,this.precioPorNoche);
			this.reservas.add(unReserva);
			return unReserva;
		}else return null;
		
	}
	
	
}
