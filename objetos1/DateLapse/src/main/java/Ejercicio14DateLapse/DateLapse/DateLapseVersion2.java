package Ejercicio14DateLapse.DateLapse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class DateLapseVersion2 implements Lapse{
	
	private LocalDate from;
	private int sizeInDays;
	
	
	
	
	public DateLapseVersion2(LocalDate from,int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	//“Retorna la fecha de inicio del rango”
	public LocalDate getFrom() {
		return this.from;
	}
	public LocalDate getTo() {
		return this.getFrom().plusDays(this.sizeInDays());
	}
	

	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	@Override
	public boolean includesDate(LocalDate other) {
		return (other.equals(this.getFrom()) ||
				other.isAfter(this.getFrom())) &&
				(other.equals(this.getTo()) ||
						other.isBefore(this.getTo()));
	}

	

	

}
