package Ejercicio15ReservasDeAlquiler.Ejercicio15;

import java.time.LocalDate;

public interface Lapse {

	 public LocalDate getFrom();
	 public LocalDate getTo();
	 public int sizeInDays();
	 public boolean includesDate(LocalDate other);
	 public boolean overLaps(DateLapse anotherDateLapse);
}