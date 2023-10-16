package Ejercicio11Inversores.Inversores;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado,double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion=fechaDeConstitucion;
		this.montoDepositado=montoDepositado;
		this.porcentajeDeInteresDiario=porcentajeDeInteresDiario;
	}
	
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}


	public double getMontoDepositado() {
		return montoDepositado;
	}


	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}


	@Override
	public double valorActual() {
		//double cantidadDias = LocalDate.now().toEpochDay() - this.fechaDeConstitucion.toEpochDay();
		
		double cantidadDias = ChronoUnit.DAYS.between(this.fechaDeConstitucion,LocalDate.of(2023, 9, 30));
		return cantidadDias * ((this.getMontoDepositado() * this.getPorcentajeDeInteresDiario() / 100) + this.getMontoDepositado());
	}


}
