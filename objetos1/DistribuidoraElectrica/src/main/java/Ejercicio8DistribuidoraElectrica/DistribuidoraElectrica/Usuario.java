package Ejercicio8DistribuidoraElectrica.DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	
	public String getNombre() {
		return this.nombre;
	}
	public String getDomicilio() {
		return this.domicilio;
	}
	public Usuario(String nombre, String domicilio) {
		this.nombre=nombre;
		this.domicilio=domicilio;
	}
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public Consumo ultimoConsumo() {
		return this.consumos.stream()
	            .max((consumo1, consumo2) -> consumo1.getFecha().compareTo(consumo2.getFecha()))      
	            .orElse(null); // Devuelve null si la lista de consumos está vacía
	}
	public double ultimoConsumoActiva() {
		return this.ultimoConsumo().getConsumoDeEnergiaActiva();
	}
	
	
	
	public Factura facturarEnBaseA(double precioKWh) {
		double fdp = this.ultimoConsumo().factorDePotencia();
		double costo = this.ultimoConsumo().costoEnBaseA(precioKWh);
		if(fdp > 0.8) {
			//usuario binificado con el 10%
			costo= costo * 0.90;
			return new Factura(costo,0.10,this);
		}else
			return new Factura(costo,0,this);
		
	}
	
	public List<Factura> facturas() {
		return new ArrayList<>(this.facturas);
	}
	
	
	
	
	
}
