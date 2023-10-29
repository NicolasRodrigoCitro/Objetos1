package Ejercicio15ReservasDeAlquiler.Ejercicio15;

import java.time.LocalDate;

public class Reserva {

	// reserva guarda precio por noche, para que quede un registro historico de los montos, cosa que pierdo si solo lo dejo en propiedad
	//private boolean estaReservado;
	private DateLapse cantidadDeNoches;
	private double precioPorNoche;
	
	public Reserva(DateLapse periodo,double precioPorNoche) {
		//this.estaReservado= true;
		this.cantidadDeNoches=periodo;
		this.precioPorNoche=precioPorNoche;
	}
	
	public boolean getEstaReservado(LocalDate fechaActual) {
		int num = fechaActual.compareTo(this.cantidadDeNoches.getFrom());
		if(num < 0)
			return true;
		else return false;
	}
	public boolean noEstaDentroDelPeriodo(DateLapse lapso) {
		//return this.cantidadDeNoches.overLaps(lapso.getFrom()) && this.cantidadDeNoches.overLaps(lapso.getTo()) ;
		return this.cantidadDeNoches.overLaps(lapso) ;
	}
	
	public double precioDeReserva(double precioPorNoche) {
		return this.precioPorNoche * this.cantidadDeNoches.sizeInDays() ;
	}	
	
	
}
