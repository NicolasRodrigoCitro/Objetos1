package ClienteDeCorreoConAdjunto.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	// adjunto no lo uso, no se porque me pidieron su implementacion
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos;
	
	public Email(String titulo,String cuerpo) {
		this.cuerpo=cuerpo;
		this.titulo=titulo;
		this.archivos= new ArrayList<>();
	}
	
	public void agregarArchivo(Archivo unArchivo) {
		this.archivos.add(unArchivo);
	}
	
	public boolean existeTexto(String texto) {
		return (this.getTitulo().equals(texto) || this.getCuerpo().equals(texto));
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	public List<Archivo> adjuntos(){
		return new ArrayList<>(this.archivos);
	}
	public int tamaño() {
		return this.getCuerpo().length() + this.getTitulo().length() +
				this.archivos.stream()
				.mapToInt(a -> a.tamaño())
				.sum();
	}

}
