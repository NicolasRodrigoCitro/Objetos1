package ClienteDeCorreoConAdjunto.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	
	private Carpeta inBox;
	private List<Carpeta> carpetas;
	
	
	//Consultar el metodo buscar 
	
	public ClienteDeCorreo() {
		this.inBox=new Carpeta("inBox");
		this.carpetas=new ArrayList<>();
		this.carpetas.add(inBox);
	}
	
	public Carpeta getCarpeta(String unNombreCarpeta) {
		return this.carpetas.stream().
				filter(c -> c.getNombre().equals(unNombreCarpeta))
				.findFirst()
				.orElse(null);
	}
	
	public void recibir(Email email) {
		this.inBox.agregarEmail(email);
	}
	public void mover(Email mail, Carpeta origen,Carpeta destino) {
		destino.agregarEmail(mail);
		origen.eliminarEmail(mail);
	}
	
	public void agregarCarpeta(Carpeta unCarpeta) {
		this.carpetas.add(unCarpeta);
	}
	
	 public Email buscar(String texto) {
    return this.carpetas.stream()
            .map(carpeta -> carpeta.buscar(texto)) // Utiliza el método buscar de cada carpeta
            .filter(email -> email != null) // Filtra los resultados no nulos
            .findFirst()
            .orElse(null); // Devuelve null si no se encontró ningún Email
}

	
	public int espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(c -> c.tamaño()).sum();
	}
	
	
}
