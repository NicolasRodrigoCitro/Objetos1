package Ejercicio17LlamadasTelefonicas.Ejercicio17LlamadasTelefonicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<Cliente> clientes;
	private List<NumeroTelefono> numerosDisponibles;
	private List<NumeroTelefono> numerosNoDisponibles;

	public Sistema() {
		this.numerosDisponibles = new ArrayList<NumeroTelefono>();
		this.numerosNoDisponibles = new ArrayList<NumeroTelefono>();
		this.clientes = new ArrayList<>();
	}

	public List<Cliente> getClientes() {
		return new ArrayList<>(this.clientes);
	}

	/*
	 * Agregar un número a la lista de números disponibles. Se provee un número de
	 * teléfono. El sistema lo agrega a la lista de números telefónicos disponibles.
	 * Asuma que el número de teléfono que se provee es nuevo (nunca fue utilizado).
	 */
	public void agregarTelefono(NumeroTelefono numero) {
		this.numerosDisponibles.add(numero);
	}

	/*
	 * Agregar un número a la lista de números disponibles. Se provee un número de
	 * teléfono. El sistema lo agrega a la lista de números telefónicos disponibles.
	 * Asuma que el número de teléfono que se provee es nuevo (nunca fue utilizado).
	 */

	public void darAltaCliente(Cliente unCliente) {
		this.clientes.add(unCliente);
		NumeroTelefono unNumeroDeTelefono = this.getNumeroDisponible();
		// Asumo que hay simpre un numero disponible
		unCliente.asignarNumero(unNumeroDeTelefono);

	}

	private NumeroTelefono getNumeroDisponible() {
		NumeroTelefono unNumeroDeTelefono = this.numerosDisponibles.stream().findAny().orElse(null);
		this.numerosNoDisponibles.add(unNumeroDeTelefono);
		this.numerosDisponibles.remove(unNumeroDeTelefono);
		return unNumeroDeTelefono;
	}

	public Factura generarFactura(Cliente cliente, LocalDate inicioPeriodo, LocalDate finPeriodo) {

		return null;
	}

}
