package Ejercicio5Mamifero.Ejercicio6RedDeAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendido;
	private List<Farola> farolas;

	public Farola() {
		this.encendido = false;
		this.farolas = new ArrayList<>();
	}

	public boolean isOn() {
		return this.encendido;
	}

	public Object getNeighbors() {
		return new ArrayList<>(this.farolas);
	}

	private boolean comprobarVecino(Farola farolaDos) {
		// retorna si la farola recibida por parametro ya existe en la coleccion.
		//return this.farolas.equals(farolaDos);
		return this.farolas.stream().filter(f -> f.equals(farolaDos)).findFirst();
	}

	public void pairWithNeighbor(Farola farolaDos) {
		if (!comprobarVecino(farolaDos)) {
			this.farolas.add(farolaDos);
			farolaDos.pairWithNeighbor(this);
		}

	}
// consultar con el ayudante
	public void turnOn() {
		if (!this.encendido) {
			this.encendido = true;
			for (Farola f: this.farolas) {
				f.turnOn();
			}
		}

	}

	public void turnOff() {
		if (this.encendido) {
			this.encendido = true;
			for (Farola f: this.farolas) {
				f.turnOff();
			}
		}

	}

}
