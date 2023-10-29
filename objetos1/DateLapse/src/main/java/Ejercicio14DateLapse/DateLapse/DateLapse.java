package Ejercicio14DateLapse.DateLapse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateLapse implements Lapse{
	
	private LocalDate from;
	private LocalDate to;
	
	
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	//“Retorna la fecha de inicio del rango”
	public LocalDate getFrom() {
		return this.from;
	}
	
	//“Retorna la fecha de fin del rango”
	public LocalDate getTo() {
		return this.to;
	}
	
	//“retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
	public int sizeInDays() {
		return (int) ( this.getFrom().until(to,ChronoUnit.DAYS));
	}
	
	//“recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
	public boolean includesDate(LocalDate other) {
		return (other.equals(this.from) || other.isAfter(this.from)) && (other.equals(this.to) || other.isBefore(this.to));
	}

}
