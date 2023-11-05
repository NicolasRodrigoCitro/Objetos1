package Ejercicio17LlamadasTelefonicas.Ejercicio17LlamadasTelefonicas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente  {
	
	private String nombre;
	private String direccion;
	private String dni;
	private NumeroTelefono numero;
	private List<Factura> facturas;
	
	
	public Cliente(String nombre, String direccion, String dni) {
		this.facturas = new ArrayList<>();
		this.nombre=nombre;
		this.direccion=direccion;
		this.dni=dni;
		this.numero=null; // dudas con este
	}

	public List<Factura> getFacturas() {
		return new ArrayList<>(this.facturas);
	}

	public void asignarNumero(NumeroTelefono unNumeroDeTelefono) {
		this.numero=unNumeroDeTelefono;
	}

}
