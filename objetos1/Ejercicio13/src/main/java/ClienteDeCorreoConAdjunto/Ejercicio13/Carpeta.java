package ClienteDeCorreoConAdjunto.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {

	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre=nombre;
		this.emails=new ArrayList<>();
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	public void eliminarEmail(Email email) {
		this.emails.remove(email);
	}
	
	public Email buscar(String texto) {
		return this.emails.stream().
				filter(e -> e.existeTexto(texto))
				.findFirst()
				.orElse(null);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int tamaño() {
		return this.emails.stream().mapToInt(e -> e.tamaño())
				.sum() + this.getNombre().length();
	}
	
	
	
	
	
	
	

}
