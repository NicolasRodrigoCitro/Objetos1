package ClienteDeCorreoConAdjunto.Ejercicio13;

public class Archivo {
	
	
	private String nombre;
	
	public Archivo(String unNombreDeArchivo) {
		this.nombre=unNombreDeArchivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int tamaño() {
		return this.getNombre().length();
	}
}
