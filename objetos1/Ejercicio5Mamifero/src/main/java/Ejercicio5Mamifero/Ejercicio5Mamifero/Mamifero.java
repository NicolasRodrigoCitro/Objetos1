package Ejercicio5Mamifero.Ejercicio5Mamifero;

import java.time.LocalDate;

public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;

	public Mamifero() {

	}

	public Mamifero(String nombre) {
		this.identificador = nombre;
	}

	public Mamifero(String identificador, String especie, LocalDate fecha, Mamifero madre, Mamifero padre) {
		this.identificador = identificador;
		this.especie = especie;
		this.madre = madre;
		this.padre = padre;
		this.fechaNacimiento = fecha;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getAbueloMaterno() {
		if (this.comprobarMamifero(this.madre))
			return this.madre.getPadre();
		else
			return null;
	}

	public Mamifero getAbueloPaterno() {
		if (this.comprobarMamifero(this.padre))
			return this.padre.getPadre();
		else
			return null;
	}

	public Mamifero getAbuelaMaterna() {
		if (this.comprobarMamifero(this.madre))
			return this.madre.getMadre();
		else
			return null;
	}

	public Mamifero getAbuelaPaterna() {
		if (this.comprobarMamifero(this.padre))
			return this.padre.getMadre();
		else
			return null;
	}

	private boolean comprobarMamifero(Mamifero unMamifero) {
		if (unMamifero != null)
			return true;
		else
			return false;
	}

	/*
	 * public boolean tieneComoAncestroA(Mamifero unMamifero) { if
	 * (this.padre.equals(unMamifero) || (this.padre.equals(unMamifero))) { return
	 * true; } else { if (this.madre != null)
	 * this.madre.tieneComoAncestroA(unMamifero); if (this.padre != null)
	 * this.padre.tieneComoAncestroA(unMamifero); } return false; }
	 */
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean cumple = false;
		//if (!cumple) {
		if(!this.equals(unMamifero)) {
			if (this.comprobarMamifero(this.padre)) {
				if (this.padre.equals(unMamifero)) {
					 cumple = true;
				} else {
					this.padre.tieneComoAncestroA(unMamifero);
				}
			}
			if (this.comprobarMamifero(this.madre)) {
				if (this.madre.equals(unMamifero)) {
					 cumple = true;
				} else {
					this.madre.tieneComoAncestroA(unMamifero);
				}
			}
		}else
			cumple=false;
	//	}
		return cumple;
	}

}