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
		this.facturas = new ArrayList<>();
		this.consumos = new ArrayList<>();
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
		if(this.ultimoConsumo()!=null)
			return this.ultimoConsumo().getConsumoDeEnergiaActiva();
		else
			return 0;
	}
	
	
	
	public Factura facturarEnBaseA(double precioKWh) {
		double descuento=0;
		Consumo ultimo = this.ultimoConsumo();
		if(ultimo == null) {
			return new Factura(0,0,this);
		}
		if(ultimo.factorDePotencia() > 0.8d) {
			//usuario binificado con el 10%
			 descuento = 10;
		}
		Factura factura = new Factura(ultimo.costoEnBaseA(precioKWh),descuento,this);
		this.facturas.add(factura);
		return factura;
	}
	
	public List<Factura> getFacturas() {
		return new ArrayList<>(this.facturas);
	}
	
	
	
	
	
}
