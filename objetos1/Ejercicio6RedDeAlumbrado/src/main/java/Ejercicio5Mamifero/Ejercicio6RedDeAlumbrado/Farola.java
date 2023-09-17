package Ejercicio5Mamifero.Ejercicio6RedDeAlumbrado;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;

public class Farola {
	private boolean encendido;
	private Set<Farola> farolas;
	
	public Farola() {
		this.encendido=false;
		this.farolas= new HashSet<>();
	}
	public boolean isOn() {
		return this.encendido;
	}
	public Object getNeighbors() {
		return new HashSet<>(this.farolas);
	}
	private boolean comprobarVecino(Farola farolaDos) {
		//retorna si la farola recibida por parametro ya existe en la coleccion.
		return this.farolas.equals(farolaDos);
	}
	public void pairWithNeighbor(Farola farolaDos) {
		if(!comprobarVecino(farolaDos)) {
			this.farolas.add(farolaDos);
			farolaDos.pairWithNeighbor(this);
		}
				
	}
	public void turnOn() {
		if(!this.encendido) {
			this.encendido=true;
			this.farolas.stream().turnOn();
			
		}
		
	}
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
	
}
