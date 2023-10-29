package Ejercicio15ReservasDeAlquiler.Ejercicio15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sistema {

	private List<Usuario> usuarios;//1..* ?
	private List<Propiedad> propiedades;//0..*
	
	public Sistema() {
		this.usuarios = new ArrayList<Usuario>();
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public List<Propiedad> buscarPropiedadesDisponibles(DateLapse periodo){
		return this.propiedades.stream()
				.filter(propiedad -> propiedad.estoyDisponible(periodo))
				.collect(Collectors.toList());
	}
	
	public Usuario registrarUusuario(String nombre,String direccion,String dni) {
		Usuario unUsuario = new Usuario(nombre,direccion,dni);
		this.usuarios.add(unUsuario);
		return unUsuario;
	}
	public Propiedad registrarPropiedad(String nombre,String descripcion,String direccion,double precioPorNoche,Usuario usuarioPropietario) {
		Propiedad unPropiedad = new Propiedad(nombre,descripcion,direccion,precioPorNoche);
		this.propiedades.add(unPropiedad);
		usuarioPropietario.registrarPropiedad(unPropiedad);
		return unPropiedad;
	}
	
	
	
	
	
	
	
	
	
	
}
