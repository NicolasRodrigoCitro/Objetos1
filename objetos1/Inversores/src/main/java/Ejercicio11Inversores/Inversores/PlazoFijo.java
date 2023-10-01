package Ejercicio11Inversores.Inversores;

import java.time.LocalDate;

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
		double cantidadDias = LocalDate.now().toEpochDay() - this.fechaDeConstitucion.toEpochDay();
		return cantidadDias * ((this.getMontoDepositado() * this.getPorcentajeDeInteresDiario() / 100) + this.getMontoDepositado());
	}


}
