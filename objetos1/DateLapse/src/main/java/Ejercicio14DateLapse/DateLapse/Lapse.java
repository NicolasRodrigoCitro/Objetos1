package Ejercicio14DateLapse.DateLapse;

import java.time.LocalDate;

public interface Lapse {

	 public LocalDate getFrom();
	 public LocalDate getTo();
	 public int sizeInDays();
	 public boolean includesDate(LocalDate other);
}
